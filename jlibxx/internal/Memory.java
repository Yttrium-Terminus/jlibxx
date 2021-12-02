package jlibxx.internal;

public class Memory {

  public static final int BLOCK_SIZE = 1024;
  private byte address;
  private byte[] block;

  public Memory(byte address) {
    this.address = address;
    this.block = new byte[BLOCK_SIZE];
  }

  
  /** 
   * @return byte
   */
  public byte getAddress() {
    return address;
  }

  
  /** 
   * @return byte[]
   */
  public byte[] getBlock() {
    return block;
  }

  
  /** 
   * @param size
   */
  public void extend(int size) {
    byte[] newBlock = new byte[size];
    System.arraycopy(block, 0, newBlock, 0, block.length);
    block = newBlock;
  }

  
  /** 
   * @return String
   */
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Memory block at ").append(address).append("\n");
    for (int i = 0; i < block.length; i += 16) {
      sb.append(String.format("%04x: ", i));
      for (int j = 0; j < 16; j++) {
        if (i + j < block.length) {
          sb.append(String.format("%02x ", block[i + j]));
        } else {
          sb.append("   ");
        }
      }
      sb.append(" ");
      for (int j = 0; j < 16; j++) {
        if (i + j < block.length) {
          sb.append((char) block[i + j]);
        } else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  
  /** 
   * @param b
   */
  public void append(byte b) {
    if (block.length == 0) {
      block = new byte[1];
      block[0] = b;
    } else {
      byte[] newBlock = new byte[block.length + 1];
      System.arraycopy(block, 0, newBlock, 0, block.length);
      newBlock[block.length] = b;
      block = newBlock;
    }
  }

  public void free() {
    block = null;
  }

  
  /** 
   * @return Memory
   */
  public Memory copy() {
    Memory m = new Memory(address);
    m.block = new byte[block.length];
    System.arraycopy(block, 0, m.block, 0, block.length);
    return m;
  }

  
  /** 
   * @param index
   * @param b
   */
  public void set(int index, byte b) {
    if (index < block.length) {
      block[index] = b;
    }
  }

  
  /** 
   * @return boolean
   */
  public boolean isEmpty() {
    for (int i = 0; i < block.length; i++) {
      if (block[i] != 0) {
        return false;
      }
    }
    return true;
  }

  
  /** 
   * @param filename
   * @param block
   */
  // dump a given memory block to a file
  public static void dump(String filename, byte[] block) {
    try(java.io.FileOutputStream fos = new java.io.FileOutputStream(filename);) {
      
      fos.write(block);
    } catch (java.io.IOException e) {
      System.err.println("Error writing to file " + filename);
    }
  }

}
