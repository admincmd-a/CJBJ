package xyz.admincmd.cjbj.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.DoorBlock;
import xyz.admincmd.cjbj.block.custom.*;

import static net.minecraft.block.Blocks.OAK_DOOR;
import static net.minecraft.block.Blocks.OAK_PLANKS;
import static xyz.admincmd.cjbj.main.CONSOLE;
import static xyz.admincmd.cjbj.item.groups._var.MAIN_GROUP;
import static xyz.admincmd.cjbj.block.ModBlock.registerBlock;

public class _var {
    public static final String EXAMPLE_BLOCK_ID                       = "example_block";
    public static final String WARNING_SIGN_A_BLOCK_ID                = "warning_sign_a";
    public static final String WARNING_SIGN_B_BLOCK_ID                = "warning_sign_b";
    public static final String WARNING_SIGN_C_BLOCK_ID                = "warning_sign_c";
    public static final String WARNING_SIGN_D_BLOCK_ID                = "warning_sign_d";
    public static final String WARNING_SIGN_E_BLOCK_ID                = "warning_sign_e";
    public static final String WARNING_SIGN_F_BLOCK_ID                = "warning_sign_f";
    public static final String WARNING_SIGN_G_BLOCK_ID                = "warning_sign_g";
    public static final String WARNING_SIGN_H_BLOCK_ID                = "warning_sign_h";
    public static final String WARNING_SIGN_I_BLOCK_ID                = "warning_sign_i";
    public static final String WARNING_SIGN_J_BLOCK_ID                = "warning_sign_j";
//  public static final String WARNING_SIGN_K_BLOCK_ID                = "warning_sign_k";
    public static final String CABLE_TRAY_BLOCK_ID                    = "cable_tray";         //
    public static final String CABLE_TRAY_C01A_BLOCK_ID               = "cable_tray_c01a";    // 槽式直通
    public static final String CABLE_TRAY_C02A_BLOCK_ID               = "cable_tray_c02a";    // 水平弯通
    public static final String CABLE_TRAY_C03A_BLOCK_ID               = "cable_tray_c03a";    // 水平三通
    public static final String CABLE_TRAY_C05A_BLOCK_ID               = "cable_tray_c05a";    // 垂直下弯通
    public static final String CABLE_TRAY_C05B_BLOCK_ID               = "cable_tray_c05b";    // 垂直上弯通
    public static final String CABLE_TRAY_C03D_BLOCK_ID               = "cable_tray_c03d";    // 垂直右上弯通
    public static final String CABLE_TRAY_C03E_BLOCK_ID               = "cable_tray_c03e";    // 下边垂直三通
    public static final String CABLE_TRAY_C03F_BLOCK_ID               = "cable_tray_c03f";    // 上角垂直三通
    public static final String RAILROAD_CAR_STOPPER_A_BLOCK_ID        = "railroad_car_stopper_a";
    public static final String RAILROAD_CAR_STOPPER_B_BLOCK_ID        = "railroad_car_stopper_b";
    public static final String RAILROAD_CAR_STOPPER_C_BLOCK_ID        = "railroad_car_stopper_c";
    public static final String FIRE_DOOR_A_BLOCK_ID                   = "fire_door_a";
    public static final String FIRE_DOOR_B_BLOCK_ID                   = "fire_door_b";

    /* ------------------------------------------------------------------------------------------------------------- */

    // Block objects

    // 0 一些简单方块
    public static final Block  EXAMPLE_BLOCK_OBJECT                   = registerBlock(EXAMPLE_BLOCK_ID                          , new exampleBlock                       (AbstractBlock.Settings.create().strength(16.0f)));
    public static final Block  WARNING_SIGN_A_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_A_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_B_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_B_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_C_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_C_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_D_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_D_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_E_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_E_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_F_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_F_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_G_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_G_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_H_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_H_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_I_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_I_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  WARNING_SIGN_J_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_J_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
//  public static final Block  WARNING_SIGN_K_BLOCK_OBJECT            = registerBlock(WARNING_SIGN_K_BLOCK_ID                   , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP;
/* --- 1 一些带有简单方向性、功能的方块 ---------------------------------------------------------------------------------------------------------new -----------------------------------(AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT)                               , MAIN_GROUP*/
    public static final Block  CABLE_TRAY_BLOCK_OBJECT                = registerBlock(CABLE_TRAY_BLOCK_ID                       , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C01A_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C01A_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C02A_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C02A_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C03A_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C03A_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C05A_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C05A_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C05B_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C05B_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C03D_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C03D_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C03E_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C03E_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  CABLE_TRAY_C03F_BLOCK_OBJECT           = registerBlock(CABLE_TRAY_C03F_BLOCK_ID                  , new Block                              (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  RAILROAD_CAR_STOPPER_A_BLOCK_OBJECT    = registerBlock(RAILROAD_CAR_STOPPER_A_BLOCK_ID           , new railroad_car_stopper_a             (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  RAILROAD_CAR_STOPPER_B_BLOCK_OBJECT    = registerBlock(RAILROAD_CAR_STOPPER_B_BLOCK_ID           , new railroad_car_stopper_b             (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  RAILROAD_CAR_STOPPER_C_BLOCK_OBJECT    = registerBlock(RAILROAD_CAR_STOPPER_C_BLOCK_ID           , new railroad_car_stopper_c             (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT))                              , MAIN_GROUP);
    public static final Block  FIRE_DOOR_A_BLOCK_OBJECT               = registerBlock(FIRE_DOOR_A_BLOCK_ID                      , new DoorBlock                          (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT), BlockSetType.STONE)          , MAIN_GROUP);
    public static final Block  FIRE_DOOR_B_BLOCK_OBJECT               = registerBlock(FIRE_DOOR_B_BLOCK_ID                      , new DoorBlock                          (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT), BlockSetType.STONE)          , MAIN_GROUP);

    // 2 一些带有复杂功能的方块
    public static void initialize() {CONSOLE.debug("Initializing blocks...");}
}
/*
* .noCollision(): 取消碰撞效果
*
* */