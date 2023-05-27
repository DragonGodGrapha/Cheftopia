package net.grapha.cheftopia.item;

import com.epherical.croptopia.Croptopia;
import com.epherical.croptopia.items.Drink;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.grapha.cheftopia.Cheftopia;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import oshi.hardware.platform.unix.freebsd.FreeBsdHardwareAbstractionLayer;

import java.util.List;

public class ModItems {

    //CAFE
    public static final Item ESPRESSO=registerItem("espresso",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.espresso)));
    public static final Item LATTE=registerItem("latte",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item MOCHA=registerItem("mocha",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item CHAI=registerItem("chai",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item EARL_GREY_LATTE=registerItem("earl_grey_latte",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item MATCHA_LATTE=registerItem("matcha_latte",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item GOLDEN_LATTE=registerItem("golden_latte",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));

    //DRINKS
    public static final Item MANGO_LASSI=registerItem("mango_lassi",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item MULLED_CIDER=registerItem("mulled_cider",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item STRAWBERRY_MILK=registerItem("strawberry_milk",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item WASSAIL=registerItem("wassail",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));

    //SPIRITS
    public static final Item BRANDY=registerItem("brandy",
            new ModBottle(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.hard_liquor).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item GIN=registerItem("gin",
            new ModBottle(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.hard_liquor).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item TEQUILA=registerItem("tequila",
            new ModBottle(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.hard_liquor).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item VODKA=registerItem("vodka",
            new ModBottle(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.hard_liquor).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item WHISKEY=registerItem("whiskey",
            new ModBottle(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.hard_liquor).recipeRemainder(Items.GLASS_BOTTLE)));

    //ALCOHOL
    public static final Item BRANDY_SMASH=registerItem("brandy_smash",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item IRISH_COFFEE=registerItem("irish_coffee",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item MARGARITA=registerItem("margarita",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item MINT_JULEP=registerItem("mint_julep",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item MOJITO=registerItem("mojito",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item MOSCOW_MULE=registerItem("moscow_mule",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item MULLED_WINE=registerItem("mulled_wine",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item PALOMA=registerItem("paloma",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item SCREWDRIVER=registerItem("screwdriver",
            new Screwdriver(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item SIDECAR=registerItem("sidecar",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item SINGAPORE_SLING=registerItem("singapore_sling",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item TOM_COLLINS=registerItem("tom_collins",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));
    public static final Item PUNCH=registerItem("punch",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.mixed_drink)));

    //BRITISH
    public static final Item BANGERS_AND_MASH=registerItem("bangers_and_mash",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item BLACK_PUDDING=registerItem("black_pudding",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_3)));
    public static final Item ENGLISH_BREAKFAST=registerItem("english_breakfast",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item STEAK_PIE=registerItem("steak_pie",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));

    //GREEK
    public static final Item BAKLAVA=registerItem("baklava",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item GYRO=registerItem("gyro",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item PASTITSIO=registerItem("pastitsio",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item PITA=registerItem("pita",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_3)));
    public static final Item SAGANAKI=registerItem("saganaki",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item SOUVLAKI=registerItem("souvlaki",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item TZATZIKI=registerItem("tzatziki",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_2)));

    //ITALIAN
    public static final Item BACON_ALFREDO=registerItem("bacon_alfredo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item CANNOLI=registerItem("cannoli",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item CHICKEN_ALFREDO=registerItem("chicken_alfredo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item CHICKEN_MARSALA=registerItem("chicken_marsala",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item DEEPDISH_PIZZA=registerItem("deepdish_pizza",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item FRIED_RAVIOLI=registerItem("fried_ravioli",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item GARLIC_BREAD=registerItem("garlic_bread",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item LADYFINGERS=registerItem("ladyfingers",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_2)));
    public static final Item LASAGNA=registerItem("lasagna",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item MOZZARELLA_STICKS=registerItem("mozzarella_sticks",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item SHRIMP_SCAMPI=registerItem("shrimp_scampi",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item TIRAMISU=registerItem("tiramisu",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item TOMATO_RAVIOLI=registerItem("tomato_ravioli",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item BEEF_STROGANOFF=registerItem("beef_stroganoff",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));


    //AMERICAN
    public static final Item BACON_MUSHROOM_BURGER=registerItem("bacon_mushroom_burger",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item HOT_DOG=registerItem("hot_dog",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item CHICAGO_DOG=registerItem("chicago_dog",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item CORNDOG=registerItem("corndog",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item POLISH_SAUSAGE=registerItem("polish_sausage",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item DEVILED_EGG=registerItem("deviled_egg",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item HOT_WINGS=registerItem("hot_wings",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item ITALIAN_BEEF_SANDWICH=registerItem("italian_beef_sandwich",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item SLOPPER=registerItem("slopper",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item TUNA_SALAD=registerItem("tuna_salad",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));

    //NEW ORLEANS
    public static final Item BEANS_AND_RICE=registerItem("beans_and_rice",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item FRIED_FISH=registerItem("fried_fish",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item FRIED_OYSTERS=registerItem("fried_oysters",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item GUMBO=registerItem("gumbo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item OYSTER_POBOY=registerItem("oyster_poboy",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item OYSTERS_ROCKEFELLER=registerItem("oysters_rockefeller",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));

    //MEXICAN
    public static final Item CHORIZO=registerItem("chorizo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_3)));
    public static final Item DIP_TRIO=registerItem("dip_trio",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item GUACAMOLE=registerItem("guacamole",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item QUESO=registerItem("queso",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item TORTA=registerItem("torta",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item GREEN_CHILE_STEW=registerItem("green_chile_stew",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item RED_CHILE_STEW=registerItem("red_chile_stew",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));

    //INDIAN
    public static final Item SAMOSA=registerItem("samosa",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item VINDALOO=registerItem("vindaloo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));


    //CHINESE
    public static final Item MAPO_TOFU=registerItem("mapo_tofu",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item SPICY_SQUID=registerItem("spicy_squid",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));

    //KOREAN
    public static final Item KIMCHI=registerItem("kimchi",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item KIMCHI_PANCAKE=registerItem("kimchi_pancake",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    //JAPANESE
    public static final Item CHEESY_EEL_RICE=registerItem("cheesy_eel_rice",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item DRAGON_ROLL=registerItem("dragon_roll",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item GRILLED_EEL=registerItem("grilled_eel",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item MISO_SOUP=registerItem("miso_soup",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item OKONOMIYAKI=registerItem("okonomiyaki",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item ONIGIRI=registerItem("onigiri",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_8)));
    public static final Item RAMEN=registerItem("ramen",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item TAKOYAKI=registerItem("takoyaki",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item UMEBOSHI=registerItem("umeboshi",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));

    //THAI
    public static final Item FRIED_RICE=registerItem("fried_rice",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item THAI_CURRY=registerItem("thai_curry",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));

    //SWEETS AND BAKED GOODS
    public static final Item BROWNIES=registerItem("brownies",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item BUTTERMILK_PIE=registerItem("buttermilk_pie",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item CHOCOLATE_PIE=registerItem("chocolate_pie",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item FRUIT_FLAMBEE=registerItem("fruit_flambee",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item FUNNEL_CAKE=registerItem("funnel_cake",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item PERSIMMON_BREAD=registerItem("persimmon_bread",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item PRETZEL=registerItem("pretzel",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));

    //BREAKFASTS
    public static final Item RAW_BAGEL=registerItem("raw_bagel",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_1)));
    public static final Item BAGEL=registerItem("bagel",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item BAGEL_AND_CREAM_CHEESE=registerItem("bagel_and_cream_cheese",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));
    public static final Item BAGEL_AND_LOX=registerItem("bagel_and_lox",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item BAGEL_SANDWICH=registerItem("bagel_sandwich",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_18)));
    public static final Item BISCUIT=registerItem("biscuit",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item BISCUITS_AND_GRAVY=registerItem("biscuits_and_gravy",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_12)));
    public static final Item BOILED_EGG=registerItem("boiled_egg",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_5)));
    public static final Item BREAKFAST_SANDWICH=registerItem("breakfast_sandwich",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_10)));
    public static final Item EGGS_BENEDICT=registerItem("eggs_benedict",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_14)));

    //SPECIAL MEALS
    public static final Item GRAPHA_SPECIAL_1=registerItem("grapha_special_1",
            new GraphaSpecial1(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));
    public static final Item GRAPHA_SPECIAL_2=registerItem("grapha_special_2",
            new GraphaSpecial2(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));
    public static final Item CRIM_SPECIAL_1=registerItem("crim_special_1",
            new CrimSpecial1(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));
    public static final Item CRIM_SPECIAL_2=registerItem("crim_special_2",
            new CrimSpecial2(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));
    public static final Item NIX_SPECIAL_1=registerItem("nix_special_1",
            new NixSpecial1(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));
    public static final Item NIX_SPECIAL_2=registerItem("nix_special_2",
            new NixSpecial2(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_20)));

    //NONFOODS AND CONDIMENTS
    public static final Item BREADCRUMBS=registerItem("bread_crumbs",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP)));
    public static final Item CRUSHED_ICE=registerItem("crushed_ice",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP)));
    public static final Item EEL=registerItem("eel",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_2)));
    public static final Item HOT_SAUCE=registerItem("hot_sauce",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_2)));
    public static final Item MAYO=registerItem("mayo",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_1)));
    public static final Item MINT=registerItem("mint",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP)));
    public static final Item RICOTTA=registerItem("ricotta",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_1)));
    public static final Item SODA=registerItem("soda",
            new ModDrink(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_0)));
    public static final Item TOFISH=registerItem("tofish",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP).food(ModFoodComponents.tier_1)));
    public static final Item VINEGAR=registerItem("vinegar",
            new Item(new FabricItemSettings().group(Croptopia.CROPTOPIA_ITEM_GROUP)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Cheftopia.MOD_ID,name),item);
    }


    public static void registerModItems(){
        Cheftopia.LOGGER.info("Registering Mod Items for "+Cheftopia.MOD_ID);

    }

}