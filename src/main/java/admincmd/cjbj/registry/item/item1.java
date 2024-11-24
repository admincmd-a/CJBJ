package admincmd.cjbj.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class item1 {



    public static void regitem1 () {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        Registry.register(Registries.ITEM, new Identifier("cjbj", "setting_rods"), new Item(new FabricItemSettings()));
    }

}
