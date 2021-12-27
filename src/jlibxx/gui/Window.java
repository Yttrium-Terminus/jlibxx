package jlibxx.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import jlibxx.templates.Run;

public class Window implements Run {
  private JFrame frame;
  public Window(boolean autoStart) {
    frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  
  }

  @Override
  public void run() {
    
  }

  @Override
  public void run(Object... args) {
    // Method not used
  }
}
