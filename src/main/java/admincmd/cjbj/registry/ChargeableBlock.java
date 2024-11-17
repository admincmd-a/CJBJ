package admincmd.cjbj.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class ChargeableBlock extends Block {
    public static final BooleanProperty CHARGED = BooleanProperty.of("charged");

    public ChargeableBlock(Settings settings) {
        super(settings);
    }
}