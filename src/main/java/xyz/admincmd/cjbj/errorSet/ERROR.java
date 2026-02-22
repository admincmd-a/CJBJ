package xyz.admincmd.cjbj.errorSet;

import java.util.Date;

/**
 * 本类用于定义错误信息的结构。
 */
public class ERROR {
    private final String MESSAGE;
    private final int CODE;
    private final int LEVEL;
    private final int EXIT_CODE;
    private final Date TIME;
    private final Class<?> CLASS;

    /* 内部错误 */
    public static final int ERROR_CODE_UNKNOWN = 0; // 内部错误
    /* 警告 */
    public static final int ERROR_CODE_WARN = 1;
    /* 致命错误 */
    public static final int ERROR_CODE_FATAL = 2;
    /* 灾难性错误*/
    public static final int ERROR_CODE_CRITICAL = 3;

    /**
     * 错误信息的构造函数。
     * @param errorMessage 错误信息
     * @param errorCode 错误代码
     * @param errorLevel 错误等级
     * @param exitCode 退出代码
     */
    public ERROR(String errorMessage, int errorCode,Class<?> errorCLASS , int errorLevel, int exitCode) {
        MESSAGE = errorMessage;
        CODE = errorCode;
        LEVEL = errorLevel;
        CLASS = errorCLASS;
        EXIT_CODE = exitCode;
        TIME = new Date();
    }

    /**
     * 错误信息的构造函数。
     * @param errorMessage 错误信息
     * @param errorCode 错误代码
     * @param errorLevel 错误等级
     */
    public ERROR(String errorMessage, int errorCode, int errorLevel) {
        MESSAGE = errorMessage;
        CODE = errorCode;
        LEVEL = errorLevel;
        CLASS = null;
        EXIT_CODE = -225;
        TIME = new Date();
    }


    public int getCODE() {
        return CODE;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public int getLEVEL() {
        return LEVEL;
    }

    public String getLEVELtoString(int LEVEL) {
        return switch (LEVEL) {
            case 0 -> "UNKNOWN";
            case 1 -> "WARN";
            case 2 -> "FATAL";
            case 3 -> "CRITICAL";
            default -> LEVEL + "";
        };
    }

    public Date getTIME() {
        return TIME;
    }

    public int getEXIT_CODE() {
        return EXIT_CODE;
    }

    public Class<?> getCLASS() {return CLASS;}

    public String toString() {
        return TIME +" ["+CLASS+"]"+getLEVELtoString(LEVEL)+"("+CODE+"/"+EXIT_CODE+"): "+MESSAGE;
    }
}
