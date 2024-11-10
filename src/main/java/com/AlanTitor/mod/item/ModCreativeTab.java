package com.AlanTitor.mod.item;

import com.AlanTitor.mod.MyMod;
import com.AlanTitor.mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MODID);

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB = CREATIVE_MOD_TAB.register("my_mod_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.TESSERACT_ORE.get()))
                    .title(Component.translatable("creativetab.mymod"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESSERACT_ORE.get());
                        output.accept(ModBlocks.TESSERACT_BLOCK.get());
                        output.accept(ModItems.TESSERACT_STONE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
