package jlibxx.util;

import java.io.File;
import java.io.IOException;

public class JSONParser {
  private String json;

  public JSONParser(String s) {
    this.json = s;
  }

  public JSONParser(File f) {
    try {
      this.json = new String(java.nio.file.Files.readAllBytes(f.toPath()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void write(File f) {
    try {
      java.nio.file.Files.write(f.toPath(), this.json.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String parse(String element) {
    String[] lines = this.json.split("\n");
    for (String line : lines)
      if (line.contains(element))
        return line;
    return null;
  }

  public String toXML() {
    String[] lines = this.json.split("\n");
    String xml = "";
    for (String line : lines) {
      if (line.contains("\"")) {
        String[] parts = line.split("\"");
        xml += parts[1] + " ";
      }
    }
    return xml;
  }

  public String toCSV() {
    String[] lines = this.json.split("\n");
    String csv = "";
    for (String line : lines) {
      if (line.contains("\"")) {
        String[] parts = line.split("\"");
        csv += parts[1] + ",";
      }
    }
    return csv;
  }

  public String parse(String element, String subElement) {
    String[] lines = this.json.split("\n");
    for (String line : lines) {
      if (line.contains(element)) {
        String[] parts = line.split(":");
        String[] subParts = parts[1].split(",");
        for (String subPart : subParts)
          if (subPart.contains(subElement))
            return subPart;
      }
    }
    return null;
  }

  public String[] toArray() {
    String[] lines = this.json.split("\n");
    String[] array = new String[lines.length];
    for (int i = 0; i < lines.length; i++)
      array[i] = lines[i];
    return array;
  }

  public String[] toArray(String element) {
    String[] lines = this.json.split("\n");
    String[] array = new String[lines.length];
    for (int i = 0; i < lines.length; i++) {
      if (lines[i].contains(element)) {
        array[i] = lines[i];
      }
    }
    return array;
  }

  public String[] toArray(String element, String subElement) {
    String[] lines = this.json.split("\n");
    String[] array = new String[lines.length];
    for (int i = 0; i < lines.length; i++) {
      if (lines[i].contains(element)) {
        String[] parts = lines[i].split(":");
        String[] subParts = parts[1].split(",");
        for (String subPart : subParts)
          if (subPart.contains(subElement))
            array[i] = subPart;
      }
    }
    return array;
  }

  public boolean exists(String element) {
    String[] lines = this.json.split("\n");
    for (String line : lines)
      if (line.contains(element))
        return true;
    return false;
  }

  public boolean exists(String element, String subElement) {
    String[] lines = this.json.split("\n");
    for (String line : lines) {
      if (line.contains(element)) {
        String[] parts = line.split(":");
        String[] subParts = parts[1].split(",");
        for (String subPart : subParts)
          if (subPart.contains(subElement))
            return true;
      }
    }
    return false;
  }
}
