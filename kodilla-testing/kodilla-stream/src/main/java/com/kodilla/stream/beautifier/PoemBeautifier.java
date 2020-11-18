package com.kodilla.stream.beautifier;

public class PoemBeautifier{

  public void beautify(String name, PoemDecorator poemDecorator) {
      System.out.println(poemDecorator.decorate(name));

  }

}
