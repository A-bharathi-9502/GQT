package Interfaces;
interface Writable {
    void write();
}

interface Readable {
    void read();
}

class TextFile implements Writable {
    public void write() {
        System.out.println("Writing to text file");
    }
}

class DatabaseTable implements Readable {
    public void read() {
        System.out.println("Reading from database table");
    }
}

public class Program27 {
    public static void main(String[] args) {
        TextFile t = new TextFile();
        DatabaseTable d = new DatabaseTable();

        t.write();
        d.read();
    }
}
