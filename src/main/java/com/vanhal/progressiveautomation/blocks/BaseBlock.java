package com.vanhal.progressiveautomation.blocks;

import com.vanhal.progressiveautomation.Ref;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BaseBlock extends BlockContainer {
	public String name;
	protected IIcon[] blockIcons = new IIcon[2];
	
	
	
	public BaseBlock(String blockName) {
		super(Material.iron);
		name = blockName;
		setBlockName(name);
		setHardness(1.0f);
		//setBlockTextureName(Ref.MODID+":"+name);
	}

	public TileEntity createNewTileEntity(World world, int var2) {
		return null;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
		blockIcons[0] = register.registerIcon(Ref.MODID+":"+name+"_Top");
		blockIcons[1] = register.registerIcon(Ref.MODID+":"+name+"_Side");
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
        return this.blockIcon;
    }
	
	public void preInit() {
		GameRegistry.registerBlock(this, name);
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
}
