class Animal {
    void sound() { System.out.println("Animal makes a sound"); }
}
class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}
class exp6 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // runtime method overriding
    }
}
