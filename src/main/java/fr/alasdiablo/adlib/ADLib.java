package fr.alasdiablo.adlib;

import fr.alasdiablo.adlib.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class ADLib {
    public static final Logger LOGGER = LogManager.getLogger();

    public ADLib() {
        LOGGER.debug(Reference.CORE_MARKER, "Starting ADlib.");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // setup mod here
    }
}
