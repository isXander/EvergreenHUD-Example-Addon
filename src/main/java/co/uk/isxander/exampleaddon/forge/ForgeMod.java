package co.uk.isxander.exampleaddon.forge;

import co.uk.isxander.evergreenhud.addon.AddonManager;
import co.uk.isxander.exampleaddon.ExampleAddon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleAddon.MOD_ID, name = ExampleAddon.MOD_NAME, version = ExampleAddon.MOD_VERSION, dependencies = "required-before:evergreenhud", clientSideOnly = true)
public class ForgeMod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        AddonManager.getInstance().registerAddon(new ExampleAddon());
    }

}
