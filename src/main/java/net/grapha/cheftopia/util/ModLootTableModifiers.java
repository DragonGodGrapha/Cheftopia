package net.grapha.cheftopia.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.grapha.cheftopia.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier SEAGRASS_ID
            = new Identifier("minecraft", "blocks/seagrass");
    private static final Identifier KELP_ID
            = new Identifier("minecraft", "blocks/kelp");
    private static final Identifier KELP_PLANT_ID
            = new Identifier("minecraft", "blocks/kelp_plant");


    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for seagrass and kelp block loot table.
            if (SEAGRASS_ID.equals(id)||KELP_ID.equals(id)||KELP_PLANT_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.EEL));
                supplier.withPool(poolBuilder.build());
            }



        }));
    }
}
