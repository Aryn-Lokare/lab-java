@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
class exp16 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Addition using lambda: " + addition.operate(10, 5));
        System.out.println("Multiplication using lambda: " + multiplication.operate(10, 5));
        Runnable task = () -> System.out.println("Lambda Runnable executed.");
        task.run();
    }
}
