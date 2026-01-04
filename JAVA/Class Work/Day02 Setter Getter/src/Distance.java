class Distance {
    int kilometer;
    int meter;

    void setKilometer(int k) {
        this.kilometer = k;
    }

    void setMeter(int m) {
        this.meter = m;
    }
}

class TestDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance();

        d1.setKilometer(5);
        d1.setMeter(350);

        System.out.printf("Distance: %d km %d m\n", d1.kilometer, d1.meter);
    }
}
