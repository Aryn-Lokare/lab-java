import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private final int id;
    private String title;
    private boolean completed;

    Task(int id, String title) { this.id = id; this.title = title; }
    int getId() { return id; }
    String getTitle() { return title; }
    boolean isCompleted() { return completed; }
    void rename(String title) { this.title = title; }
    void complete() { completed = true; }
    @Override public String toString() {
        return id + ". [" + (completed ? "x" : " ") + "] " + title;
    }
}

class exp25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        int nextId = 1;
        while (true) {
            System.out.println("\\n--- Student Task Manager ---");
            System.out.println("1. Add task  2. List tasks  3. Complete task  4. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Task title: ");
                    tasks.add(new Task(nextId++, sc.nextLine()));
                    System.out.println("Task added.");
                    break;
                case "2":
                    if (tasks.isEmpty()) System.out.println("No tasks yet.");
                    else tasks.forEach(System.out::println);
                    break;
                case "3":
                    System.out.print("Enter task ID: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine().trim());
                        boolean found = false;
                        for (Task task : tasks) {
                            if (task.getId() == id) { task.complete(); found = true; break; }
                        }
                        System.out.println(found ? "Task completed." : "Task not found.");
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
