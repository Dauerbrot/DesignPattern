package com.tobi.design.pattern.builder.impl;

import com.tobi.design.pattern.builder.Hero;

public class HeroImpl implements Hero {
    String name;
    String heroClass;
    double hp;

    public HeroImpl(){
        //default constructor
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    @Override
    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
