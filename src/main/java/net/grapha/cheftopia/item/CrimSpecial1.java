package net.grapha.cheftopia.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrimSpecial1 extends Item {
    private static final int MAX_USE_TIME = 40;



    public CrimSpecial1(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
    tooltip.add(new TranslatableText("tooltip.cheftopia.crim_special_1").formatted(Formatting.DARK_GREEN));}

}
