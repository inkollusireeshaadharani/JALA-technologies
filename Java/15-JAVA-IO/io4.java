//Write text to a .txt file using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class io4 {

  public static void main(String[] args) throws Exception {
    BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(
        "write.txt"));
    bufferedOutput.write("Line one".getBytes());
    bufferedOutput.write("\n".getBytes());

    bufferedOutput.write(65);
    bufferedOutput.close();
  }
}