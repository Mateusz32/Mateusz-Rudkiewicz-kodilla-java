package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Mateusz",(name)->"ABC "+name);
        poemBeautifier.beautify("Natalia",(name)->name+" ABC");
        poemBeautifier.beautify("Mateusz",(name)->name.toUpperCase());
        poemBeautifier.beautify("NATALIA",(name)->name.toLowerCase());
        poemBeautifier.beautify("Mateusz",(name)->"*** "+name+" ***");
        poemBeautifier.beautify("     mateusz     ",(name)->name.toUpperCase().trim());
        poemBeautifier.beautify("m a t e u s z",(name)->name.replace(" ",""));


    }
}

