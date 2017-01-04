package uk.co.narkrata.moreblocksmod.CreativeModPannel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Niklas on 04.01.2017.
 */
public class CreativeTabTutorial extends CreativeTabs
{

    public CreativeTabTutorial(int index, String label)
    {
        super(index, label);
    }


    @Override
    public Item getTabIconItem()
    {
        return Items.EMERALD;
    }
}
