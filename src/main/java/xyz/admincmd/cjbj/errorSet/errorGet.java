package xyz.admincmd.cjbj.errorSet;

import java.util.Objects;

import static xyz.admincmd.cjbj.errorSet.ERROR.*;
import static xyz.admincmd.cjbj.errorSet.ERROR.ERROR_CODE_CRITICAL;
import static xyz.admincmd.cjbj.errorSet.MsgWindowsW.*;
import static xyz.admincmd.cjbj.main.CONSOLE;

public class errorGet {

    private  ERROR[] errors;

    // 错误存储和处理的接口（可根据实际需求实现）
    public interface ErrorStore {
        void store(ERROR error);
    }

    private  ErrorStore errorStore = new ConsoleErrorStore(); // 默认实现

    /**
     * 设置自定义错误存储
     */
    public  void setErrorStore(ErrorStore store) {
        errorStore = Objects.requireNonNull(store, "ErrorStore cannot be null");
    }


    /**
     * 记录一个新的异常（支持多种格式化方式）
     *
     * @param errorCode    错误代码
     * @param errorLevel   错误等级
     * @param errorMessage 错误消息（支持 {} 或 %s 占位符）
     * @param args         格式化参数
     * @return {@code false} 总是返回false，便于在return语句中使用
     */
    public  boolean addError(int errorCode, int errorLevel, String errorMessage, Object... args) {
        return addSetError(errorCode, errorLevel, -1, errorMessage, args);
    }

    /**
     * 记录一个新的异常（支持多种格式化方式）
     *
     * @param errorCode    错误代码
     * @param errorLevel   错误等级
     * @param errorMessage 错误消息（支持 {} 或 %s 占位符）
     * @param args         格式化参数
     * @return {@code false} 总是返回false，便于在return语句中使用
     */
    public  boolean addError(int errorCode, int errorLevel, int exitCode, Class<? extends Exception> errorClass, String errorMessage, Object... args) {
        return addSetError(errorCode, errorLevel, exitCode, errorMessage, args);
    }

    private  boolean addSetError(int errorCode, int errorLevel, int exitCode, String errorMessage, Object[] args) {
        // 格式化错误消息（支持 {} 和 %s 两种占位符）
        String formatted = formatErrorMessage(errorMessage, args);

        // 创建错误记录
        ERROR error = new ERROR(formatted, errorCode, errorLevel, exitCode);

        errorStore.store(error);

        switch (error.getLEVEL()) {
            case ERROR_CODE_UNKNOWN -> {
                CONSOLE.warn("Error(UNKNOWN): '{}' ,Code: '{}'", formatted, error.getCODE());
            }
            case ERROR_CODE_WARN -> {
                CONSOLE.error("Error(WARN): '{}' ,Code: '{}'", formatted, error.getCODE());
            }
            case ERROR_CODE_FATAL -> {
                CONSOLE.error("Error(FATAL): '{}' ,Code: '{}'", formatted, error.getCODE());
                if ((msgWindows("""
                                运行时出错
                                
                                """+ formatted + """
                    
                    
                    要继续运行，请单击“确定”按钮。
                    要终止程序，请单击“取消”按钮。
                    """, String.valueOf(error.getCODE()), TYPE_ERROR_ICON | TYPE_OK_CANCEL_BUTTON)) == TYPE_BUTTON_OK) {
                    CONSOLE.info("在上一个错误发生后，用户取消了程序的运行。");

                } else {
                    CONSOLE.info("在上一个错误发生后，用户选择了继续运行程序。");
                }
            }
            case ERROR_CODE_CRITICAL -> {
                // 输出到控制台
                System.err.print("Error(CRITICAL): '" + formatted + "' ,Code: '" + errorCode + "' ,SystemExitCode: '" + error.getEXIT_CODE() + "'");
                msgWindows("""
                        运行时出错
                        
                        """ + formatted + """
                    
                    
                    要终止程序，请单击“确定”按钮。""", "灾难性错误"/*String.valueOf(errorCode)*/, TYPE_ERROR_ICON | TYPE_OK_BUTTON);
                if (error.getEXIT_CODE() != 0) { // 非正常退出
                    throw new CjbjModError(formatted);
                }
                return false;
            }
            default -> {
                CONSOLE.warn("WARNING: Unknown error level: '{}'", error.getLEVEL());
                CONSOLE.error("Error(NULL): '{}' ,Code: '{}'", error.getMESSAGE(), error.getCODE());
            }
        }
        return false;
    }

