class Distance {
    int kilometer;
    int meter;

    Distance() {
        kilometer = 0;
        meter = 0;
    }

    Distance(int k, int m) {
        kilometer = k;
        meter = m;
    }

    void display() {
        System.out.printf("Distance: %d km %d m\n", kilometer, meter);
    }
}

class TestDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 350);

        d1.display();
        d2.display();
    }
}
