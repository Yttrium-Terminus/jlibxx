package jlibxx.human

import jlibxx.human.ch
import jlibxx.util.lang.LanguageObject

/**
 * @author Jack Meng
 * @since 1.1
 *
 *
 * This enum constant holds
 * the values for transcribing
 * and validating characters relating
 * to the language of Simplified Chinese
 *
 */
enum class ch(private val parts: String) {
    CHINESE_REGEX("[\\u4e00-\\u9fa5]");

    companion object {
        private var s: String? = null

        /**
         *
         * There are two versions of the following methods
         * with the only difference being that one takes a
         * standard LanguageObject, while the other interprets
         * using a String
         *
         *
         * @return A true or false representing if the String is Chinese or not
         */
        fun isChinese(s: String): Boolean {
            Companion.s = s
            return s.matches(CHINESE_REGEX.toString())
        }

        @JvmStatic
        fun isChinese(obj: LanguageObject): Boolean {
            return obj.toString().matches(CHINESE_REGEX.toString())
        }
    }
}