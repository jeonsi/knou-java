import java.io.*;

public class DataInputOutputTest {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("./ch08.java.io/data.txt");
            DataOutputStream dos = new DataOutputStream(os);

            dos.writeUTF("Hello");
            dos.writeInt(100);
            dos.writeDouble(3.14);
            dos.flush();
            dos.close();

            InputStream is = new FileInputStream("./ch08.java.io/data.txt");
            DataInputStream dis = new DataInputStream(is);

            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            dis.close();
        } catch(Exception e) {System.out.println(e);}
    }    
}
