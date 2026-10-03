package com.pansmith.steamadditions.data.lang;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tterrag.registrate.providers.RegistrateLangProvider;

import java.util.Set;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of();

    public static void init(RegistrateLangProvider provider) {
        initItemTooltips(provider);
        provider.add("block.steamadditions.steam_foundry.tooltip", "Also not to be confused with the Multi-Smelter.");
        provider.add("block.steamadditions.steam_separator.tooltip", "Perfect for getting the most out of your dusts.");
        provider.add("block.steamadditions.frost_generator.tooltip", "The Super Suit you've been waiting for.");
        provider.add("gtceu.large_frosty_mycelial_generator_generator.tooltip", "Large Frosty Mycelial Generator");
        provider.add("gtceu.large_culinary_mycelial_generator_generator.tooltip", "Large Culinary Mycelial Generator");
        provider.add("gtceu.large_magma_mycelial_generator_generator.tooltip", "Large Magma Mycelial Generator");
        provider.add("gtceu.large_furnace_mycelial_generator_generator.tooltip", "Large Furnace Mycelial Generator");
        provider.add("gtceu.large_metallurgic_mycelial_generator_generator.tooltip", "Large Metallurgic Mycelial Generator");
    }

    private static void initItemTooltips(RegistrateLangProvider provider) {

        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), FormattingUtil.toEnglishName(material.getName()));
        }

    }
}
