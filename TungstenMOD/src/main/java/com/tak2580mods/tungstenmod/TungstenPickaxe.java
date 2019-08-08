package com.tak2580mods.tungstenmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class TungstenPickaxe extends ItemPickaxe{
    public TungstenPickaxe(ToolMaterial material){
        super (material);
        this.setRegistryName("tungsten_pickaxe");
        this.setUnlocalizedName("tungsten_pickaxe");
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
