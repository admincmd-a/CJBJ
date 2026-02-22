package xyz.admincmd.cjbj.errorSet;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;
import xyz.admincmd.cjbj.inc.WindowsErrorDialog;

/**
 *     若要指示消息框中显示的按钮，请指定以下值之一。
 * 值 	含义
 * <p>
 * MB_ABORTRETRYIGNORE
 * 0x00000002L
 * <p>
 * 	消息框包含三个按钮： “中止”、“ 重试”和 “忽略”。
 * <p>
 * MB_CANCELTRYCONTINUE
 * 0x00000006L
 * <p>
 * 	消息框包含三个按钮： 取消、 重试、 继续。 使用此消息框类型而不是MB_ABORTRETRYIGNORE。
 * <p>
 * MB_HELP
 * 0x00004000L
 * <p>
 * 	向消息框添加 “帮助 ”按钮。 当用户单击“ 帮助 ”按钮或按 F1 时，系统会向所有者发送 WM_HELP 消息。
 * <p>
 * MB_OK
 * 0x00000000L
 * <p>
 * 	消息框包含一个按钮： “确定”。 这是默认值。
 * <p>
 * MB_OKCANCEL
 * 0x00000001L
 * <p>
 * 	消息框包含两个按钮： “确定” 和 “取消”。
 * <p>
 * MB_RETRYCANCEL
 * 0x00000005L
 * <p>
 * 	消息框包含两个按钮： 重试 和 取消。
 * <p>
 * MB_YESNO
 * 0x00000004L
 * <p>
 * 	消息框包含两个按钮： “是 ”和“ 否”。
 * <p>
 * MB_YESNOCANCEL
 * 0x00000003L
 * <p>
 * 	消息框包含三个按钮： “是”、“ 否”和 “取消”。
 * <p>
 *
 * 若要在消息框中显示图标，请指定以下值之一。
 * 值 	含义
 * <p>
 * MB_ICONEXCLAMATION
 * 0x00000030L
 * <p>
 * 	消息框中会显示一个感叹号图标。
 * <p>
 * MB_ICONWARNING
 * 0x00000030L
 * <p>
 * 	消息框中会显示一个感叹号图标。
 * <p>
 * MB_ICONINFORMATION
 * 0x00000040L
 * <p>
 * 	消息框中将显示一个由圆圈中的小写字母 i 组成的图标。
 * <p>
 * MB_ICONASTERISK
 * 0x00000040L
 * <p>
 * 	消息框中将显示一个由圆圈中的小写字母 i 组成的图标。
 * <p>
 * MB_ICONQUESTION
 * 0x00000020L
 * <p>
 * 	消息框中会显示一个问号图标。 不再建议使用问号消息图标，因为这种图标无法清楚地表示特定类型的消息，并且作为问题的消息表述可应用于任何消息类型。 此外，用户可能会将问号消息符号与帮助信息混淆。 因此，不要在消息框中使用问号消息符号。 系统继续支持它包含的内容，只为满足反向兼容性。
 * <p>
 * MB_ICONSTOP
 * 0x00000010L
 * <p>
 * 	消息框中会显示一个停止符号图标。
 * <p>
 * MB_ICONERROR
 * 0x00000010L
 * <p>
 * 	消息框中会显示一个停止符号图标。
 * <p>
 * MB_ICONHAND
 * 0x00000010L
 * <p>
 * 	消息框中会显示一个停止符号图标。
 * <p>
 *
 * 若要指示默认按钮，请指定以下值之一。
 * 值 	含义
 * <p>
 * MB_DEFBUTTON1
 * 0x00000000L
 * <p>
 * 	第一个按钮是默认按钮。
 * <p>
 * 除非 指定了 MB_DEFBUTTON2、 MB_DEFBUTTON3或MB_DEFBUTTON4，否则 MB_DEFBUTTON1 为默认值。
 * <p>
 * MB_DEFBUTTON2
 * 0x00000100L
 * <p>
 * 	第二个按钮是默认按钮。
 * <p>
 * MB_DEFBUTTON3
 * 0x00000200L
 * <p>
 * 	第三个按钮是默认按钮。
 * <p>
 * MB_DEFBUTTON4
 * 0x00000300L
 * <p>
 * 	第四个按钮是默认按钮。
 * <p>
 *
 * 若要指示对话框的形式，请指定以下值之一。
 * 值 	含义
 * <p>
 * MB_APPLMODAL
 * 0x00000000L
 * <p>
 * 	用户必须先响应消息框，然后才能在 由 hWnd 参数标识的窗口中继续工作。 但是，用户可以移动到其他线程的窗口，并在这些窗口中工作。
 * <p>
 * 根据应用程序中窗口的层次结构，用户可能能够移动到线程中的其他窗口。 将自动禁用消息框父级的所有子窗口，但弹出窗口不会禁用。
 * <p>
 * 如果未指定MB_SYSTEMMODAL或MB_TASKMODAL，则MB_APPLMODAL为默认值。
 * <p>
 * MB_SYSTEMMODAL
 * 0x00001000L
 * <p>
 * 	与MB_APPLMODAL相同，只是消息框具有 WS_EX_TOPMOST 样式。 使用系统模式消息框通知用户严重、潜在的破坏性错误，这些错误需要立即关注 (例如内存不足) 。 除了与 hWnd 关联的窗口之外，此标志不会影响用户与窗口交互的能力。
 * <p>
 * MB_TASKMODAL
 * 0x00002000L
 * <p>
 * 	与 MB_APPLMODAL相同， 但如果 hWnd 参数为 NULL，则禁用属于当前线程的所有顶级窗口。 当调用应用程序或库没有可用的窗口句柄，但仍需要阻止输入调用线程中的其他窗口而不挂起其他线程时，请使用此标志。
 * <p>
 *
 * 若要指定其他选项，请使用以下一个或多个值。
 * 值 	含义
 * <p>
 * MB_DEFAULT_DESKTOP_ONLY
 * 0x00020000L
 * <p>
 * 	与交互式窗口工作站的桌面相同。 有关详细信息，请参阅 窗口工作站。
 * <p>
 * 如果当前输入桌面不是默认桌面，则在用户切换到默认桌面之前 ，MessageBox 不会返回。
 * <p>
 * MB_RIGHT
 * 0x00080000L
 * <p>
 * 	文本右对齐。
 * <p>
 * MB_RTLREADING
 * 0x00100000L
 * <p>
 * 	在希伯来语和阿拉伯语系统上使用从右到左的阅读顺序显示消息和描述文字文本。
 * <p>
 * MB_SETFOREGROUND
 * 0x00010000L
 * <p>
 * 	消息框将成为前台窗口。 在内部，系统为消息框调用 SetForegroundWindow 函数。
 * <p>
 * MB_TOPMOST
 * 0x00040000L
 * 	使用 WS_EX_TOPMOST 窗口样式创建消息框。
 * <p>
 * MB_SERVICE_NOTIFICATION
 * 0x00200000L
 * <p>
 * 	调用方是通知用户某个事件的服务。 函数在当前活动桌面上显示一个消息框，即使没有用户登录到计算机也是如此。
 * <p>
 * 终端服务： 如果调用线程具有模拟令牌，则函数会将消息框定向到模拟令牌中指定的会话。
 * <p>
 * 如果设置了此标志， 则 hWnd 参数必须为 NULL。 这样，消息框就可以出现在与 hWnd 对应的桌面以外的桌面上。
 * <p>
 * 有关使用此标志的安全注意事项的信息，请参阅 Interactive Services。 具体而言，请注意，此标志可以在锁定的桌面上生成交互式内容，因此只应用于一组非常有限的方案，例如资源耗尽。
 * @author admincmd
 */
public class MsgWindowsW {
    public static final int TYPE_OK_BUTTON = 0x00000000;
    public static final int TYPE_OK_CANCEL_BUTTON = 0x00000001;
    public static final int TYPE_ABORT_RETRY_IGNORE_BUTTON = 0x00000002;
    public static final int TYPE_CANCEL_RETRY_RUN_BUTTON = 0x00000006;
    public static final int TYPE_YES_NO_CANCEL_BUTTON = 0x00000003;
    public static final int TYPE_YES_NO_BUTTON = 0x00000004;
    public static final int TYPE_RETRY_CANCEL_BUTTON = 0x00000005;
    public static final int TYPE_ADD_HELP_BUTTON = 0x00004000;

    public static final int TYPE_NULL_ICON = 0x00000000;
    public static final int TYPE_ERROR_ICON = 0x00000010;
    public static final int TYPE_WARNING_ICON = 0x00000020;
    public static final int TYPE_INFO_ICON = 0x00000040;
    public static final int TYPE_QUESTION_ICON = 0x00000030;

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
