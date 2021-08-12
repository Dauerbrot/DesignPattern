package com.tobi.design.pattern.builder;

import com.tobi.design.pattern.builder.impl.HeroImpl;
import com.tobi.design.pattern.utils.Utils;

/**
 * The purpose of the builder pattern is based on the open-closed-principle.
 * While the object can get new attributes, we don´t need to modify the
 * constructor of the object which is build. for example the hero class.
 *
 * In a classic way the hero class had a constructor with all available attributes and maybe some
 * overloaded constructor to initialize the class with a bare minimum.
 *
 * With every new attribute the interface provides, we have to introduce a new parameter in an existing
 * constructor and this can be ugly...
 * e.g. new HeroImpl(param1 , param2, param3, param4, param5, param6, param7,...) and so on
 * So the complete construct has to be extended in every class, which create a new instance of HeroImpl
 * or who implements the interface Hero.
 *
 * DRY is the key. The Idea just to extend the builder and use it, if needed, the new method on the given position.
 *
 */
public class HeroBuilder {
    private final HeroImpl hero;

    public HeroBuilder() {
        hero = new HeroImpl();
    }

    public HeroBuilder setName(String name) {
        if(Utils.isEmpty(name)){
            return this;
        }
        hero.setName(name);
        return this;
    }

    public HeroBuilder setHeroClass(String heroClass) {
        if(Utils.isEmpty(heroClass)){
            return this;
        }
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
