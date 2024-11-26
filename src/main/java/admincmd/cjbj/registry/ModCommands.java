package admincmd.cjbj.registry;

import admincmd.cjbj.screen.about.CustomScreen;
import admincmd.cjbj.screen.config.ConfigScreen;
import admincmd.cjbj.screen.config.ScreenTrigger;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.*;

public class ModCommands {
    public static void registerModCommands() {

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("c_config")
                .executes(context -> {
                    // 对于 1.19 之前的版本，把“Text.literal”替换为“new LiteralText”。
                    // 对于 1.20 之前的版本，请移除“() ->”。
                    //context.getSource().sendFeedback(() -> Text.literal("欢迎使用 CJBJ 城市建设工具！"), false);

                    return 1;
                })));

        // Register your commands here
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            // 配置命令
            dispatcher.register(literal("c_about").executes(context -> {
                MinecraftClient.getInstance().setScreen(
                        new CustomScreen(Text.empty())
                );
                //MinecraftClient.getInstance().setScreen(ScreenTrigger.);
//                MinecraftClient.getInstance().setScreen(
//                        new ScreenTrigger(Text.ConfigScreen())
//                );
                return 1;
            }));
        });
    }
}
