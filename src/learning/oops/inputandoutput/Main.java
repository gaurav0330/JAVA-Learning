package learning.oops.inputandoutput;

/*
 System class come from java.lang (auto import)
out / err -> PrintStream
 in -> InputStream

 Streams --> flow of data
 input stream / output stream

 InputStream and OutputStream (Abstract class) provide read and write abstract


 Java I/O --> Stream Based(console , bite , nw , memory)

Reader -> BufferReader InputStreamReader , FileReader
Stream of character read
BufferReader(stream of character) --> Read  a chunk of character from OS Buffer
store it in memory
give then to program when required

InputStream (Stream of byte) <- (InputStreamReader) <-(BufferReader)

so we Scanner Class for it
Scanner sc = new Scanner(System.in) // keyboard
Scanner sc = new File("path") // keyboard


*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Nobita calling you");
        System.err.println("bye");


        // CLass System -> PrintStream out (static)
        // class PrintStream  -> print()


    }
}
