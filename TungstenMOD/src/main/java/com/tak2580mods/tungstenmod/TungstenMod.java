package com.tak2580mods.tungstenmod;

import javafx.scene.paint.Material;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.jws.WebParam;
import javax.tools.Tool;

@Mod(modid = "tungstenmod", version = "1.0", name = "TungstenMOD")
public class TungstenMod {
    public static final Item TUNGSTEN = new ItemTungsten();
    public static final Block TUNGSTEN_BLOCK = new BlockTungsten();
    public static final Item TUNGSTEN_PICKAXE = new TungstenPickaxe(EnumHelper.addToolMaterial("tungsten_pickaxe",1,500,6.0F,5.5F,20));

    @Mod.EventHandler
    //このMODファイルを発火先に
    public void construct(FMLConstructionEvent event){
        MinecraftForge.EVENT_BUS.register(this);
    }

    //アイテム登録イベント
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(TUNGSTEN);//アルミニウムインゴットの登録
        event.getRegistry().register(new ItemBlock(TUNGSTEN_BLOCK).setRegistryName("tungstenmod","tungsten_block"));//アルミニウムブロックのアイテムとしての登録
        event.getRegistry().register(TUNGSTEN_PICKAXE);
    }

    //ブロック登録イベント
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(TUNGSTEN_BLOCK);//アルミニウムブロックのブロックとしての登録
    }

    //モデル登録イベント。SideOnlyによってクライアント側のみ呼び出し
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(TUNGSTEN,0,
                new ModelResourceLocation(new ResourceLocation("tungstenmod","tungsten"),"inventory"));//アルミニウムインゴットのモデル登録
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TUNGSTEN_BLOCK),0,
                new ModelResourceLocation(new ResourceLocation("tungstenmod","tungsten_block"),"inventory"));//アルミニウムブロックのモデル登録
        ModelLoader.setCustomModelResourceLocation(TUNGSTEN_PICKAXE,0,
                new ModelResourceLocation(new ResourceLocation("tungstenmod","tungsten_pickaxe"),"inventory"));
    }
}

