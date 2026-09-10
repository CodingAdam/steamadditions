package com.pansmith.steamadditions.data.recipe;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.pansmith.steamadditions.common.data.machines.SAMachines;
import com.pansmith.steamadditions.steamadditions;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class MiscRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("steam_separator_from_lp"),
                SAMachines.STEAM_CENTRIFUGE.asStack(1),
                "PGP", "PTP", "PGP",
                'P', GTBlocks.CASING_BRONZE_BRICKS,
                'G', new MaterialEntry(gear, Steel),
                'T', new MaterialEntry(rotor, Iron));

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("steam_alloy_smelter_from_lp"),
                SAMachines.STEAM_ALLOY_SMELTER.asStack(1),
                "PGP", "PTP", "PGP",
                'P', GTBlocks.CASING_BRONZE_BRICKS,
                'G', new MaterialEntry(gear, Bronze),
                'T', GTMachines.STEAM_ALLOY_SMELTER.left().asStack());

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("steam_alloy_smelter_from_hp"),
                SAMachines.STEAM_ALLOY_SMELTER.asStack(1),
                "PGP", "PTP", "PGP",
                'P', GTBlocks.CASING_BRONZE_BRICKS,
                'G', new MaterialEntry(gear, Bronze),
                'T', GTMachines.STEAM_ALLOY_SMELTER.right().asStack());

}}
