package xyz.admincmd.cjbj.errorSet;

import static xyz.admincmd.cjbj.errorSet.ERROR.*;
import static xyz.admincmd.cjbj.errorSet.MsgWindowsW.*;
import static xyz.admincmd.cjbj.main.CONSOLE;

public class errorSet {
    private static ERROR[] errors;
    /**
     * 记录一个新的异常
     * @param errorMessage 错误消息
     * @param errorCode 错误代码
     * @param errorLevel 错误等级
     * @return {@code false}
     */
    public static boolean addError(String errorMessage, int errorCode, int errorLevel) {
        return addError(new ERROR(errorMessage, errorCode, errorLevel));
    }


    /**
     * 记录一个新的异常
     * @param errorMessage 错误消息
     * @param errorCode 错误代码
     * @param errorLevel 错误等级
     * @param args 格式化参数
     * @return {@code false}
     */
    public static boolean addError(int errorCode, int errorLevel, String errorMessage, Object... args) {
        return addError(new ERROR(String.format(errorMessage, args), errorCode, errorLevel));
    }

//    public static boolean addError(String errorMessage, int errorCode, int errorLevel, Throwable e) {
//        return addError(new ERROR(errorMessage, errorCode, errorLevel, e));
//    }
    /**
     * 记录一个新的异常，并退出系统
     * @param errorMessage 错误消息
     * @param errorCode 错误代码
     * @param errorLevel 错误等级
     * @param exitCode 退出代码，若为{@code 0}则由返回后代码处理
     * @return {@code false}
     */
    public static boolean addError(String errorMessage, int errorCode, int errorLevel, int exitCode) {
        if (errorLevel == ERROR_CODE_CRITICAL) {// 致命错误
            CONSOLE.error("Error(CRITICAL): '{}' ,Code: '{}' ,SystemExitCode: '{}'", errorMessage, errorCode, exitCode);
            msgWindows(errorMessage, String.valueOf(errorCode), TYPE_ERROR_CODE | TYPE_OK_BUTTON);
            if (exitCode != 0) {// 非正常退出
                System.exit(exitCode);
            }
            return false;// 由其他代码决定后续操作
        } else {
            return addError(new ERROR(errorMessage, errorCode, errorLevel));
        }
    }

    /**
     * 记录一个新的异常
     * @param error 异常对象
     * @return {@code false}
     */
    public static boolean addError(ERROR error) {
        switch (error.getLEVEL()) {
            case ERROR_CODE_UNKNOWN -> {}
            case ERROR_CODE_WARN -> CONSOLE.error("Error(WARN): '{}' ,Code: '{}'", error.getMESSAGE(), error.getCODE());
            case ERROR_CODE_FATAL -> {
                CONSOLE.error("Error(FATAL): '{}' ,Code: '{}'", error.getMESSAGE(), error.getCODE());
                msgWindows(error.getMESSAGE(), String.valueOf(error.getCODE()), TYPE_ERROR_CODE | TYPE_OK_BUTTON);
            }
            case ERROR_CODE_CRITICAL -> addError(error.getMESSAGE(), error.getCODE(), ERROR_CODE_CRITICAL, error.getEXIT_CODE());
            default -> addError(error.getMESSAGE(), error.getCODE(), ERROR_CODE_CRITICAL, -5265);

        }
        errors[errors.length - 1] = error;
        return false;
    }


    public static void clearErrors() {
        errors = new ERROR[0];
    }

    public static ERROR[] getErrors() {
        return errors;
    }

    public static boolean printFileErrors() {
        if (errors.length == 0) {
            return false;
        }

        return false;
    }
}
