package SwingExample;

public class QuestionBank {

    public static String[] questions = {
        "Java is a ___ language?",
        "Which keyword is used to inherit a class?",
        "Size of int data type in Java?",
        "Which operator is used for logical AND?",
        "Which company developed Java?",
        "JVM stands for?",
        "Which loop is entry controlled?",
        "Default value of boolean?",
        "Which package is auto imported?",
        "Entry point of Java program?"
    };

    public static String[][] options = {
        {"Low-level", "High-level", "Assembly", "Machine"},
        {"super", "this", "extends", "implements"},
        {"2 bytes", "4 bytes", "8 bytes", "Depends"},
        {"&", "|", "&&", "||"},
        {"Google", "Microsoft", "Sun Microsystems", "Apple"},
        {"Java VM", "Java Visual Model", "Java Variable Method", "None"},
        {"for", "while", "do-while", "foreach"},
        {"true", "false", "0", "null"},
        {"java.util", "java.io", "java.lang", "java.sql"},
        {
            "public static void main(String args[])",
            "static void main()",
            "void main(String[] args)",
            "main(String args)"
        }
    };

    public static char[] answers = {
        'b','c','b','c','c','a','a','b','c','a'
    };
}
