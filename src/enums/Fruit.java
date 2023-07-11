package enums;

public enum Fruit {
    APPLE(() -> System.out.println("hello"));

    private final Runnable runnable;

    Fruit(Runnable runnable) {
        this.runnable = runnable;
    }

    // constructor

    public void todoSomething() {
        this.runnable.run();
    }
}