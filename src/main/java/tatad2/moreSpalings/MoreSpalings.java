package tatad2.moreSpalings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import java.awt.List;
import java.util.ArrayList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "morespalings", name = "more spalings", version = "1.0")
public class MoreSpalings
{	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
//		Block leaves = Block.getBlockById(18); 
		Block leaves = Blocks.leaves;
		ArrayList <ItemStack> leavesList = new ArrayList();
		leaves.getSubBlocks(new ItemBlock(leaves), CreativeTabs.tabDecorations, leavesList);
		System.out.println(leavesList); 

//		Block sapling = Block.getBlockById(6);
		Block sapling = Blocks.sapling; 
		ArrayList <ItemStack> saplingList = new ArrayList();
		sapling.getSubBlocks(new ItemBlock(sapling), CreativeTabs.tabDecorations, saplingList); 
		System.out.println(saplingList);

		for (int i = 0; i <= 3; i ++) 
		{
			GameRegistry.addShapelessRecipe(saplingList.get(i), new Object[]{leavesList.get(i)});
		}
	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
