package com.pansmith.steamadditions.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.pansmith.steamadditions.data.recipe.SARecipeTypes;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;

import static com.pansmith.steamadditions.steamadditions.REGISTRATE;

@SuppressWarnings({"unused"})
public class SAGenerators {
    public static void init() {

    }

    public static MachineDefinition genMycelialMultiblock(String name, GTRecipeType recipeType, BlockEntry<Block> casing, String casingModel){
        return REGISTRATE.multiblock("large_"+ name + "_mycelial_generator", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .recipeType(recipeType)
            .generator(true)
            .appearanceBlock(casing)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("CCC", "CCC", "CCC")
                    .aisle("CCC", "C C", "CCC")
                    .aisle("CCC", "C~C", "CCC")
                    .where('~', Predicates.controller(Predicates.blocks(definition.get())))
                    .where('C', Predicates.blocks(casing.get())
                            .or(Predicates.autoAbilities(definition.getRecipeTypes())) // Automatically binds Item Buses & Dynamo Hatches
                    )
                    .build()
            )
            .workableCasingModel(
                    GTCEu.id("block/casings/solid/" + casingModel),
                    GTCEu.id("block/multiblock/generator/large_steam_turbine")
            )
            .tooltips(Component.translatable("block.steamadditions.large_" + name + "_mycelial_generator.tooltip"))
            .register();

    }
    public static final MachineDefinition LARGE_FROSTY_MYCELIAL_GENERATOR = genMycelialMultiblock("frosty",
            SARecipeTypes.LARGE_FROSTY_MYCELIAL_GENERATOR_RECIPES,
            GTBlocks.CASING_ALUMINIUM_FROSTPROOF,
            "machine_casing_frost_proof");
    public static final MachineDefinition LARGE_CULINARY_MYCELIAL_GENERATOR = genMycelialMultiblock("culinary",
            SARecipeTypes.LARGE_CULINARY_MYCELIAL_GENERATOR_RECIPES,
            GTBlocks.CASING_STAINLESS_CLEAN,
            "machine_casing_clean_stainless_steel");
    public static final MachineDefinition LARGE_FURNACE_MYCELIAL_GENERATOR = genMycelialMultiblock("furnace",
            SARecipeTypes.LARGE_FURNACE_MYCELIAL_GENERATOR_RECIPES,
            GTBlocks.CASING_STEEL_SOLID,
            "machine_casing_solid_steel");
    public static final MachineDefinition LARGE_MAGMA_MYCELIAL_GENERATOR = genMycelialMultiblock("magma",
            SARecipeTypes.LARGE_MAGMA_MYCELIAL_GENERATOR_RECIPES,
            GTBlocks.CASING_INVAR_HEATPROOF,
            "machine_casing_heatproof");
    public static final MachineDefinition LARGE_MEATALLURGIC_MYCELIAL_GENERATOR = genMycelialMultiblock("metallurgic",
            SARecipeTypes.LARGE_MEATALLURGIC_MYCELIAL_GENERATOR_RECIPES,
            GTBlocks.CASING_PTFE_INERT,
            "machine_casing_inert_ptfe");



}
