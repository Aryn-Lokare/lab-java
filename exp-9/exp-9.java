class exp9 {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        System.out.println("Original: [" + text + "]");
        System.out.println("trim(): [" + text.trim() + "]");
        System.out.println("length(): " + text.length());
        System.out.println("toUpperCase(): " + text.toUpperCase());
        System.out.println("contains(\"Java\"): " + text.contains("Java"));
        System.out.println("substring(2, 6): " + text.substring(2, 6));
        System.out.println("replace(): " + text.replace("Java", "Core Java"));

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        builder.insert(5, ",");
        builder.replace(0, 5, "Hi");
        System.out.println("StringBuilder result: " + builder);
        builder.reverse();
        System.out.println("Reversed: " + builder);
    }
}
