package com.jonathan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Forn forn = new Forn();
        forn.autoneteja = true;
        forn.temperatura = 250;
        forn.color = "black";
        forn.nom = "Horno 3000";
        forn.marca = "Bosh";
        forn.preu = 249.99;
        forn.eficiencia = "A";
        llista.add(forn);

        Forn anotherForn = (Forn) forn.clone();
        llista.add(anotherForn);

        Rentadora rent = new Rentadora();
        rent.soroll = 75;
        rent.revolucions = 900;
        rent.color = "white";
        rent.nom = "Lavadora 3000";
        rent.marca = "Bosh";
        rent.preu = 449.99;
        rent.eficiencia = "A";
        llista.add(rent);

        Rentadora anotherRent = (Rentadora) rent.clone();
        llista.add(anotherRent);

        Nevera nev = new Nevera();
        nev.soroll = 50;
        nev.frigories = 1500;
        nev.color = "black";
        nev.nom = "Horno 3000";
        nev.marca = "Bosh";
        nev.preu = 249.99;
        nev.eficiencia = "A";
        llista.add(nev);

        Nevera anotherNev = (Nevera) nev.clone();
        llista.add(anotherNev);

        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els poligons són el mateix objecte");
        } else {
            System.out.print(i + ": Els poligons són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els poligons són idèntics");
            } else {
                System.out.println(i + ": Els poligons NO són identics");
            }
        }
    }

    
}