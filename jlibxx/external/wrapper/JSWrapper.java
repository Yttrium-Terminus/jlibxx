package jlibxx.external.wrapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import jlibxx.external.Wrapper;

public class JSWrapper implements Wrapper {
  private abstract static class JSKeywords {
    private JSKeywords() {}
    protected static final String[] keywords = {
      "break", "case", "catch", "continue", "debugger", "default", "delete",
      "do", "else", "finally", "for", "function", "if", "in", "instanceof",
      "new", "return", "switch", "this", "throw", "try", "typeof", "var",
      "void", "while", "with", "class", "enum", "export", "extends", "import",
      "super", "implements", "interface", "let", "package", "private",
      "protected", "public", "static", "yield", "null", "true", "false",
      "undefined"
    };
    protected static final String[] reserved = {
      "arguments", "eval", "NaN", "Infinity", "undefined"
    };
    public static boolean isKeyword(String s) {
      for (String k : keywords) {
        if (k.equals(s)) {
          return true;
        }
      }
      return false;
    }
    public static boolean isReserved(String s) {
      for (String k : reserved) {
        if (k.equals(s)) {
          return true;
        }
      }
      return false;
    }

  }
  private String code;

  public JSWrapper(String code) {
    if (code == null)
      throw new NullPointerException("Code cannot be empty");
    if(isJS(code)) {
      this.code = code;
    } else {
      throw new IllegalArgumentException("Code must be a valid JavaScript");
    }
  }

  public JSWrapper(File code) {
    if (code == null)
      throw new NullPointerException("Code cannot be empty");
    this.code = getFileContent(code);
  }

  private String getFileContent(File file) {
    assert file != null;
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      StringBuilder sb = new StringBuilder();
      String line = null;
      while ((line = reader.readLine()) != null) {
        sb.append(line);
        sb.append("\n");
      }
      return sb.toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  private boolean isJS(String code) {
    for (String s : code.split("\\s+")) {
      if (JSKeywords.isKeyword(s) || JSKeywords.isReserved(s)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public lang getLang() {
    return Wrapper.lang.JAVASCRIPT;
  }

  @Override
  public lang_short getShort() {
    return Wrapper.lang_short.JS;
  }

}
