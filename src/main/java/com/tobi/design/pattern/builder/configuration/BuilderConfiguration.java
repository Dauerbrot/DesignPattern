package com.tobi.design.pattern.builder.configuration;

import com.tobi.design.pattern.configuration.Configuration;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class BuilderConfiguration implements Configuration {
    private final String FILE_PATH = "com/tobi/design/pattern/builder/";
    JSONArray heroes;
    private String name;

    public BuilderConfiguration() {
        heroes = readJsonFile("heroes.json");
    }

    private JSONArray readJsonFile(String fileName) {
        JSONArray jsonArray = new JSONArray();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_PATH + fileName);

        try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line = reader.lines().collect(Collectors.joining());
            jsonArray = new JSONObject(line).getJSONArray("Heroes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    @Override
    public void setConfigName(String name) {
        this.name = name;
    }

    @Override
    public Object getConfiguration() {
        return heroes;
    }
}
