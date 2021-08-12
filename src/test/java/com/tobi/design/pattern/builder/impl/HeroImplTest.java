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
    void builderWithName(){
        Hero firstHero = builder.setName("Joke")
        .build();

        assertEquals("Joke",firstHero.getName());
    }

    @Test
    void builderWithClass() {
        Hero firstHero = builder.setHeroClass("Joker")
                .build();
        assertEquals("Joker", firstHero.getHeroClass());
    }

    @Test
    void builderWithCompleteAttributes(){
        Hero firstHero = builder.setHeroClass("Joker")
                .setName("Joke")
                .setHp(13d)
        .build();
        assertEquals("Joker",firstHero.getHeroClass());
        assertEquals("Joke",firstHero.getName());
        assertEquals(13d,firstHero.getHp());
    }



}
