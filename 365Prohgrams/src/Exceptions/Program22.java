package Exceptions;
import java.nio.*;

class Program22 {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(2);
            buffer.put((byte)1);
            buffer.put((byte)2);
            buffer.put((byte)3);
        } catch (BufferOverflowException e) {
            System.out.println("Buffer overflow");
        }
    }
}
