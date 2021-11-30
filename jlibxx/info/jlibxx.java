/**
 * <h1>Java Lib++ Information File</h1>
 * @author Jack Meng
 * @since 1.0
 * 
 * <p>This enum is a standard library configuration file.
 * <p>It is used to get quick information on what version of JLibxx is being used
 * <p>This means everything here shall not be modified and is protected under
 * <p>a very strict licensing
 * 
 */

package jlibxx.info;

/**
 * @author Jack Meng
 * @category info
 * <p> USAGE Example: {@code jlibxx.VERSION.get()}
 * 
 * <ul>
 *  <li>{@code VERSION} : the current version number</li>
 *  <li>{@code AUTHOR} : maintainer and curator</li>
 *  <li>{@code AUTHOR_SEMI} : maintainer's username</li>
 *  <li>{@code LIB_NAME} : This library static nameset</li>
 *  <li>{@code JAVA_VERSION_MIN} : Best Supported Java Version</li>
 *  <li>{@code JAVA_VERSION_USED} : Standardized Version used during development</li>
 * </ul>
 */
public enum jlibxx {

  VERSION("1.0"),
  AUTHOR("Jack Meng"),
  AUTHOR_SEMI("exoad"),
  LIB_NAME("JLib++"),
  JAVA_VERSION_MIN("1.8"),
  JAVA_VERSION_USED("11"),
  REPOSITORY_HTTTP("https://github.com/exoad/jlibxx.git"),
  LICENSE("Eclipse Public License 2.0"),
  LICENSE_URL("https://www.eclipse.org/legal/epl-2.0/");

  public final String J;
  jlibxx(String j) {
    this.J = j;
  }
  public Object get() {
    return this.J;
  }
}
