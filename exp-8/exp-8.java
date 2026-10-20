// Demonstrates package usage and access modifiers in a single-file example.
// For a full package demo, place this file in a named package and compile from its parent directory.
class AccessExample {
    public int publicValue = 10;
    protected int protectedValue = 20;
    int defaultValue = 30;
    private int privateValue = 40;

    public void display() {
        System.out.println("public = " + publicValue);
        System.out.println("protected = " + protectedValue);
        System.out.println("default = " + defaultValue);
        System.out.println("private (within class) = " + privateValue);
    }
}

class exp8 {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        example.display();
        System.out.println("Accessing public member from another class: " + example.publicValue);
    }
}
