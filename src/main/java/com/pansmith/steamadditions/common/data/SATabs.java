package com.pansmith.steamadditions.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.pansmith.steamadditions.common.data.machines.SAMachines;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

import static com.pansmith.steamadditions.steamadditions.REGISTRATE;
import static com.pansmith.steamadditions.steamadditions.id;

public class SATabs {
    public static void init() {
        // i cast exist
    }

    public static final RegistryEntry<CreativeModeTab> SA_MACHINES = REGISTRATE.defaultCreativeTab("machines",
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("machines", REGISTRATE))
                    .icon(() -> SAMachines.STEAM_CENTRIFUGE.asStack())
                    .title(REGISTRATE.addLang("itemGroup", id("machines"), "Steam Additions"))
                    .build()).register();
}