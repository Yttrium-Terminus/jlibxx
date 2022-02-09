package jlibxx.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;

import jlibxx.docmaker.Note;
import jlibxx.runtime.util.ZipProcessExpired;

/**
 * <h1>Zip File Archiver</h1>
 * 
 * <p>
 * This class aids to archive files into a zip file.
 * Note: Only *.zip files and not of other
 * compression and archive types like rar, tar, etc.
 * 
 * The user shall also note that once the files have
 * been archived, this process is deemed "dead" and
 * cannot be re-archived or re-flushed.
 * {@link jlibxx.runtime.util.ZipProcessExpired}
 * </p>
 * 
 * @author Jack meng
 * @version 1.2
 * @since 1.1
 */

@Note(note = "This class will eliminate all files that are duplicates")
public class Zip {
  private HashSet<File> files = new HashSet<>();
  private boolean alreadyArchived = false;

  public Zip(File... file_list) throws FileNotFoundException {
    assert !alreadyArchived;
    for (final File file : file_list) {
      if (file.exists()) {
        files.add(file);
      } else {
        throw new FileNotFoundException("Zip Archiver: File not found: " + file.getAbsolutePath());
      }
    }
  }

  public Zip(String... files_list) throws FileNotFoundException {
    assert !alreadyArchived;
    for (final String fx : files_list) {
      File f = new File(fx);
      if (f.exists())
        files.add(f);
      else {
        throw new FileNotFoundException("Zip Archiver: File not found: " + f.getAbsolutePath());
      }
    }
  }

  public void add(String... files_list) throws FileNotFoundException {
    if (alreadyArchived)
      throw new ZipProcessExpired(
          "Zip Process Expired: Cannot add files to a zip file that has already been archived.");
    for (final String fx : files_list) {
      File f = new File(fx);
      if (f.exists())
        files.add(f);
      else {
        throw new FileNotFoundException("Zip Archiver: File not found: " + f.getAbsolutePath());
      }
    }
  }

  public void add(File... filesx) throws FileNotFoundException {
    if (alreadyArchived)
      throw new ZipProcessExpired(
          "Zip Process Expired: Cannot add files to a zip file that has already been archived.");
    for (final File file : filesx) {
      if (file.exists()) {
        files.add(file);
      } else {
        throw new FileNotFoundException("Zip Archiver: File not found: " + file.getAbsolutePath());
      }
    }
  }

  @Note(note = "This method will crash your current program in order to make sure that the process is ended. Make sure to surround with try-catch.")
  public boolean process() {
    if (alreadyArchived)
      throw new ZipProcessExpired(
          "Zip Process Expired!");
    return alreadyArchived;
  }

  public void archive() throws Exception {
    if(alreadyArchived)
      throw new ZipProcessExpired(
          "Zip Process Expired! Cannot make a new archive if the process has already expired");
    try {
      // incomplete
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
