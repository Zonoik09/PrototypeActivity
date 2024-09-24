package com.jonathan;

public class Rentadora extends Electrodomestic {
    int revolucions,soroll;

    public Rentadora() {}

    public Rentadora(Rentadora rent) {
        super(rent);
        if (rent != null) {
            this.revolucions = rent.revolucions;
            this.soroll = rent.soroll;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Rentadora(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (this == object2) return true;

        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;

        if (!this.getClass().equals(object2.getClass())) return false;

        Rentadora R = (Rentadora) object2;

        return (R.revolucions == revolucions && R.soroll == soroll);
    }
}
