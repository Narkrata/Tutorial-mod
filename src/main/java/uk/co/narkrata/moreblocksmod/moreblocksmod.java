package uk.co.narkrata.moreblocksmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.narkrata.moreblocksmod.proxy.CommonProxy;
import uk.co.narkrata.moreblocksmod.CreativeModPannel.CreativeTabTutorial;

@Mod(modid = moreblocksmod.MODID, version = moreblocksmod.VERSION, name = moreblocksmod.NAME)
public class moreblocksmod
{
    public static final String MODID = "moreblocksmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "More Blocks Mod";

    @SidedProxy(clientSide = "uk.co.narkrata.moreblocksmod.proxy.ClientProxy;", serverSide = "uk.co.narkrata.moreblocksmod.proxy.CommonProxy")
    public static CommonProxy proxy;


    @Mod.Instance
    public static moreblocksmod instance;

    public static CreativeTabTutorial tabTutorial;



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);

    }

    @EventHandler
    public void  postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
