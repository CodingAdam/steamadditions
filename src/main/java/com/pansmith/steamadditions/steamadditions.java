package com.pansmith.steamadditions;

import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.pansmith.steamadditions.common.data.machines.SAMachines;
import com.pansmith.steamadditions.common.data.SATabs;
import com.pansmith.steamadditions.data.SADatagen;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(steamadditions.MOD_ID)
public class steamadditions {
	public static final String
			MOD_ID = "steamadditions",
			NAME = "Steam Additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    public static final GTRegistrate REGISTRATE = GTRegistrate.create(steamadditions.MOD_ID);
	public static MaterialRegistry MATERIAL_REGISTRY;

    @SuppressWarnings("removal")
	public steamadditions() {
		steamadditions.init();
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.register(this);

		bus.addGenericListener(MachineDefinition.class, this::registerMachines);
		REGISTRATE.creativeModeTab(() -> SATabs.SA_MACHINES);
	}

	public static void init() {
        LOGGER.debug("Starting up...");
        REGISTRATE.registerRegistrate();
        SADatagen.init();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	@SubscribeEvent
	public void registerMaterialRegistry(MaterialRegistryEvent event) {
		MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(steamadditions.MOD_ID);
	}
	@SubscribeEvent
	public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
		SAMachines.init();
	}
}