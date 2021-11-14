package test.util;

import jlibxx.util.JSONParser;

public class TestJSONParser {
  public static void main(String[] args) {
    JSONParser parser = new JSONParser("{\"name\":\"jlibxx\",\"version\":\"0.0.1\"}");
    System.out.println(parser.parse("\"name\""));
    System.out.println(parser.toXML());
  }
}
