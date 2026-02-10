package Static;
class CountObjects {
    static int count = 0;

    CountObjects() {
        count++;
    }
}
class Program1{
    public static void main(String[] args) {
        new CountObjects();
        new CountObjects();
        new CountObjects();
        System.out.println("Objects created: " +CountObjects. count);
    }
}

