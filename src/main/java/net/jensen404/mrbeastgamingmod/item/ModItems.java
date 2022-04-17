package net.jensen404.mrbeastgamingmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jensen404.mrbeastgamingmod.MrbeastGamingMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ULTRA_BLAZE_EGG = registerItem("ultra_blaze_egg",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(MrbeastGamingMod.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        MrbeastGamingMod.LOGGER.info("Registering Mod Items for " + MrbeastGamingMod.MOD_ID);
    }
}
