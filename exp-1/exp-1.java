class exp1 {
    public static void main(String[] args) {
        byte smallNumber = 100;
        short shortNumber = 1000;
        int number = 50000;
        long largeNumber = 9000000000L;
        float decimal = 12.5f;
        double preciseDecimal = 123.456;
        char letter = 'A';
        boolean isJavaFun = true;

        System.out.println("Primitive data types:");
        System.out.println("byte = " + smallNumber);
        System.out.println("short = " + shortNumber);
        System.out.println("int = " + number);
        System.out.println("long = " + largeNumber);
        System.out.println("float = " + decimal);
        System.out.println("double = " + preciseDecimal);
        System.out.println("char = " + letter);
        System.out.println("boolean = " + isJavaFun);

        int converted = (int) decimal; // Widening/narrowing conversion demo
        double widened = number; // int to double: widening
        int casted = (int) preciseDecimal; // double to int: explicit casting
        System.out.println("int converted from float = " + converted);
        System.out.println("int widened to double = " + widened);
        System.out.println("double cast to int = " + casted);
    }
}
