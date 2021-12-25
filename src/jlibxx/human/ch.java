package jlibxx.human;

/**
 * @author Jack Meng
 * @since 1.1
 * <p>
 * This enum constant holds
 * the values for transcribing
 * and validating characters relating
 * to the language of Simplified Chinese
 * </p>
 */

public enum ch {

    CHINESE_REGEX("[\\u4e00-\\u9fa5]");

    private String parts;

    ch(String s) {
        parts = s;
    }

    /**
     * <p>There are two versions of the following methods
     * with the only difference being that one takes a
     * standard LanguageObject, while the other interprets
     * using a String
     * </p>
     *
     * @return A true or false representing if the String is Chinese or not
     */
    public static boolean isChinese(String s) {
        return s.matches(CHINESE_REGEX.toString());
    }

    public static boolean isChinese(jlibxx.util.lang.LanguageObject obj) {
        return obj.toString().matches(CHINESE_REGEX.toString());
    }

}
