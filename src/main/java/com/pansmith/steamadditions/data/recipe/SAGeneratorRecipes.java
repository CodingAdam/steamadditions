package com.pansmith.steamadditions.data.recipe;

import com.buuz135.industrial.block.generator.mycelial.IMycelialGeneratorType;
import com.buuz135.industrial.plugin.jei.generator.MycelialGeneratorRecipe;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class SAGeneratorRecipes {
    public static void init(Consumer<FinishedRecipe> provider){
        genMycelialRecipesPureItems(provider, "furnace", 0, SARecipeTypes.LARGE_FURNACE_MYCELIAL_GENERATOR_RECIPES);
        genMycelialRecipesPureItems(provider, "culinary", 2, SARecipeTypes.LARGE_CULINARY_MYCELIAL_GENERATOR_RECIPES);
        genMycelialRecipesPureItems(provider, "frosty", 7, SARecipeTypes.LARGE_FROSTY_MYCELIAL_GENERATOR_RECIPES);
        genMycelialRecipes(provider, "magma", 9, SARecipeTypes.LARGE_MAGMA_MYCELIAL_GENERATOR_RECIPES);
        genMycelialRecipes(provider, "meatallurgic", 15, SARecipeTypes.LARGE_MEATALLURGIC_MYCELIAL_GENERATOR_RECIPES);
    }

    private static void genMycelialRecipesPureItems(Consumer<FinishedRecipe> provider, String name, int genIndex, GTRecipeType type){
        int index = 0;
        for(MycelialGeneratorRecipe recipe : IMycelialGeneratorType.TYPES.get(genIndex).getRecipes()){
            GTRecipeBuilder.of(GTCEu.id("large_" + name + "_mycelial_generator_" + index++), type)
                    .inputItems(recipe.getInputItems().get(0).get(0) ,32)
                    .duration(recipe.getTicks())
                    .EUt(-recipe.getPowerTick() * 8)
                    .save(provider);

        }
    }

    private static void genMycelialRecipes(Consumer<FinishedRecipe> provider, String name, int genIndex, GTRecipeType type){
        int index = 0;
        for(MycelialGeneratorRecipe recipe : IMycelialGeneratorType.TYPES.get(genIndex).getRecipes()){
            FluidStack stack = recipe.getFluidItems().get(0).get(0);

            Optional<List<Ingredient>> item = recipe.getInputItems().stream()
                    .filter(list -> list != null && !list.isEmpty())
                    .findFirst();

            if(item.isPresent()){
                GTRecipeBuilder.of(GTCEu.id("large_" + name + "_mycelial_generator_" + index++), type)
                        .inputItems(item.get() ,32)
                        .inputFluids(new FluidStack(stack,stack.getAmount() * 32))
                        .duration(recipe.getTicks())
                        .EUt(-recipe.getPowerTick() * 8)
                        .save(provider);
            } else {
                GTRecipeBuilder.of(GTCEu.id("large_" + name + "_mycelial_generator_" + index++), type)
                        .inputFluids(new FluidStack(stack,stack.getAmount() * 32))
                        .duration(recipe.getTicks())
                        .EUt(-recipe.getPowerTick() * 8)
                        .save(provider);
            }

        }
    }
}
