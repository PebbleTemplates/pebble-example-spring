package com.example.factory;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.Loader;

public class PebbleEngineFactory {
    public static PebbleEngine instance(Loader<?> loader) {
        PebbleEngine.Builder builder = new PebbleEngine.Builder();
        builder.loader(loader);
        return builder.build();
    }
}
