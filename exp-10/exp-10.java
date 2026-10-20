class InvalidAgeException extends Exception {
    InvalidAgeException(String message) { super(message); }
}
class exp10 {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be 18 or above.");
        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
