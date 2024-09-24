package com.jonathan;

public class Forn extends Electrodomestic {
    int temperatura;
    boolean autoneteja;

    public Forn(){}

    public Forn(Forn forn) {
        super(forn);
        if (forn != null) {
            this.temperatura = forn.temperatura;
            this.autoneteja = forn.autoneteja;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Forn(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (this == object2) return true;

        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;

        if (!this.getClass().equals(object2.getClass())) return false;

        Forn f = (Forn) object2;

        return (f.temperatura == temperatura && f.autoneteja == autoneteja);
    }
}
