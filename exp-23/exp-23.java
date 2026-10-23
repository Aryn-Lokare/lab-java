// Hibernate example (Hibernate 6). Add Hibernate ORM and MySQL Connector/J dependencies.
// Create database hibernateeg in MySQL before running.
// This is a single-file demonstration; use the listed dependency setup in README.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "students")
class HibernateStudent {
    @Id
    private int id;
    private String name;
    private String course;

    public HibernateStudent() {}
    public HibernateStudent(int id, String name, String course) {
        this.id = id; this.name = name; this.course = course;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}

class exp23 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(HibernateStudent.class);
        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(new HibernateStudent(1, "Asha", "Computer Engineering"));
            transaction.commit();
            System.out.println("Student saved using Hibernate.");
        }
    }
}
