package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.library.Library;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        String bun;
        int burgers;
        String sauce;
        List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Ordered Bigmac:\n"+"Bun: "+bun+"\n"+"Quantity of burgers: "+burgers+"\n"+"Sauce: "+sauce+"\n"+"Ingredients: "+ingredients;
    }
}
