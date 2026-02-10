package Interfaces;
class Program12 implements Drawable, Resizable {
    public void draw() {
        System.out.println("Drawing shape");
    }
    public void resize() {
        System.out.println("Resizing shape");
    }
    public static void main(String[] args) {
        Program1 s = new Program1();
        s.draw();
        s.resize();
    }
}
