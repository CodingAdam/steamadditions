package com.pansmith.steamadditions.data.recipe;

import com.buuz135.industrial.module.ModuleGenerator;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.pansmith.steamadditions.common.data.machines.SAGenerators;
import com.pansmith.steamadditions.common.data.machines.SAMachines;
import com.pansmith.steamadditions.steamadditions;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.gear;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.rotor;
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

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("large_mycelial_frosty_generator"),
                SAGenerators.LARGE_FROSTY_MYCELIAL_GENERATOR.asStack(1),
                "PPP", "PPP", "PPP",
                'P', new ItemStack(ModuleGenerator.MYCELIAL_GENERATORS.get(7).getLeft().get()));

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("large_mycelial_culinary_generator"),
                SAGenerators.LARGE_CULINARY_MYCELIAL_GENERATOR.asStack(1),
                "PPP", "PPP", "PPP",
                'P', new ItemStack(ModuleGenerator.MYCELIAL_GENERATORS.get(2).getLeft().get()));

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("large_mycelial_magma_generator"),
                SAGenerators.LARGE_MAGMA_MYCELIAL_GENERATOR.asStack(1),
                "PPP", "PPP", "PPP",
                'P', new ItemStack(ModuleGenerator.MYCELIAL_GENERATORS.get(9).getLeft().get()));

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("large_mycelial_meatallurgic_generator"),
                SAGenerators.LARGE_MEATALLURGIC_MYCELIAL_GENERATOR.asStack(1),
                "PPP", "PPP", "PPP",
                'P', new ItemStack(ModuleGenerator.MYCELIAL_GENERATORS.get(15).getLeft().get()));

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("large_mycelial_furnace_generator"),
                SAGenerators.LARGE_MEATALLURGIC_MYCELIAL_GENERATOR.asStack(1),
                "PPP", "PPP", "PPP",
                'P', new ItemStack(ModuleGenerator.MYCELIAL_GENERATORS.get(0).getLeft().get()));

}}
