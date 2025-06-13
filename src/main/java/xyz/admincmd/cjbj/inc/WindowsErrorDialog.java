package xyz.admincmd.cjbj.inc;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

import javax.xml.crypto.Data;

public class WindowsErrorDialog {



    public interface User32 extends StdCallLibrary {
        User32 INSTANCE = Native.load("user32", User32.class);

        // 使用Unicode版本的MessageBoxW
        int MessageBoxW(
                WinDef.HWND hWnd,
                String lpText,
                String lpCaption,
                int uType
        );
    }

    public static final int MB_ICONERROR = 0x00000010;
    public static final int MB_OK = 0x00000000;

    public static void showErrorDialog(String title, String message) {
        User32.INSTANCE.MessageBoxW(
                null,
                message,
                title,
                MB_OK | MB_ICONERROR
        );
    }

    public static void main(String[] args) {
        System.setProperty("jna.encoding", "UTF-16LE");
        // 测试弹窗
        showErrorDialog(
                "Type Error 东似乎",
                """
                        ERROR:
                        Java Virtual Machine cannot allocate memory.
                        Please check the available memory and try again.
                        at java.lang.Thread.run(Thread.java:748)
                        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
                        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
                        at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:297)
                        at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180)
                        at java.util.concurrent.ScheduledThreadPoolExecutor.execute(ScheduledThreadPoolExecutor.java:211)
                        at java.util.concurrent.Executors$DelegatedExecutorService.execute(Executors.java:668)
                        at java.util.concurrent.FutureTask.runAndReset(FutureTask.java:308)
                        at java.util.concurrent.FutureTask.run(FutureTask.java:138)
                        at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293)
                        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
                        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
                        at java.lang.Thread.run(Thread.java:748)\n
                        """ +
        );
    }


}