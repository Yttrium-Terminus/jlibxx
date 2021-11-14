package jlibxx.util;

import java.io.File;
import java.io.IOException;

public class XMLParser {
  private String xml;

  public XMLParser(String xml) {
    this.xml = xml;
  }

  public XMLParser(File f) throws IOException {
    this.xml = new String(java.nio.file.Files.readAllBytes(f.toPath()));
  }

  public String getContent() {
    return xml;
  }

  public boolean isXML() {
    return xml.matches("<[^>]+>");
  }

  public String getRootTag() {
    return xml.substring(1, xml.indexOf('>'));
  }

  public String getRootTagContent() {
    return xml.substring(xml.indexOf('>') + 1, xml.lastIndexOf('<'));
  }

  public String getTagContent(String tag) {
    return xml.substring(xml.indexOf("<" + tag + ">") + tag.length() + 2, xml.indexOf("</" + tag + ">"));
  }

  public String getTagContent(String tag, String attribute, String value) {
    return xml.substring(xml.indexOf("<" + tag + " " + attribute + "=\"" + value + "\">") + tag.length()
        + attribute.length() + value.length() + 3, xml.indexOf("</" + tag + ">"));
  }

  public String replace(String find, String replace) {
    return xml.replaceAll(find, replace);
  }

  public String getEncoding() {
    return xml.substring(xml.indexOf("encoding=\"") + 10, xml.indexOf("\"", xml.indexOf("encoding=\"") + 10));
  }

  public String getVersion() {
    return xml.substring(xml.indexOf("version=\"") + 9, xml.indexOf("\"", xml.indexOf("version=\"") + 9));
  }

  public void write(File f) throws IOException {
    java.nio.file.Files.write(f.toPath(), xml.getBytes());
  }

  public static String xmlToString(String xml) {
    return xml.substring(xml.indexOf('>') + 1, xml.lastIndexOf('<'));
  }

  public static String xmlToCsv(String xml) {
    return xml.substring(xml.indexOf('>') + 1, xml.lastIndexOf('<')).replaceAll("[^\\w\\s]", "").replaceAll("\\s+", " ")
        .trim();
  }

  public static String xmlToJson(String xml) {
    String json = "{";
    String[] lines = xml.split("\n");
    for (String line : lines) {
      if (line.matches("<[^>]+>")) {
        String tag = line.substring(1, line.indexOf('>'));
        String content = line.substring(line.indexOf('>') + 1, line.lastIndexOf('<'));
        json += "\"" + tag + "\":" + "\"" + content + "\",";
      }
    }
    json = json.substring(0, json.length() - 1) + "}";
    return json;
  }

  public static String xmlToHtml(String xml) {
    String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n</head>\n<body>\n";
    String[] lines = xml.split("\n");
    for (String line : lines) {
      if (line.matches("<[^>]+>")) {
        String tag = line.substring(1, line.indexOf('>'));
        String content = line.substring(line.indexOf('>') + 1, line.lastIndexOf('<'));
        html += "<" + tag + ">" + content + "</" + tag + ">\n";
      }
    }
    html += "</body>\n</html>";
    return html;
  }
}
