package jlibxx;

/**
 * <h1>JLibXX functionality Tester</h1>
 * 
 * <p>
 * This class is used to test the functionality of JLibXX.
 * If for some reason JLibXX isn't working properly,
 * resort to this class and call each individaul methods separately.
 * </p>
 * 
 * @author Jack Meng
 * @since 1.1
 * @version 1.2
 * @see <a href="https://github.com/Yttrium-Terminus/jlibxx/issues">Github
 *      Issues</a>
 */

import jlibxx.runtime.definition.deepdef.OccurError;

public abstract class Runner {
    private Runner() {
    }

    /**
     * <p>
     * This method can be called to fetch all details about
     * JLibXX and also to make sure everything is
     * installed properply.
     * </p>
     * 
     * @throws OccurError
     */
    public static void init() throws OccurError {
        System.out.println("Initializing JLibXX...");
        System.out.println("JLibXX Version: " + jlibxx.VERSION);
        System.out.println("JLibXX Author: " + jlibxx.AUTHOR);
        System.out.println("JLibXX Author Semi: " + jlibxx.AUTHOR_SEMI);
        System.out.println("JLibXX Library Name: " + jlibxx.LIB_NAME);
        System.out.println("JLibXX Java Version Minimum: " + jlibxx.JAVA_VERSION_MIN);
        System.out.println("JLibXX Java Version Used: " + jlibxx.JAVA_VERSION_USED);
        System.out.println("JLibXX Repository: " + jlibxx.REPOSITORY_HTTTP);
        System.out.println("JLibXX License: " + jlibxx.LICENSE);
        System.out.println("JLibXX License URL: " + jlibxx.LICENSE_URL);
        System.out.println("JLibXX Native Language: " + jlibxx.NATIVE_LANG);
        System.out.println("JLibXX Native Language 2: " + jlibxx.NATIVE_LANG_2);
        System.out.println("JLibXX Native Language 3: " + jlibxx.NATIVE_LANG_3);
        System.out.println("JLibXX Initialization Complete!");
        
    }

}
