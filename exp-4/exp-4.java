class Student {
    int rollNo;
    String name;

    Student() {
        this(0, "Unknown");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

class exp4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(77, "Aryan");
        s1.display();
        s2.display();
    }
}
