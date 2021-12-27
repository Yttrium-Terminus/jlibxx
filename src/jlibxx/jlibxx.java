/**
 * <h1>Java Lib++ Information File</h1>
 * @author Jack Meng
 * @since 1.0
 * 
 * <p>This enum is a standard library configuration file.</p>
 * <p>It is used to get quick information on what version of JLibxx is being used</p>
 * <p>This means everything here shall not be modified and is protected under</p>
 * <p>a very strict licensing</p>
 * 
 */

package jlibxx;

/**
 * @author Jack Meng
 *         <p>
 *         USAGE Example: {@code jlibxx.VERSION.get()}
 *         </p>
 * 
 *         <ul>
 *         <li>{@code VERSION} : the current version number</li>
 *         <li>{@code PATCH_VERSION} : the patch version</li>
 *         <li>{@code AUTHOR} : maintainer and curator</li>
 *         <li>{@code AUTHOR_SEMI} : maintainer's username</li>
 *         <li>{@code LIB_NAME} : This library's nameset</li>
 *         <li>{@code JAVA_VERSION_MIN} : Best Supported Java Version</li>
 *         <li>{@code JAVA_VERSION_USED} : Standardized Version used during
 *         development</li>
 *         <li>{@code REPOSITORY_HTTTP} : Github Repository</li>
 *         <li>{@code LICENSE} : License</li>
 *         <li>{@code LICENSE_URL} : License URL</li>
 *         <li>{@code NATIVE_LANG} : Native Language</li>
 *         <li>{@code NATIVE_LANG_2} : Native Language 2</li>
 *         <li>{@code NATIVE_LANG_3} : Native Language 3</li>
 *         </ul>
 */
public abstract class jlibxx {
  private jlibxx() {
  }

  public static final String VERSION = "1.1";
  public static final String PATCH_VERSION = "1.0.2";
  public static final String AUTHOR = "Jack Meng";
  public static final String AUTHOR_SEMI = "jmeng";
  public static final String LIB_NAME = "jlibxx";
  public static final String JAVA_VERSION_MIN = "1.8";
  public static final String JAVA_VERSION_USED = "1.8";
  public static final String REPOSITORY_HTTTP = "https://github.com/Yttrium-Terminus/jlibxx";
  public static final String LICENSE = "EPL-v2.0";
  public static final String LICENSE_URL = "https://github.com/Yttrium-Terminus/jlibxx/blob/master/LICENSE";
  public static final String NATIVE_LANG = "EnglishUSA";
  public static final String NATIVE_LANG_2 = "Chinese-Simplified";
  public static final String NATIVE_LANG_3 = "Japanese";

}
