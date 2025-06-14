package xyz.admincmd.cjbj.errorSet;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;
import xyz.admincmd.cjbj.inc.WindowsErrorDialog;

/**
 *     在对话框中显示信息，等待用户单击按钮，并返回一个整数告诉用户单击哪一个按钮。该整数为以下常量值之一： 0、#确认钮； 1、#取消钮； 2、#放弃钮； 3、#重试钮； 4、#忽略钮； 5、#是钮； 6、#否钮。如果对话框有“取消”按钮，则按下 ESC 键与单击“取消”按钮的效果相同。本命令为初级命令。
 *     参数<1>的名称为“提示信息”，类型为“通用型（all）”。提示信息只能为文本、数值、逻辑值或日期时间。如果提示信息为文本且包含多行，可在各行之间用回车符 (即“字符 (13)”)、换行符 (即“字符 (10)”) 或回车换行符的组合 (即：“字符 (13) + 字符 (10)”) 来分隔。
 *     参数<2>的名称为“按钮”，类型为“整数型（int）”，初始值为“0”。参数值由以下几组常量值组成，在将这些常量值相加以生成参数值时，每组值只能取用一个数字（第五组除外）：
 *   第一组（描述对话框中显示按钮的类型与数目）：
 *     0、#确认钮； 1、#确认取消钮； 2、#放弃重试忽略钮； 3、#取消是否钮；     4、#是否钮； 5、#重试取消钮
 *   第二组（描述图标的样式）：
 *     16、#错误图标； 32、#询问图标； 48、#警告图标； 64、#信息图标
 *   第三组（说明哪一个按钮是缺省默认值）：
 *     0、#默认按钮一； 256、#默认按钮二； 512、#默认按钮三； 768、#默认按钮四
 *   第四组（决定如何等待消息框结束）：
 *     0、#程序等待； 4096、#系统等待
 *   第五组（其它）：
 *     65536、#位于前台； 524288、#文本右对齐
 * @author admincmd
 */
public class MsgWindowsW {
    public static final int TYPE_OK_BUTTON = 0x00000000;
    public static final int TYPE_OK_CANCEL_BUTTON = 0x00000001;
    public static final int TYPE_ABORT_RETRY_IGNORE_BUTTON = 0x00000002;
    public static final int TYPE_YES_NO_CANCEL_BUTTON = 0x00000003;
    public static final int TYPE_YES_NO_BUTTON = 0x00000004;
    public static final int TYPE_RETRY_CANCEL_BUTTON = 0x00000005;

    public static final int TYPE_NULL_ICON = 0x00000000;
    public static final int TYPE_ERROR_ICON = 0x00000010;
    public static final int TYPE_WARNING_ICON = 0x00000020;
    public static final int TYPE_INFO_ICON = 0x00000040;

    public static final int TYPE_DEFAULT_BUTTON_1 = 0x00000000;
    public static final int TYPE_DEFAULT_BUTTON_2 = 0x00000100;
    public static final int TYPE_DEFAULT_BUTTON_3 = 0x00000200;
    public static final int TYPE_DEFAULT_BUTTON_4 = 0x00000300;

    public static final int TYPE_PROGRESS_PAUSE = 0x00001000;
    public static final int TYPE_SYSTEM_PAUSE = 0x00002000;

    public static final int TYPE_WINDOWS_DEFAULT_BUTTON = 0x00010000;
    public static final int TYPE_WINDOWS_TEXT_RIGHT = 0x00020000;

    public static final int TYPE_BUTTON_OK = 0x00000000;
    public static final int TYPE_BUTTON_CANCEL = 0x00000001;
    public static final int TYPE_BUTTON_ABORT = 0x00000002;
    public static final int TYPE_BUTTON_RETRY = 0x00000003;
    public static final int TYPE_BUTTON_IGNORE = 0x00000004;
    public static final int TYPE_BUTTON_YES = 0x00000005;
    public static final int TYPE_BUTTON_NO = 0x00000006;

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
                TYPE_ERROR_ICON | TYPE_OK_BUTTON
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
    public static int msgWindows(String message, String title, int uType) {
        return WindowsErrorDialog.User32.INSTANCE.MessageBoxW(null, message, title, uType);
    }
}
