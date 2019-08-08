package com.tak2580mods.tungstenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTungsten extends Item{
    public ItemTungsten(){
        super();
        //レジストリに保存する名称。大文字の使用禁止。
        this.setRegistryName("tungstenmod","tungsten");
        //クリエイティブタブの設定
        this.setCreativeTab(CreativeTabs.MATERIALS);
        //翻訳名登録。大文字は非推奨
        this.setUnlocalizedName("tungsten");
    }
}