    /**
     * 记录一个新的异常
     *
     * @param errorMessage 错误消息
     * @param errorCode    错误代码
     * @param errorLevel   错误等级
     * @return {@code false}
     */
    public  boolean addError(String errorMessage, int errorCode, int errorLevel) {
        return addError(new ERROR(errorMessage, errorCode, errorLevel));
    }

    /**
     * 记录一个新的异常，并退出系统
     * @param errorMessage 错误消息
     * @param errorCode    错误代码
     * @param errorLevel   错误等级
     * @param exitCode     退出代码，若为{@code 0}则由返回后代码处理
     * @return {@code false}
     */
    public  boolean addError(String errorMessage, int errorCode, int errorLevel, int exitCode) {
        return addError(errorCode, errorLevel, errorMessage, ERROR_CODE_CRITICAL);
    }

    /**
     * 记录一个新的异常
     * @param error 异常对象
     * @return {@code false}
     */
    public  boolean addError(ERROR error) {
        return addError(error.getMESSAGE(), error.getCODE(), error.getLEVEL(), error.getEXIT_CODE());
    }


    /**
     * 智能格式化错误消息（同时支持 {} 和 %s 占位符）
     */
    private  String formatErrorMessage(String template, Object... args) {
        if (args == null || args.length == 0) {
            return template;
        }

        // 如果使用 %s 占位符
        if (template.contains("%s")) {
            return String.format(template, args);
        }

        // 如果使用 {} 占位符
        if (template.contains("{}")) {
            return formatWithBraces(template, args);
        }

        // 没有占位符，直接拼接参数
        StringBuilder sb = new StringBuilder(template);
        for (Object arg : args) {
            sb.append(" ").append(arg);
        }
        return sb.toString();
    }

    /**
     * 格式化消息，支持 {} 和 %s 占位符
     * @param template 消息模板
     * @param args 格式化参数
     * @return 格式化后的消息
     */
    public  String formatMessage(String template, Object... args) {
        return formatErrorMessage(template, args);
    }

    /**
     * 使用 {} 占位符格式化消息
     */
    private  String formatWithBraces(String template, Object... args) {
        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        int argIndex = 0;
        int braceIndex;

        while (argIndex < args.length && (braceIndex = template.indexOf("{}", lastIndex)) != -1) {
            // 添加占位符前的文本
            result.append(template, lastIndex, braceIndex);

            // 添加参数
            result.append(args[argIndex++]);

            // 跳过占位符
            lastIndex = braceIndex + 2;
        }

        // 添加剩余文本
        if (lastIndex < template.length()) {
            result.append(template.substring(lastIndex));
        }

        // 如果还有剩余参数，追加到末尾
        if (argIndex < args.length) {
            result.append(" [Extra args: ");
            for (int i = argIndex; i < args.length; i++) {
                result.append(args[i]);
                if (i < args.length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
        }

        return result.toString();
    }

    /**
     * 默认错误存储实现（输出到控制台）
     */
    private  class ConsoleErrorStore implements ErrorStore {
        @Override
        public void store(ERROR error) {
            CONSOLE.error(error.toString());
        }
    }

    public  void clearErrors() {
        errors = new ERROR[0];
    }

    public  ERROR[] getErrors() {
        return errors;
    }

    public  ErrorStore getErrorStore() {
        return errorStore;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public  boolean printFileErrors() {
        if (errors.length == 0) {
            return false;
        }

        return false;
    }
}
