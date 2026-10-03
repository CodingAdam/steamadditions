package com.pansmith.steamadditions.data.recipe;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.GENERATOR;
import static com.lowdragmc.lowdraglib.gui.texture.ProgressTexture.FillDirection.LEFT_TO_RIGHT;

public class SARecipeTypes {

    public static void init() {}

    public final static GTRecipeType LARGE_FROSTY_MYCELIAL_GENERATOR_RECIPES = GTRecipeTypes.register("large_frosty_mycelial_generator", GENERATOR) .setMaxIOSize(1, 0, 0, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, true, GuiTextures.DARK_CANISTER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_GAS_COLLECTOR, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.COOLING);

    public final static GTRecipeType LARGE_FURNACE_MYCELIAL_GENERATOR_RECIPES = GTRecipeTypes.register("large_furnace_mycelial_generator", GENERATOR) .setMaxIOSize(1, 0, 0, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, true, GuiTextures.DARK_CANISTER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_GAS_COLLECTOR, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.FURNACE);
    public final static GTRecipeType LARGE_CULINARY_MYCELIAL_GENERATOR_RECIPES = GTRecipeTypes.register("large_culinary_mycelial_generator", GENERATOR) .setMaxIOSize(1, 0, 0, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, true, GuiTextures.DARK_CANISTER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_GAS_COLLECTOR, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CHEMICAL);
    public final static GTRecipeType LARGE_MEATALLURGIC_MYCELIAL_GENERATOR_RECIPES = GTRecipeTypes.register("large_meatallurgic_mycelial_generator", GENERATOR) .setMaxIOSize(1, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, true, GuiTextures.DARK_CANISTER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_GAS_COLLECTOR, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CENTRIFUGE);

    public final static GTRecipeType LARGE_MAGMA_MYCELIAL_GENERATOR_RECIPES = GTRecipeTypes.register("large_magma_mycelial_generator", GENERATOR) .setMaxIOSize(1, 0, 1, 0)
            .setEUIO(IO.OUT)
            .setSlotOverlay(false, true, true, GuiTextures.DARK_CANISTER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_GAS_COLLECTOR, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CENTRIFUGE);
}


