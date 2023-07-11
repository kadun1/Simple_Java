package enums;

public enum Languages {
    JAVA(() -> System.out.println("java")),
    C(() -> System.out.println("c")),
    CPP(() -> System.out.println("c++")),
    PYTHON(() -> System.out.println("python")),
    JS(() -> System.out.println("js")),
    GO(() -> System.out.println("go")),
    RUST(() -> System.out.println("rust"));

    private final Runnable runnable;

    Languages(Runnable runnable) {
        this.runnable = runnable;
    }

    public void printName(){
        this.runnable.run();
    }
}
