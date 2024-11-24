package admincmd.cjbj.registry.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
//import net.minecraft.r
import net.minecraft.util.Identifier;

import static admincmd.cjbj.CJBJ.*;


public class blockitem1 {
    static public void block1 () {
        // rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt

        Registry.register(Registries.ITEM, new Identifier("cjbj", "example_block"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "example_block")), new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("cjbj", "railway_crossing_signals_0"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "railway_crossing_signals_0")), new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("cjbj", "railway_crossing_signals_1"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "railway_crossing_signals_1")), new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("cjbj", "railway_crossing_signals_2"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "railway_crossing_signals_2")), new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("cjbj", "railway_crossing_signals_3"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "railway_crossing_signals_3")), new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("cjbj", "railway_crossing_signals_4"), new BlockItem(Registries.BLOCK.get(new Identifier("cjbj", "railway_crossing_signals_4")), new FabricItemSettings()));



        //Registry.register(Registries.ITEM, new Identifier("tutorial","railroad_pile_yell"), new BlockItem(StandardBlock, new FabricItemSettings()));
        //Registry.register(Registries.ITEM, new Identifier("tutorial","railway_crossing_signals_0"), Registries.BLOCK.get(new Identifier("cjbj", "example_block")));
        //Registry.register(Registries.ITEM, new Identifier("tutorial","railway_crossing_signals_1"), Registries.BLOCK.get(new Identifier("cjbj", "example_block")));
        //Registry.register(Registries.ITEM, new Identifier("tutorial","railway_crossing_signals_2"), Registries.BLOCK.get(new Identifier("cjbj", "example_block")));
        //Registry.register(Registries.ITEM, new Identifier("tutorial","railway_crossing_signals_3"), Registries.BLOCK.get(new Identifier("cjbj", "example_block")));
        //Registry.register(Registries.ITEM, new Identifier("tutorial","railway_crossing_signals_4"), Registries.BLOCK.get(new Identifier("cjbj", "example_block")));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","8block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","9block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","10block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","11block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","12block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","13block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","14block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","15block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","16block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","17block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","18block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","19block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","20block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","21block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","22block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","23block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","24block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","25block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","26block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","27block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","28block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","29block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","30block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","31block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","32block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","33block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","34block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","35block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","36block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","37block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","38block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","39block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","40block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","41block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","42block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","43block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","44block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","45block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","46block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","47block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","48block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","49block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","50block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","51block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","52block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","53block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","54block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","55block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","56block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","57block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","58block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","59block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","60block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","61block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","62block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","63block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","64block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","65block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","66block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","67block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","68block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","69block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","70block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","71block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","72block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","73block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","74block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","75block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","76block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","77block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","78block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","79block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","80block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","81block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","82block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","83block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","84block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","85block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","86block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","87block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","88block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","89block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","90block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","91block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","92block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","93block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","94block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","95block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","96block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","97block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","98block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","99block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","100block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","101block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","102block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","103block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","104block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","105block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","106block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","107block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","108block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","109block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","110block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","111block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","112block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","113block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","114block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","115block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","116block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","117block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","118block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","119block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","120block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","121block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","122block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","123block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","124block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","125block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","126block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","127block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","128block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","129block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","130block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","131block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","132block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","133block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","134block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","135block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","136block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","137block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","138block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","139block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","140block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","141block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","142block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","143block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","144block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","145block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","146block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","147block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","148block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","149block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","150block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","151block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","152block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","153block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","154block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","155block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","156block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","157block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","158block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","159block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","160block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","161block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","162block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","163block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","164block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","165block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","166block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","167block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","168block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","169block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","170block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","171block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","172block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","173block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","174block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","175block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","176block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","177block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","178block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","179block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","180block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","181block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","182block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","183block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","184block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","185block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","186block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","187block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","188block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","189block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","190block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","191block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","192block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","193block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","194block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","195block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","196block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","197block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","198block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","199block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","200block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","201block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","202block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","203block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","204block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","205block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","206block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","207block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","208block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","209block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","210block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","211block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","212block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","213block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","214block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","215block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","216block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","217block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","218block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","219block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","220block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","221block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","222block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","223block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","224block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","225block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","226block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","227block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","228block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","229block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","230block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","231block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","232block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","233block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","234block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","235block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","236block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","237block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","238block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","239block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","240block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","241block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","242block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","243block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","244block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","245block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","246block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","247block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","248block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","249block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","250block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","251block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","252block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","253block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","254block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","255block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","256block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","257block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","258block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","259block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","260block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","261block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","262block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","263block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","264block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","265block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","266block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","267block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","268block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","269block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","270block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","271block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","272block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","273block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","274block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","275block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","276block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","277block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","278block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","279block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","280block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","281block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","282block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","283block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","284block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","285block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","286block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","287block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","288block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","289block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","290block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","291block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","292block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","293block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","294block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","295block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","296block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","297block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","298block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","299block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","300block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","301block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","302block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","303block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","304block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","305block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","306block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","307block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","308block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","309block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","310block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","311block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","312block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","313block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","314block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","315block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","316block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","317block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","318block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","319block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","320block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","321block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","322block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","323block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","324block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","325block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","326block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","327block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","328block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","329block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","330block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","331block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","332block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","333block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","334block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","335block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","336block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","337block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","338block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","339block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","340block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","341block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","342block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","343block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","344block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","345block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","346block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","347block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","348block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","349block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","350block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","351block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","352block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","353block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","354block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","355block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","356block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","357block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","358block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","359block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","360block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","361block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","362block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","363block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","364block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","365block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","366block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","367block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","368block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","369block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","370block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","371block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","372block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","373block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","374block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","375block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","376block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","377block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","378block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","379block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","380block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","381block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","382block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","383block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","384block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","385block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","386block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","387block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","388block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","389block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","390block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","391block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","392block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","393block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","394block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","395block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","396block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","397block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","398block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","399block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","400block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","401block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","402block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","403block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","404block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","405block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","406block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","407block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","408block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","409block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","410block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","411block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","412block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","413block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","414block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","415block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","416block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","417block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","418block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","419block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","420block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","421block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","422block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","423block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","424block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","425block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","426block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","427block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","428block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","429block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","430block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","431block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","432block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","433block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","434block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","435block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","436block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","437block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","438block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","439block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","440block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","441block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","442block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","443block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","444block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","445block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","446block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","447block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","448block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","449block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","450block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","451block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","452block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","453block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","454block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","455block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","456block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","457block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","458block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","459block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","460block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","461block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","462block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","463block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","464block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","465block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","466block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","467block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","468block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","469block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","470block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","471block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","472block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","473block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","474block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","475block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","476block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","477block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","478block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","479block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","480block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","481block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","482block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","483block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","484block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","485block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","486block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","487block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","488block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","489block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","490block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","491block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","492block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","493block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","494block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","495block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","496block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","497block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","498block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","499block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","500block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","501block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","502block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","503block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","504block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","505block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","506block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","507block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","508block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","509block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","510block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","511block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","512block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","513block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","514block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","515block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","516block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","517block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","518block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","519block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","520block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","521block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","522block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","523block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","524block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","525block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","526block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","527block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","528block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","529block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","530block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","531block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","532block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","533block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","534block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","535block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","536block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","537block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","538block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","539block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","540block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","541block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","542block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","543block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","544block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","545block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","546block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","547block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","548block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","549block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","550block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","551block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","552block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","553block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","554block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","555block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","556block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","557block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","558block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","559block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","560block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","561block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","562block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","563block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","564block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","565block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","566block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","567block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","568block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","569block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","570block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","571block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","572block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","573block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","574block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","575block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","576block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","577block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","578block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","579block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","580block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","581block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","582block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","583block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","584block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","585block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","586block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","587block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","588block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","589block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","590block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","591block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","592block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","593block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","594block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","595block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","596block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","597block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","598block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","599block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","600block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","601block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","602block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","603block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","604block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","605block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","606block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","607block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","608block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","609block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","610block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","611block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","612block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","613block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","614block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","615block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","616block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","617block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","618block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","619block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","620block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","621block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","622block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","623block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","624block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","625block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","626block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","627block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","628block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","629block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","630block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","631block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","632block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","633block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","634block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","635block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","636block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","637block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","638block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","639block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","640block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","641block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","642block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","643block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","644block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","645block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","646block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","647block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","648block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","649block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","650block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","651block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","652block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","653block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","654block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","655block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","656block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","657block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","658block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","659block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","660block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","661block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","662block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","663block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","664block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","665block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","666block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","667block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","668block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","669block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","670block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","671block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","672block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","673block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","674block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","675block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","676block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","677block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","678block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","679block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","680block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","681block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","682block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","683block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","684block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","685block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","686block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","687block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","688block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","689block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","690block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","691block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","692block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","693block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","694block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","695block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","696block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","697block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","698block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","699block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//        Registry.register(Registries.ITEM, new Identifier("tutorial","700block"), new BlockItem(StandardBlock, new FabricItemSettings()));
//
//
//
//
//
//
//
//
//
//


































































    }
}
