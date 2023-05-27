package net.grapha.cheftopia.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    //Booze

    public static final FoodComponent hard_liquor = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.2F).build();

    public static final FoodComponent mixed_drink = (new FoodComponent.Builder()).hunger(10).saturationModifier(1.6F).build();

    //End Booze
    public static final FoodComponent espresso = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1), 1.0F).build();
    public static final FoodComponent tier_20 = (new FoodComponent.Builder()).hunger(20).saturationModifier(2.6F).build();
    public static final FoodComponent tier_18 = (new FoodComponent.Builder()).hunger(18).saturationModifier(2.4F).build();
    public static final FoodComponent tier_14 = (new FoodComponent.Builder()).hunger(14).saturationModifier(2.0F).build();
    public static final FoodComponent tier_12 = (new FoodComponent.Builder()).hunger(12).saturationModifier(1.8F).build();
    public static final FoodComponent tier_10 = (new FoodComponent.Builder()).hunger(10).saturationModifier(1.6F).build();
    public static final FoodComponent tier_8 = (new FoodComponent.Builder()).hunger(8).saturationModifier(1.2F).build();
    public static final FoodComponent tier_5 = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).build();
    public static final FoodComponent tier_3 = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.6F).build();
    public static final FoodComponent tier_2 = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).build();
    public static final FoodComponent tier_1 = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.2F).build();
    public static final FoodComponent tier_0 = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();

}
