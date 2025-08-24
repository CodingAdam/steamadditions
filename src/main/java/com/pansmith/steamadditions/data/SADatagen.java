package com.pansmith.steamadditions.data;

import com.tterrag.registrate.providers.ProviderType;
import com.pansmith.steamadditions.data.lang.LangHandler;

import static com.pansmith.steamadditions.steamadditions.REGISTRATE;

public class SADatagen {
    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
