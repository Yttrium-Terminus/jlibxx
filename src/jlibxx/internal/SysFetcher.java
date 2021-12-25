package jlibxx.internal;

public abstract class SysFetcher {

  
  /** 
   * <p>
   * Attempts to get the name of the 
   * client's operating system
   * </p>
   * @return The Operating System's name
   */
  public String getOSName() {
    return System.getProperty("os.name");
  }

  
  /** 
   * @return The architecture of the client's computer
   */
  public String getOSArch() {
    return System.getProperty("os.arch");
  }

  
  /** 
   * @return The Version of the operating System
   */
  public String getOSVersion() {
    return System.getProperty("os.version");
  }

  
  /** 
   * @return The Username of the client/host
   */
  public String getUserName() {
    return System.getProperty("user.name");
  }

  
  /** 
   * @return The root user
   */
  public String getUserHome() {
    return System.getProperty("user.home");
  }

  
  /** 
   * @return Get the main directory of the user (not root)
   */
  public String getUserDir() {
    return System.getProperty("user.dir");
  }

  
  /** 
   * @return The system's default file separator
   */
  public String getFileSeparator() {
    return System.getProperty("file.separator");
  }

  
  /** 
   * @return The system's default file separator
   */
  public String getPathSeparator() {
    return System.getProperty("path.separator");
  }

  
  /** 
   * @return The system's default line separator
   */
  public String getLineSeparator() {
    return System.getProperty("line.separator");
  }

  
  /** 
   * @return The System's Java Version
   */
  public String getJavaVersion() {
    return System.getProperty("java.version");
  }

  
  /** 
   * @return The vendor of the Java (if Java is installed)
   */
  public String getJavaVendor() {
    return System.getProperty("java.vendor");
  }

  
  /** 
   * @return Direct link to the vendor
   */
  public String getJavaVendorURL() {
    return System.getProperty("java.vendor.url");
  }


  
  /** 
   * @return JVM version (if Java is installed)
   */
  public String getJavaVMVersion() {
    return System.getProperty("java.vm.version");
  }


  
  /** 
   * @return String Get's the specific java version
   */
  public String getJavaSpecificationVersion() {
    return System.getProperty("java.specification.version");
  }

  
  /** 
   * @return String Java Vendor
   */
  public String getJavaSpecificationVendor() {
    return System.getProperty("java.specification.vendor");
  }

  
  /** 
   * @return String
   */
  public String getJavaSpecificationName() {
    return System.getProperty("java.specification.name");
  }

  
  /** 
   * @return String
   */
  public String getJavaClassVersion() {
    return System.getProperty("java.class.version");
  }

  
  /** 
   * @return String
   */
  public String getJavaClassPath() {
    return System.getProperty("java.class.path");
  }

  
  /** 
   * @return String
   */
  public String getJavaLibraryPath() {
    return System.getProperty("java.library.path");
  }

  
  /** 
   * @return String
   */
  public String getJavaIODir() {
    return System.getProperty("java.io.tmpdir");
  }

  
  /** 
   * @return String
   */
  public String getJavaCompiler() {
    return System.getProperty("java.compiler");
  }

  
  /** 
   * @return String
   */
  public String getJavaExtDirs() {
    return System.getProperty("java.ext.dirs");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMArgs() {
    return System.getProperty("java.vm.args");
  }

  
  /** 
   * @return String
   */
  public String getJavaSpecificationVendorURL() {
    return System.getProperty("java.specification.vendor.url");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMSpecificationVersion() {
    return System.getProperty("java.vm.specification.version");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMSpecificationVendor() {
    return System.getProperty("java.vm.specification.vendor");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMSpecificationName() {
    return System.getProperty("java.vm.specification.name");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMVersion2() {
    return System.getProperty("java.vm.version");
  }

  
  /** 
   * @return boolean
   */
  public boolean is64Bit() {
    return System.getProperty("sun.arch.data.model").equals("64");
  }

  
  /** 
   * @return boolean
   */
  public boolean is32Bit() {
    return System.getProperty("sun.arch.data.model").equals("32");
  }
}
