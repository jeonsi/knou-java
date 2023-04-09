import java.io.*;

public class ExceptionTest {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        // } catch (EOFException e1) {
        //     System.out.println(e1.toString());
        //     e1.printStackTrace();
        // } catch (IOException e2) {
        //     System.out.println(e2.toString());
        //     e2.printStackTrace();
        // }
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("finally 블록");
        }

        try {
            int i = 5 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // System.out.println(i);

        try {
            int[] a = new int[5];
            a[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        CharInput charInput = new CharInput();
        try {
            System.out.println(charInput.getInput());
        } catch (IOException ex) {
            System.out.println(ex);
         }
    }
}

class CharInput {
    int nInput = 0;
    public char getInput() throws IOException {
    // try {
    //     nInput = System.in.read();
    // } catch (IOException ex) {
    //     System.out.println(ex);
    // }
    nInput = System.in.read();
    return (char)nInput;
    }
}