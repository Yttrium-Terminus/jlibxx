/**
 * @author Jack Meng
 * @since 1.1
 * 
 * @see jlibxx.util.XMLParser
 * 
 * This class is used to parse JSON data, however the user must be sure that the data is in JSON format.
 */

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

  public JSONParser(byte[] b) {
    this.json = new String(b);
  }

  
  /** 
   * @param f
   */
  public void write(File f) {
    try {
      java.nio.file.Files.write(f.toPath(), this.json.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @return String
   */
  public String toXML() {
    String[] lines = json.split("\n");
    String xml = "";
    for (String line : lines) {
      if (line.contains("\"")) {
        String[] parts = line.split("\"");
        xml += parts[1] + " ";
      }
    }
    return xml;
  }

  
  /** 
   * @return String
   */
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

  
  /** 
   * @param element
   * @return String
   */
  public String parse(String element) {
    String[] lines = this.json.split("\n");
    String[] parts = element.split(":");
    String value = "";
    for (String line : lines) {
      if (line.contains(parts[0])) {
        String[] parts2 = line.split(":");
        value = parts2[1];
      }
    }
    return value;
  }

  
  /** 
   * @param element
   * @param subElement
   * @return String
   */
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

  
  /** 
   * @return String[]
   */
  public String[] toArray() {
    String[] lines = this.json.split("\n");
    String[] array = new String[lines.length];
    for (int i = 0; i < lines.length; i++)
      array[i] = lines[i];
    return array;
  }

  
  /** 
   * @param element
   * @return String[]
   */
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

  
  /** 
   * @param element
   * @param subElement
   * @return String[]
   */
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

  
  /** 
   * @param element
   * @return boolean
   */
  public boolean exists(String element) {
    String[] lines = this.json.split("\n");
    for (String line : lines)
      if (line.contains(element))
        return true;
    return false;
  }

  
  /** 
   * @param element
   * @param subElement
   * @return boolean
   */
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

  /**
   * @param array The array of values in String format that we must attempt to
   *              format to JSON and return it as a String
   * @return The parsed JSON This method attempts to parse the array of values
   *         into JSON format and return it as a String. This string if used
   *         properly can be reinserted into this class and used again for it's
   *         properties in order to get elements, etc.
   * 
   * @code {arrayToJSON(new String[]{"a","b","c"})}
   */
  public static String arrayToJSON(String[] array) {
    String json = "";
    for (String s : array)
      json += s + "\n";
    return json;
  }

  /**
   * @param json     The JSON to be parsed
   * @param fileName The name of the file to be created of a JavaScript file This
   *                 method attempts to inject a JSON array into a JavaScript file
   *                 using some standard JSON formats Although this might work for
   *                 some instances of JSON, this method becomes very slow when
   *                 dealing with very large JSON or data to parse
   * 
   * @code {jsonToJS("[\"a\",\"b\",\"c\"]", "test.js")}
   */
  public static void jsonToJS(String json, String fileName) {
    String[] lines = json.split("\n");
    String js = "";
    for (String line : lines) {
      if (line.contains("\"")) {
        String[] parts = line.split("\"");
        js += parts[1] + " ";
      }
    }
    File f = new File(fileName);
    try {
      java.nio.file.Files.write(f.toPath(), js.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
