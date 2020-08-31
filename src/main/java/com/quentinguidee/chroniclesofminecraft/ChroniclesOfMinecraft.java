package com.quentinguidee.chroniclesofminecraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

import com.quentinguidee.chroniclesofminecraft.common.items.ModItems;
import com.quentinguidee.chroniclesofminecraft.common.biomes.Biomes;
import com.quentinguidee.chroniclesofminecraft.common.biomes.world.NormalWorldType;
import com.quentinguidee.chroniclesofminecraft.common.blocks.ModBlocks;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("chroniclesofminecraft")
public class ChroniclesOfMinecraft {
    public static final String MODID = "chroniclesofminecraft";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ChroniclesOfMinecraft() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Biomes.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RenderType cutout = RenderType.getCutout();

        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_ROSA_ROSEA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_ROSA_ALBA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_ROSA_HYACINUS.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_CENTAUREA_MONTANA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_LILIACEAE_CANDELA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_CANTHARELLUS_PLATYPHYLLUS.get(), cutout);

        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_ALOES_CANDELA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_BAMBUSA_GIVRA.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_BULBUM_AER.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_COPRINUS_COMATUS.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_COPRINUS_LUMUS.get(), cutout);

        new NormalWorldType();
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("chroniclesofminecraft", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}",
                event.getIMCStream().map(m -> m.getMessageSupplier().get()).collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the
    // contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
