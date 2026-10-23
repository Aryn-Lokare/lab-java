import java.util.Arrays;
import java.util.List;

class exp17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4, 2);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .toList();
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Original: " + numbers);
        System.out.println("Even numbers squared and sorted: " + result);
        System.out.println("Sum using reduce(): " + sum);
    }
}
