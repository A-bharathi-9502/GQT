package Multithreding;
public class Program11 {
    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("MyGroup");
        new Thread(g, () -> System.out.println("Thread in group")).start();
        System.out.println("Group name: " + g.getName());
    }
}
