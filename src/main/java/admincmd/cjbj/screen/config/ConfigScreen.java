package admincmd.cjbj.screen.config;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ConfigScreen {}

//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        return super.use(world, user, hand);
//    }
//
//
//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        // 判断当前世界是否是客户端侧世界
//        if (world.isClient()) {
//            // 如果是，就获取当前客户端实例，设置它的 Screen
//            MinecraftClient.getInstance().setScreen(new MyScreen(Text.literal("This is my screen")));
//        }
//        // 返回 success 状态表示操作成功
//        return TypedActionResult.success(user.getStackInHand(hand));
//    }



    // 下面是Element接口的定义，用于定义控件的事件回调
    //@Environment(value= EnvType.CLIENT)
    //public interface Element {
    //    public static final long MAX_DOUBLE_CLICK_INTERVAL = 250L;
    //    /**
    //     * 鼠标移动的事件回调。
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     */
    //    default public void mouseMoved(double mouseX, double mouseY) {}
    //    /**
    //     * 鼠标按钮被按下的事件回调。
    //     * @return     当前点击事件的回调处理是否成功
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     * @param button 当前鼠标被点击的按钮。0为左键
    //     */
    //    default public boolean mouseClicked(double mouseX, double mouseY, int button) {
    //        return false;
    //    }
    //    /**
    //     * 鼠标按钮被释放的事件回调。
    //     * @return     当前释放事件的回调处理是否成功
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     * @param button 当前鼠标被释放的按钮。0为左键
    //     */
    //    default public boolean mouseReleased(double mouseX, double mouseY, int button) {
    //        return false;
    //    }
    //    /**
    //     * 鼠标拖动的事件回调。
    //     * @return     当前拖动事件的回调处理是否成功
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     * @param button 当前鼠标被点击的按钮。0为左键
    //     * @param deltaX 在X轴上鼠标拖动的相对距离
    //     * @param deltaY 在Y轴上鼠标拖动的相对距离
    //     */
    //    default public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
    //        return false;
    //    }
    //    /**
    //     * 鼠标滚轮被滑动的事件回调。
    //     * @return     当前滚动事件的回调处理是否成功
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     * @param amount 鼠标滚轮的滚动距离。向下滑动时为负数，向上滑动为正数
    //     */
    //    default public boolean mouseScrolled(double mouseX, double mouseY, double amount) {
    //        return false;
    //    }
    //    /**
    //     * 当控件成为焦点时键盘按键被按下的事件回调。
    //     * @return     当前按键事件的回调处理是否成功
    //     * @param keyCode 被按键的命名代码。在GLFW类中可以看到所有的命名代码
    //     * @param scanCode 被按键的相对于操作系统的唯一扫描代码。一般不常用
    //     * @param modifiers 修饰键。即特殊按键是否被按下（例如shift、ctrl、alt等）
    //     */
    //    default public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
    //        return false;
    //    }
    //    /**
    //     * 当控件成为焦点时键盘按键被释放的事件回调。
    //     * @return     当前按键事件的回调处理是否成功
    //     * @param keyCode 被按键的命名代码。在GLFW类中可以看到所有的命名代码
    //     * @param scanCode 被按键的相对于操作系统的唯一扫描代码。一般不常用
    //     * @param modifiers 修饰键。即特殊按键是否被按下（例如shift、ctrl、alt等）
    //     */
    //    default public boolean keyReleased(int keyCode, int scanCode, int modifiers) {
    //        return false;
    //    }
    //    /**
    //     * 当向控件中输入字符时的事件回调。
    //     * @return     当前字符输入事件的回调处理是否成功
    //     * @param chr 输入的字符
    //     * @param modifiers 修饰键。即特殊按键是否被按下（例如shift、ctrl、alt等）
    //     */
    //    default public boolean charTyped(char chr, int modifiers) {
    //        return false;
    //    }
    //    /**
    //     * 当按下tab或shift+tab时更改焦点控件
    //     * @return     当前更改焦点事件的回调处理是否成功
    //     * @param lookForwards 为true时将焦点交给向前一个控件，否则交给后一个控件
    //     */
    //    default public boolean changeFocus(boolean lookForwards) {
    //        return false;
    //    }
    //    /**
    //     * 检查当前鼠标是否指向该控件
    //     * @return     鼠标是否在控件上悬浮
    //     * @param mouseX 当前鼠标的X坐标
    //     * @param mouseY 当前鼠标的Y坐标
    //     */
    //    default public boolean isMouseOver(double mouseX, double mouseY) {
    //        return false;
    //    }
    //}
    // 其他
    // 最后还需要注意的是，鼠标光标的坐标与控件坐标一样遵循以窗口为载体的二维空间坐标系，x 轴 y 轴的方向也是相同的。


