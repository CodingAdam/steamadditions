package com.pansmith.steamadditions.data.recipe;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.pansmith.steamadditions.common.data.machines.SAMachines;
import com.pansmith.steamadditions.steamadditions;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.PRIMITIVE_BLAST_FURNACE_RECIPES;

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

        VanillaRecipeHelper.addShapedRecipe(provider, true, steamadditions.id("crude_wooden_board"),
                ChemicalHelper.get(TagPrefix.plate, GTMaterials.Wood, 1) ,
                " H ", "SSS", "   ",
                'H', CustomTags.HAMMERS,
                'S', ItemTags.WOODEN_SLABS);

        // Crude mixing for red alloy
        VanillaRecipeHelper.addShapelessRecipe(provider, "dust_red_alloy", ChemicalHelper.get(dust, RedAlloy, 3),
                new MaterialEntry(dust, Copper),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone),
                new MaterialEntry(dust, Redstone));

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder("rubber_from_charcoal")
                .inputItems(dust, RawRubber, 3)
                .inputItems(dust, Sulfur, 1)
                .inputItems(gem, Charcoal, 2)
                .outputItems(ingot, Rubber)
                .outputItems(dustTiny, DarkAsh, 2)
                .duration(1800)
                .save(provider);

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder("rubber_from_coal")
                .inputItems(dust, RawRubber, 3)
                .inputItems(dust, Sulfur, 1)
                .inputItems(gem, Coal, 2)
                .outputItems(ingot, Rubber)
                .outputItems(dustTiny, DarkAsh, 2)
                .duration(1800)
                .save(provider);

        PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder("rubber_from_coal_dust")
                .inputItems(dust, RawRubber, 3)
                .inputItems(dust, Sulfur, 1)
                .inputItems(dust, Coal, 2)
                .outputItems(ingot, Rubber)
                .outputItems(dustTiny, DarkAsh, 2)
                .duration(1800)
                .save(provider);

        // Crude Glass Blub = tinker's smelting
}}
