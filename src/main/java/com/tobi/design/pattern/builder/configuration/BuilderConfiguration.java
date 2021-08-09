package com.tobi.design.pattern.builder.configuration;

import com.tobi.design.pattern.configuration.Configuration;

public class BuilderConfiguration implements Configuration {
    String name;
    @Override
    public void setConfigName(String name) {
        this.name = name;
    }
}
