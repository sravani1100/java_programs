

class Run{
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Runnable...");
        runnable.run();

    }
}