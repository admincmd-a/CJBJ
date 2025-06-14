package xyz.admincmd.cjbj;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Util;
import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;

import java.util.concurrent.TimeUnit;

import static xyz.admincmd.cjbj.main.CONSOLE;

public class ModSystemGet {
    private static MinecraftServer serverInstance;

    public void exit(int code) {
        saveWorld(serverInstance);
        System.exit(code);
    }

    public void initialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            serverInstance = server;
            setupCrashHandler();
        });
    }

    private void setupCrashHandler() {
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            if (serverInstance != null && serverInstance.isRunning()) {
                saveWorld(serverInstance);
            }

            // 创建崩溃报告
            CrashReport report = CrashReport.create(throwable, "Mod triggered crash with save");
            System.err.println(report.asString());

            // 使用Minecraft的崩溃处理
            throw new CrashException(report);
        });
    }

    private void saveWorld(MinecraftServer server) {
        try {
            // 保存所有世界和玩家数据
            server.save(true, true, true);

            // 确保数据写入磁盘
            Util.getIoWorkerExecutor().shutdown();
            if (!Util.getIoWorkerExecutor().awaitTermination(5, TimeUnit.SECONDS)) {
                System.err.println("World save timeout! Data may be incomplete.");
            }
        } catch (Exception e) {
            System.err.println("Failed to save during crash:");
            e.printStackTrace();
        }
    }

    // 客户端专用方法
    @Environment(EnvType.CLIENT)
    private static void clientOnlyMethod() {
        // 这里放客户端专用代码
    }
}
