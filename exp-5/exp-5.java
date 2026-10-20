class exp5 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    } // overloading

    static int sum(int... values) { // variable-length arguments
        int total = 0;
        for (int value : values)
            total += value;
        return total;
    }

    static int objectCount;

    exp5() { objectCount++; }

    public static void main(String[] args) {
        System.out.println("Integer addition: " + add(10, 20));
        System.out.println("Double addition: " + add(2.5, 3.7));
        System.out.println("Sum of varargs: " + sum(1, 2, 3, 4, 5));
        new exp5();
        new exp5();
        System.out.println("Objects created: " + objectCount);
    }
}
