package jlibxx.templates;

public abstract class Runner {
  private Class<?> runner_class;

  public Runner(Class<?> runner_class) {
    this.runner_class = runner_class;
  }

  
  /** 
   * @return boolean
   */
  public boolean uses_swing() {
    return runner_class.getName().contains("Swing");
  }

  
  /** 
   * @return boolean
   */
  public boolean uses_awt() {
    return runner_class.getName().contains("AWT");
  }

  
  /** 
   * @return boolean
   */
  public boolean uses_javafx() {
    return runner_class.getName().contains("JavaFX");
  }

  
  /** 
   * @return boolean
   */
  public boolean uses_javafx_swing() {
    return runner_class.getName().contains("JavaFXSwing");
  }

  
  /** 
   * @return boolean
   */
  public boolean uses_javafx_awt() {
    return runner_class.getName().contains("JavaFXAWT");
  }

  public abstract void run();

  public abstract void run(String[] args);

  public abstract void run(String[] args, String[] env);
}
