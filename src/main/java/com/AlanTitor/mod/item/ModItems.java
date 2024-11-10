package com.AlanTitor.mod.item;

import com.AlanTitor.mod.MyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MODID);

    public static final RegistryObject<Item> TESSERACT_ORE = ITEMS.register("tesseract_ore",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TESSERACT_STONE = ITEMS.register("tesseract_stone",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
