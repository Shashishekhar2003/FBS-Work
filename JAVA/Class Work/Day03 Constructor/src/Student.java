class Student {
    String name;
    int marks;

    Student() {
        name = "Unknown";
        marks = 0;
    }

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.printf("Name: %s  Marks: %d\n", name, marks);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Amit", 85);

        s1.display();
        s2.display();
    }
}
