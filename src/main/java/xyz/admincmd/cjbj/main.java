/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package xyz.admincmd.cjbj;

import com.sun.jna.platform.win32.User32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.admincmd.cjbj.block.ModBlock;
import xyz.admincmd.cjbj.inc.message;
import xyz.admincmd.cjbj.item.ModItem;
import xyz.admincmd.cjbj.item.groups.ModItemGroups;
import xyz.admincmd.cjbj.inc.message.*;
import java.awt.*;

/**
 *
 * @author Administrator
 */
public class main {

    public static final String MOD_ID = "cjbj2";
    public static final String MOD_NAME = "城建不建";
    public static final String MOD_VERSION = "0.0.1.0";

    public static final Logger CONSOLE = LoggerFactory.getLogger(MOD_ID);

    public static Boolean isDebug = false;
    public static Boolean isGUI = GraphicsEnvironment.isHeadless();
    public static final Boolean isOcCode = false;

    static {
        System.loadLibrary("user32");
    }

    public static void main(String[] args) {


    }

    public static void init() {
        CONSOLE.info("""
				.
				========================================
				{} 开始初始化...
				   ____       _   ____        _\s
				  / ___|     | | | __ )      | |
				 | |      _  | | |  _ \\   _  | |
				 | |___  | |_| | | |_) | | |_| |
				  \\____|  \\___/  |____/   \\___/
				.
				----------------------------------------
				版本： {}
				
				""",MOD_NAME ,MOD_VERSION);


        CONSOLE.info("Hello Fabric world!");

//        message.MessageBoxA(0, "Hello Fabric world!", "提示", 16);

        if (isGUI) {
            CONSOLE.info("GUI Is Not");
        }

        ModBlock.initialize();//注册方块&物品
        ModItem.initialize();
        ModItemGroups.initialize();
//      MessageBox(0, "初始化成功", "成功", 16);


//		JOptionPane.showMessageDialog(
//				null,
//				"Failed to register block: "
//						+ "path"
//						+ " , Class: "
//						+ "block.getClass().getName()"
//						+ " , Error: "
//						+ "e.getMessage(),",
//				"Error",
//				JOptionPane.ERROR_MESSAGE);


        CONSOLE.info("""
				城建不建 初始化完毕 =====================================""");

        if (isOcCode) { // 如果 OC 工作处于激活状态，则退出
            CONSOLE.info("OC 工作处于激活状态，退出");
            System.exit(0);
        }
    }
}
