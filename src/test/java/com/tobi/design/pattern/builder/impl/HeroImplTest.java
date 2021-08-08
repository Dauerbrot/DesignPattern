package com.tobi.design.pattern.builder.impl;

import com.tobi.design.pattern.builder.Hero;
import com.tobi.design.pattern.builder.HeroBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroImplTest {

    private HeroBuilder builder;

    @BeforeEach
    public void setUp(){
        builder = new HeroBuilder();
    }

    @Test
    void testBuilderWithName(){
        Hero firstHero = builder.setName("Joke")
        .build();

        assertEquals("Joke",firstHero.getName());
    }

}
