package com.tak2580mods.tungstenmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTungsten extends Block{
    public BlockTungsten(){
        super(Material.IRON);
        this.setRegistryName("tungstenmod","tungsten_block");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName("tungsten_block");
    }
}
