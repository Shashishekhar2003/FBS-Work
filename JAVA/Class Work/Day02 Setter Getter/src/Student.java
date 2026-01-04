class Student {
    String name;
    int marks;

    void setName(String n) {
        this.name = n;
    }

    void setMarks(int m) {
        this.marks = m;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Amit");
        s1.setMarks(85);

        System.out.printf("Name: %s  Marks: %d\n", s1.name, s1.marks);
    }
}
