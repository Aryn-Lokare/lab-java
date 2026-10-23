import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String author();
    int version() default 1;
}
class Demo {
    @Info(author = "Student", version = 1)
    public void display() { System.out.println("Method with custom annotation"); }
}
class exp15 {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        demo.display();
        Info info = Demo.class.getMethod("display").getAnnotation(Info.class);
        System.out.println("Author: " + info.author());
        System.out.println("Version: " + info.version());
    }
}
