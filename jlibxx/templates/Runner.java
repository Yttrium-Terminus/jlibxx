package jlibxx.templates;

public abstract class Runner {
  private Class<?> runner_class;

  public Runner(Class<?> runner_class) {
    this.runner_class = runner_class;
  }

  public boolean uses_swing() {
    return runner_class.getName().contains("Swing");
  }

  public boolean uses_awt() {
    return runner_class.getName().contains("AWT");
  }

  public boolean uses_javafx() {
    return runner_class.getName().contains("JavaFX");
  }

  public boolean uses_javafx_swing() {
    return runner_class.getName().contains("JavaFXSwing");
  }

  public boolean uses_javafx_awt() {
    return runner_class.getName().contains("JavaFXAWT");
  }

  public abstract void run();

  public abstract void run(String[] args);

  public abstract void run(String[] args, String[] env);
}
