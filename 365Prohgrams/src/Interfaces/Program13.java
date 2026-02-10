package Interfaces;
interface Serializable {
    void serialize();
}

interface Deserializable {
    void deserialize();
}

class FileData implements Serializable {
    public void serialize() {
        System.out.println("File serialized");
    }
}

class DatabaseData implements Deserializable {
    public void deserialize() {
        System.out.println("Database deserialized");
    }
}

public class Program13 {
    public static void main(String[] args) {
        FileData f = new FileData();
        DatabaseData d = new DatabaseData();

        f.serialize();
        d.deserialize();
    }
}
