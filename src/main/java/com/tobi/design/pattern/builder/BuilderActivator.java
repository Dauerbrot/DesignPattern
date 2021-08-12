package com.tobi.design.pattern.builder;

import com.tobi.design.pattern.Activator;
import com.tobi.design.pattern.builder.configuration.BuilderConfiguration;
import com.tobi.design.pattern.configuration.Configuration;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class BuilderActivator implements Activator {

    Map<String, Hero> heroesMap;
    private Configuration configuration;

    public BuilderActivator() {
        this.configuration = new BuilderConfiguration();
        heroesMap = new HashMap<>();
    }

    @Override
    public void run() {
        JSONArray heroes = (JSONArray) configuration.getConfiguration();

        for (int i = 0; i < heroes.length(); i++) {
            JSONObject heroAsJson = heroes.getJSONObject(i);
            Hero hero = new HeroBuilder()
                    .setName(heroAsJson.getString("Name"))
                    .setHeroClass(heroAsJson.getString("HeroClass"))
                    .setHp(heroAsJson.getDouble("Hp")).build();
            heroesMap.put(hero.getName(), hero);
        }

        //show the result
        for (Map.Entry<String, Hero> singleHero : heroesMap.entrySet()) {
            System.out.println(singleHero.toString());
        }

    }

    @Override
    public void editConfig(Configuration configuration) {
        this.configuration = configuration;
    }
}
