package net.theawesomegem.fishingmadebetter.common.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.theawesomegem.fishingmadebetter.ModInfo;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

/**
 * Created by TheAwesomeGem on 1/1/2018.
 */
public class ItemKnife extends ItemTool
{
    public ItemKnife()
    {
        super(1.0f, 1.0f, ToolMaterial.WOOD, new HashSet<>());

        this.setMaxDamage(100);
        this.setRegistryName("knife");
        this.setUnlocalizedName(ModInfo.MOD_ID + "." + "knife");
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Use it to cut fish into fish slices.");
    }

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack itemKnife = itemStack.copy();

        itemKnife.setItemDamage(itemStack.getItemDamage() + 8);

        return itemStack;
    }
}