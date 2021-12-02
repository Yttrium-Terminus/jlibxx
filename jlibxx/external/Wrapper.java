package jlibxx.external;

public interface Wrapper {
  public lang getLang();
  public lang_short getShort();
  public enum lang {
    JAVASCRIPT,
    JAVA,
    C,
    C_PLUS_PLUS,
    C_SHARP,
    PYTHON,
    RUBY,
    PERL,
    PHP,
    LUA,
    GO,
    SWIFT,
    OBJECTIVEC,
    RUST,
    HASKELL,
    SCALA,
    KOTLIN,
    D,
    DART,
    TYPESCRIPT,
    BASH,
    CLOJURE,
    LISP,
    ELIXIR,
    FSHARP,
    FOREIGN,
    UNKNOWN,
    CRYSTAL,
    HTML,
    XML,
    CSS,
    LESS,
    SASS,
    SCSS,
    STYLUS;
  }

  public enum lang_short {
    JS,
    JAVA,
    C,
    CPP,
    CS,
    PY,
    RUBY,
    PERL,
    PHP,
    LUA;
  }
  
}
