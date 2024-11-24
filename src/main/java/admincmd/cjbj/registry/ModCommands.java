package admincmd.cjbj.registry;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.*;

public class ModCommands {
    public static void registerModCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("c_about")
                .executes(context -> {
                    // 对于 1.19 之前的版本，把“Text.literal”替换为“new LiteralText”。
                    // 对于 1.20 之前的版本，请移除“() ->”。
                    context.getSource().sendFeedback(() -> Text.literal("欢迎使用 CJBJ 城市建设工具！"), false);

                    return 1;
                })));

        // Register your commands here
    }
}
