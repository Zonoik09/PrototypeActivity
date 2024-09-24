package com.jonathan;

public abstract class Electrodomestic {
    String nom,color,marca,eficiencia;
    double preu;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
            this.preu = target.preu;
        }
    }

    public abstract Electrodomestic clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic elect2 = (Electrodomestic) object2;
        return elect2.preu == preu && elect2.nom.equals(nom) && elect2.color.equals(color) && elect2.marca.equals(marca)
                && elect2.eficiencia.equals(eficiencia);
    }
}
