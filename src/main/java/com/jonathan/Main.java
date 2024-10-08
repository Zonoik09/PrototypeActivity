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
        Forn forn2 = new Forn();
        forn2.autoneteja = false;
        forn2.temperatura = 280;
        forn2.color = "white";
        forn2.nom = "Horno 3500";
        forn2.marca = "LG";
        forn2.preu = 299.99;
        forn2.eficiencia = "B";
        llista.add(forn);
        llista.add(forn2);

        Forn anotherForn = (Forn) forn.clone();
        llista.add(anotherForn);
        Forn anotherForn2 = (Forn) forn2.clone();
        llista.add(anotherForn2);

        Rentadora rent = new Rentadora();
        rent.soroll = 75;
        rent.revolucions = 900;
        rent.color = "white";
        rent.nom = "Lavadora 3000";
        rent.marca = "Bosh";
        rent.preu = 449.99;
        rent.eficiencia = "A";
        Rentadora rent2 = new Rentadora();
        rent2.soroll = 80;
        rent2.revolucions = 1200;
        rent2.color = "black";
        rent2.nom = "Lavadora 3500";
        rent2.marca = "Samsung";
        rent2.preu = 549.99;
        rent2.eficiencia = "B";
        llista.add(rent);
        llista.add(rent2);

        Rentadora anotherRent = (Rentadora) rent.clone();
        llista.add(anotherRent);
        Rentadora anotherRent2 = (Rentadora) rent2.clone();
        llista.add(anotherRent2);

        Nevera nev = new Nevera();
        nev.soroll = 50;
        nev.frigories = 1500;
        nev.color = "black";
        nev.nom = "Nevera 3000";
        nev.marca = "Bosh";
        nev.preu = 249.99;
        nev.eficiencia = "A";
        Nevera nev2 = new Nevera();
        nev2.soroll = 60;
        nev2.frigories = 1800;
        nev2.color = "white";
        nev2.nom = "Nevera y congelador 3000";
        nev2.marca = "LG";
        nev2.preu = 349.99;
        nev2.eficiencia = "B";
        llista.add(nev2);

        Nevera anotherNev = (Nevera) nev.clone();
        llista.add(anotherNev);
        Nevera anotherNev2 = (Nevera) nev2.clone();
        llista.add(anotherNev2);

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

    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": són el mateix objecte");
        } else {
            System.out.print(i + ": són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": són idèntics");
            } else {
                System.out.println(i + ": NO són identics");
            }
        }
    }


}