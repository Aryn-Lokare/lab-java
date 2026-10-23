class Box<T> {
    private T value;
    Box(T value) { this.value = value; }
    T getValue() { return value; }
    void setValue(T value) { this.value = value; }
}
class exp13 {
    static <T> void display(T item) {
        System.out.println("Generic method value: " + item);
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Java");
        System.out.println("Integer box: " + intBox.getValue());
        System.out.println("String box: " + stringBox.getValue());
        display(3.14);
        display("Generics");
    }
}
