package sba_pracrice;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class StreamsClass {

    public static void main(String[] args) throws IOException {

            // FileReader demo
//            FileReader fileReader = new FileReader("sample.txt");
//            int i = 0;
//            while ((i = fileReader.read()) != -1) {
//                System.out.println((char)i);
//            }
//
//            fileReader.close();
//
            // FileWriter demo
            // Change below path as per your PC
//            FileWriter fileWriter = new FileWriter("output.txt", true);
//            char[] chars = new char[]{'A', 'B', 'C', 'D', 'E'};
//            String content = "I love my country\n";
//            fileWriter.write(content);
//            fileWriter.write(chars);
//            fileWriter.close();

        // FileReader and FileWriter demo
//        FileReader in = null;
//        FileWriter out = null;
//
//        in = new FileReader("sample.txt");
//        out = new FileWriter("output.txt");
//
//        int c;
//
//        while((c = in.read()) != -1){
//            out.write(c);
//        }
//
//        in.close();
//        out.close();

        // PrintWriter demo
//        String data = "Well hello there added at the end";
//        PrintWriter printWriter = new PrintWriter("output.txt");
//        printWriter.println(data);
//        printWriter.close();


        // Streaming Through the file
//        FileInputStream fin = new FileInputStream("output.txt");
//        int i = 0;
//
//        while((i = fin.read()) != -1){
//            System.out.println((char) i);
//        }

        // FileInputStream and FileOutputStream demo

//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        in = new FileInputStream("sample.txt");
//        out = new FileOutputStream("output.txt");
//
//        int c;
//
//        while((c = in.read()) != -1){
//            out.write(c);
//
//        }
//        System.out.println("Reading and writing has been success!!");
//
//        in.close();
//        out.close();

//         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

//        1. Obtain a FileChannel via an InputStream, OutputStream, File class,
//        Pathclass, etc.
//        2. Declare and initialize the Buffer size.
//        3. Read from the Channel into the Buffer.

//        Creating and Opening the object of FileChannel
//        FileInputStream fin = new FileInputStream("sample.txt");
//        ReadableByteChannel rbc = fin.getChannel();

//        Allocating a buffer object with size by
//        using theallocate() method for allocating a buffer.
//        ByteBuffer bBuffer = ByteBuffer.allocate(28);
//        CharBuffer cBuffer = CharBuffer.allocate(2048);

//        However,  the above buffer size  is not a Dynamic; we can make buffer size
//        a dynamic by finding the size of the channel, and then initializing the
//        Buffer size per the size of the File channel, as shown below:

//        long fileSize = fin.getChannel().size();
//        ByteBuffer bBuffer1 = ByteBuffer.allocate((int) fileSize);

        // Reading from the Channel into the Buffer, using the read() method
//        The int returned by the read() method tells how many bytes were
//        written into the Buffer. If -1is returned, the end-of-file is reached.
//        int btyesRead = rbc.read(bBuffer1);

//        Note: There are two methods for writing the data into a Buffer:
//        - read() is a  method of Filechannel class; it is used to write data from channel
//        to buffer.
//        - put() is a method of buffer, which is used to write data in
//        buffer.

//        Example that reads the data from the Buffer using get() method
//        byte aByte = bBuffer1.get();

        // The flip() method switches the mode of the buffer from writing,
        // to reading mode. It also sets the position back to 0 and sets
        // the limit to where the position was at the time of writing.

//        rbc.close();

//         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        String fileName = "output.txt";
        FileInputStream fis = new FileInputStream(fileName);
        FileChannel fileChannel = fis.getChannel();
        long filesize = fileChannel.size();
        ByteBuffer bBuffer2 = ByteBuffer.allocate((int) filesize);
         while (fileChannel.read(bBuffer2) > 0){
             bBuffer2.flip();
             while (bBuffer2.hasRemaining()){
                 System.out.println((char) bBuffer2.get());
             }
         }
         fis.close();
         fileChannel.close();



    }
}
