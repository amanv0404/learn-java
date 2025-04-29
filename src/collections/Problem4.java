//Problem 4: Task Prioritization Engine (PriorityQueue, Comparator)
//Create a Task class with name, priority, deadline.
//        • Use PriorityQueue to order by closest deadline, then highest priority.
//• Poll and print tasks as they should be executed.


package collections;


import java.time.LocalDate;
import java.util.*;

class Task{
    private String name;
    private int priority;
    private LocalDate deadline;

    public Task(String name, int priority, LocalDate deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void printTask() {
        System.out.println("Task Name: "+name);
        System.out.println("Priority: "+priority);
        System.out.println("Deadline: "+deadline);
        System.out.println("----------------");
    }
}

public class Problem4 {

    public static void main(String[] args) {

        // first by earliest deadline, then by higher priority
        Comparator<Task> taskComparator = Comparator
                .comparing(Task::getDeadline)
                .thenComparing(Comparator.comparingInt(Task::getPriority).reversed());


        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);

        taskQueue.add(new Task("Submit Report", 2, LocalDate.of(2025, 5, 2)));
        taskQueue.add(new Task("Team Meeting", 1, LocalDate.of(2025, 4, 30)));
        taskQueue.add(new Task("Fix Bug", 3, LocalDate.of(2025, 5, 1)));
        taskQueue.add(new Task("Code Review", 1, LocalDate.of(2025, 5, 1)));
        taskQueue.add(new Task("Client Call", 5, LocalDate.of(2025, 4, 30)));


        System.out.println("Task Execution Order ");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            task.printTask();
        }

    }
}
