package Main;
import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    @Override
    public void writeStreamHeader(){}
}
