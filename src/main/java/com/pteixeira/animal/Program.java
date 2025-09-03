package com.pteixeira.animal;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());
        animais.add(new Rinoceronte());

        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }

}
