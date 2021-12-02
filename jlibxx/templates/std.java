
package jlibxx.templates;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.MemoryHandler;

import jlibxx.util.Pair;

/**
 * <h1>Standard Template Library</h1>
 * <a>This file provides a simple bits implementation like from C++.</a>
 * <a>However the user still must provide the implementations</
 * 
 * @author Jack Meng
 * @version 1.1
 * @since 1.2
 * @see <a href="http://www.cplusplus.com/reference/clibrary/cstdio/">C++
 *      Standard Library</a>
 */
public abstract class std {
  private std() {
  }

  static final String endl = "\n";
  static final byte INT_MAX = 127;
  static final byte INT_MIN = -128;
  static final short SHORT_MAX = 32767;
  static final short SHORT_MIN = -32768;
  static final int INT_MAX_VALUE = 2147483647;
  static final int INT_MIN_VALUE = -2147483648;
  static final long LONG_MAX_VALUE = 9223372036854775807L;
  static final long LONG_MIN_VALUE = -9223372036854775808L;
  static final float FLOAT_MAX_VALUE = 3.4028235E38f;
  static final float FLOAT_MIN_VALUE = 1.4E-45f;
  static final double DOUBLE_MAX_VALUE = 1.7976931348623157E308;
  static final double DOUBLE_MIN_VALUE = 4.9E-324;
  static final char CHAR_MAX = 65535;
  static final char CHAR_MIN = 0;
  static final boolean TRUE = true;
  static final boolean FALSE = false;
  static final Object NULL = null;
  static final String EMPTY = "";
  static Scanner sc = new Scanner(System.in);
  static MemoryHandler mh;
  static BufferedInputStream bis;
  static BufferedOutputStream bos;
  static CharArrayReader car;
  static CharArrayWriter caw;
  static ByteArrayInputStream bais;
  static ByteArrayOutputStream baos;
  static Console console;
  static PrintStream ps;
  static PushbackReader pbr;
  static StringReader sr;
  static StringWriter sw;
  static PrintWriter pw;
  static AbstractList<String> alists;
  static AbstractList<Integer> alisti;
  static AbstractList<Long> alistl;
  static AbstractList<Double> alistd;
  static AbstractList<Character> alistc;
  static AbstractList<Boolean> alistb;
  static AbstractMap<String, String> amapss;
  static AbstractMap<String, Integer> amapsi;
  static AbstractMap<String, Long> amapsl;
  static AbstractMap<String, Double> amapsd;
  static AbstractMap<String, Character> amapsc;
  static AbstractMap<String, Boolean> amapsb;
  static AbstractMap<Integer, String> amapisi;
  static AbstractMap<Integer, Integer> amapii;
  static AbstractMap<Integer, Long> amapil;
  static AbstractMap<Integer, Double> amapid;
  static AbstractMap<Integer, Character> amapic;
  static AbstractMap<Integer, Boolean> amapib;
  static AbstractMap<Long, String> amaplsi;
  static AbstractMap<Long, Integer> amapli;
  static AbstractMap<Long, Long> amapll;
  static AbstractMap<Long, Double> amapld;
  static AbstractMap<Long, Character> amaplc;
  static AbstractMap<Long, Boolean> amaplb;
  static AbstractMap<Double, String> amapdsi;
  static AbstractMap<Double, Integer> amapdi;
  static AbstractMap<Double, Long> amapdl;
  static AbstractMap<Double, Double> amapdd;
  static AbstractMap<Double, Character> amapdc;
  static AbstractMap<Double, Boolean> amapdb;
  static AbstractMap<Character, String> amapcsi;
  static AbstractMap<Character, Integer> amapci;
  static AbstractMap<Character, Long> amapcl;
  static AbstractMap<Character, Double> amapcd;
  static AbstractMap<Character, Character> amapcc;
  static AbstractMap<Character, Boolean> amapcb;
  static AbstractMap<Boolean, String> amapbsi;
  static AbstractMap<Boolean, Integer> amapbi;
  static AbstractMap<Boolean, Long> amapbl;
  static AbstractMap<Boolean, Double> amapbd;
  static AbstractMap<Boolean, Character> amapbc;
  static AbstractMap<Boolean, Boolean> amapbb;
  static Exception e;
  static IOException ioe;
  static RuntimeException re;
  static StringBuilder sb2;
  static BufferedReader br;
  static ArrayList<String> als;
  static ArrayList<Integer> ais;
  static ArrayList<Long> all;
  static ArrayList<Double> ald;
  static ArrayList<Boolean> alb;
  static ArrayList<Object> alobj;
  static ArrayList<ArrayList<Object>> alalobj;
  static StringTokenizer st;
  static Pair<Object, Object> pair;
  static Iterator<String> its;
  static Iterator<Integer> iti;
  static Iterator<Long> itl;
  static Iterator<Double> itd;
  static Iterator<Boolean> itb;
  static Iterator<Object> itobj;
  static Iterator<ArrayList<Object>> italobj;
  static HashSet<String> hss;
  static HashSet<Integer> hsi;
  static HashSet<Long> hsl;
  static HashSet<Double> hsd;
  static HashSet<Boolean> hsb;
  static HashSet<Object> hsobj;
  static HashSet<ArrayList<Object>> hasalobj;
  static HashMap<String, Object> hmsobj;
  static HashMap<Integer, Object> hmsiobj;
  static HashMap<Long, Object> hmslobj;
  static HashMap<Double, Object> hmsdobj;
  static HashMap<Boolean, Object> hmsbobj;
  static HashMap<Object, Object> hmsobjobj;
  static HashMap<ArrayList<Object>, Object> hmsalobjobj;
  static HashMap<String, ArrayList<Object>> hmsalobjsobj;
  static HashMap<Integer, ArrayList<Object>> hmsalobjsiobj;
  static HashMap<Long, ArrayList<Object>> hmsalobjslobj;
  static HashMap<Double, ArrayList<Object>> hmsalobjsdobj;
  static HashMap<Boolean, ArrayList<Object>> hmsalobjsbobj;
  static HashMap<Object, ArrayList<Object>> hmsalobjsobjobj;
  static LinkedList<String> lls;
  static LinkedList<Integer> llsi;
  static LinkedList<Long> llsl;
  static LinkedList<Double> llsd;
  static LinkedList<Boolean> llsb;
  static LinkedList<Object> llobj;
  static LinkedList<ArrayList<Object>> llalobj;
  static LinkedList<HashSet<Object>> llhsobj;
  static LinkedList<HashMap<Object, Object>> llhmsobj;
  static LinkedList<LinkedList<Object>> llllobj;
  static LinkedList<ArrayList<ArrayList<Object>>> llalalobj;
  static LinkedList<HashSet<ArrayList<Object>>> llhasalobj;
  static LinkedList<HashMap<ArrayList<Object>, Object>> llhmsalobj;
  static LinkedList<LinkedList<ArrayList<Object>>> llllalobj;
  static LinkedList<HashSet<HashSet<Object>>> llhshsobj;
  static LinkedList<HashMap<HashSet<Object>, Object>> llhmshsobj;
  static LinkedList<LinkedList<HashSet<Object>>> llllhsobj;
  static LinkedList<HashMap<HashMap<Object, Object>, Object>> llhmshsobjobj;
  static File f;
  static FileReader fr;
  static FileWriter fw;
  static BufferedWriter bw;
  static InputStreamReader isr;
  static InputStream is;
  static OutputStream os;
  static OutputStreamWriter osw;
  static Deque<String> dqs;
  static Deque<Integer> dqsi;
  static Deque<Long> dqsl;
  static Deque<Double> dqsd;
  static Deque<Boolean> dqsb;
  static Deque<Object> dqobj;
  static Deque<ArrayList<Object>> dqalobj;
  static Deque<HashSet<Object>> dqhsobj;
  static Deque<HashMap<Object, Object>> dqhmsobj;
  static Deque<LinkedList<Object>> dqllobj;
  static Deque<ArrayList<ArrayList<Object>>> dqalalobj;
  static Deque<HashSet<ArrayList<Object>>> dqhasalobj;
  static Deque<HashMap<ArrayList<Object>, Object>> dqhmsalobj;
  static Deque<LinkedList<ArrayList<Object>>> dqllalobj;
  static Deque<HashSet<HashSet<Object>>> dqhshsobj;
  static Deque<HashMap<HashSet<Object>, Object>> dqhmshsobj;
  static Deque<LinkedList<HashSet<Object>>> dqllhsobj;
  static Deque<HashMap<HashMap<Object, Object>, Object>> dqhmshsobjobj;

  
  /** 
   * @param t
   */
  static <T> void print(T t) {
    System.out.println(t);
  }

  
  /** 
   * @param t
   */
  static <T> void println(T t) {
    System.out.println(t);
  }

  static synchronized void flush() {
    System.out.flush();
  }

  static synchronized void clearConsole() {
    System.out.print("\033[H\033[2J");
    flush();
  }

}
