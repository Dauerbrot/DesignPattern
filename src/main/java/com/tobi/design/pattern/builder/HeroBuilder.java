package com.tobi.design.pattern.builder;

import com.tobi.design.pattern.builder.impl.HeroImpl;

public class HeroBuilder {
    private HeroImpl hero;

    public HeroBuilder() {
        hero = new HeroImpl();
    }

    public HeroBuilder setName(String name) {
        hero.setName(name);
        return this;
    }

    public HeroBuilder setHeroClass(String heroClass) {
        hero.setHeroClass(heroClass);
        return this;
    }

    public HeroBuilder setHp(double hp) {
        hero.setHp(hp);
        return this;
    }

    public Hero build(){
        return hero;
    }
}
