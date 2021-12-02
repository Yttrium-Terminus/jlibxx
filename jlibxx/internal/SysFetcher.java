package jlibxx.internal;

public abstract class SysFetcher {

  
  /** 
   * @return String
   */
  public String getOSName() {
    return System.getProperty("os.name");
  }

  
  /** 
   * @return String
   */
  public String getOSArch() {
    return System.getProperty("os.arch");
  }

  
  /** 
   * @return String
   */
  public String getOSVersion() {
    return System.getProperty("os.version");
  }

  
  /** 
   * @return String
   */
  public String getUserName() {
    return System.getProperty("user.name");
  }

  
  /** 
   * @return String
   */
  public String getUserHome() {
    return System.getProperty("user.home");
  }

  
  /** 
   * @return String
   */
  public String getUserDir() {
    return System.getProperty("user.dir");
  }

  
  /** 
   * @return String
   */
  public String getFileSeparator() {
    return System.getProperty("file.separator");
  }

  
  /** 
   * @return String
   */
  public String getPathSeparator() {
    return System.getProperty("path.separator");
  }

  
  /** 
   * @return String
   */
  public String getLineSeparator() {
    return System.getProperty("line.separator");
  }

  
  /** 
   * @return String
   */
  public String getJavaVersion() {
    return System.getProperty("java.version");
  }

  
  /** 
   * @return String
   */
  public String getJavaVendor() {
    return System.getProperty("java.vendor");
  }

  
  /** 
   * @return String
   */
  public String getJavaVendorURL() {
    return System.getProperty("java.vendor.url");
  }

  
  /** 
   * @return String
   */
  public String getJavaHome() {
    return System.getProperty("java.home");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMVersion() {
    return System.getProperty("java.vm.version");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMVendor() {
    return System.getProperty("java.vm.vendor");
  }

  
  /** 
   * @return String
   */
  public String getJavaVMName() {
    return System.getProperty("java.vm.name");
  }

  
  /** 
   * @return String
   */
  public String getJavaSpecificationVersion() {
    return System.getProperty("java.specification.version");
  }

  
  /** 
   * @return String
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
