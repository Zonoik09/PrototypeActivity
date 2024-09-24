package com.jonathan;

public class Nevera extends Electrodomestic {
    int frigories , soroll;

    public Nevera() {}

    public Nevera(Nevera nev) {
        super(nev);
        if (nev != null) {
            this.frigories = nev.frigories;
            this.soroll = nev.soroll;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Nevera(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (this == object2) return true;

        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;

        if (!this.getClass().equals(object2.getClass())) return false;

        Nevera N = (Nevera) object2;

        return (N.frigories == frigories && N.soroll == soroll);
    }
}
