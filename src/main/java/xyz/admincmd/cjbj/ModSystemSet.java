package xyz.admincmd.cjbj;

import static xyz.admincmd.cjbj.main.CONSOLE;

public class ModSystemSet {
    public static void exit(int code) {
        saveWorld();
        System.exit(code);
    }

    private static void saveWorld() {}
}
