package jlibxx.internal;

public abstract class SysFetcher {

  public String getOSName() {
    return System.getProperty("os.name");
  }

  public String getOSArch() {
    return System.getProperty("os.arch");
  }

  public String getOSVersion() {
    return System.getProperty("os.version");
  }

  public String getUserName() {
    return System.getProperty("user.name");
  }

  public String getUserHome() {
    return System.getProperty("user.home");
  }

  public String getUserDir() {
    return System.getProperty("user.dir");
  }

  public String getFileSeparator() {
    return System.getProperty("file.separator");
  }

  public String getPathSeparator() {
    return System.getProperty("path.separator");
  }

  public String getLineSeparator() {
    return System.getProperty("line.separator");
  }

  public String getJavaVersion() {
    return System.getProperty("java.version");
  }

  public String getJavaVendor() {
    return System.getProperty("java.vendor");
  }

  public String getJavaVendorURL() {
    return System.getProperty("java.vendor.url");
  }

  public String getJavaHome() {
    return System.getProperty("java.home");
  }

  public String getJavaVMVersion() {
    return System.getProperty("java.vm.version");
  }

  public String getJavaVMVendor() {
    return System.getProperty("java.vm.vendor");
  }

  public String getJavaVMName() {
    return System.getProperty("java.vm.name");
  }

  public String getJavaSpecificationVersion() {
    return System.getProperty("java.specification.version");
  }

  public String getJavaSpecificationVendor() {
    return System.getProperty("java.specification.vendor");
  }

  public String getJavaSpecificationName() {
    return System.getProperty("java.specification.name");
  }

  public String getJavaClassVersion() {
    return System.getProperty("java.class.version");
  }

  public String getJavaClassPath() {
    return System.getProperty("java.class.path");
  }

  public String getJavaLibraryPath() {
    return System.getProperty("java.library.path");
  }

  public String getJavaIODir() {
    return System.getProperty("java.io.tmpdir");
  }

  public String getJavaCompiler() {
    return System.getProperty("java.compiler");
  }

  public String getJavaExtDirs() {
    return System.getProperty("java.ext.dirs");
  }

  public String getJavaVMArgs() {
    return System.getProperty("java.vm.args");
  }

  public String getJavaSpecificationVendorURL() {
    return System.getProperty("java.specification.vendor.url");
  }

  public String getJavaVMSpecificationVersion() {
    return System.getProperty("java.vm.specification.version");
  }

  public String getJavaVMSpecificationVendor() {
    return System.getProperty("java.vm.specification.vendor");
  }

  public String getJavaVMSpecificationName() {
    return System.getProperty("java.vm.specification.name");
  }

  public String getJavaVMVersion2() {
    return System.getProperty("java.vm.version");
  }

  public boolean is64Bit() {
    return System.getProperty("sun.arch.data.model").equals("64");
  }

  public boolean is32Bit() {
    return System.getProperty("sun.arch.data.model").equals("32");
  }
}
