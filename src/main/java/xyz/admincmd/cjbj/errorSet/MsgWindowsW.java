package xyz.admincmd.cjbj.errorSet;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;
import xyz.admincmd.cjbj.inc.WindowsErrorDialog;

public class MsgWindowsW {
    public static final int TYPE_NULL_CODE = 0;
    public static final int TYPE_ERROR_CODE = 16;
    public static final int TYPE_WARNING_CODE = 32;
    public static final int TYPE_INFO_CODE = 64;

    public static final int TYPE_OK_BUTTON = 0;

    public interface User32 extends StdCallLibrary {
        WindowsErrorDialog.User32 INSTANCE = Native.load("user32", WindowsErrorDialog.User32.class);

        // 使用Unicode版本的MessageBoxW
        int MessageBoxW(
                WinDef.HWND hWnd,
                String lpText,
                String lpCaption,
                int uType
        );
    }


    public static void showErrorDialog(String title, String message) {
        WindowsErrorDialog.User32.INSTANCE.MessageBoxW(
                null,
                message,
                title,
                TYPE_ERROR_CODE | TYPE_OK_BUTTON
        );
    }

    /**
     * 显示 MsgWindows 消息框
     * @param hWnd 父窗口句柄
     * @param message 消息内容
     * @param title 窗口标题
     * @param uType 类型控制，详见 MSDN
     * @see <a href="https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-messageboxw">MessageBoxW function</a>
     */
    public static void msgWindows(WinDef.HWND hWnd, String message, String title, int uType) {
        WindowsErrorDialog.User32.INSTANCE.MessageBoxW(hWnd, message, title, uType);
    }
    /**
     * 显示 MsgWindows 消息框
     * @param message 消息内容
     * @param title 窗口标题
     * @param uType 类型控制，详见 MSDN
     * @see <a href="https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-messageboxw">MessageBoxW function</a>
     */
    public static void msgWindows(String message, String title, int uType) {
        WindowsErrorDialog.User32.INSTANCE.MessageBoxW(null, message, title, uType);
    }
}
