package Interfaces;
interface MyList {
    void add(int x);
    void remove(int x);
    boolean contains(int x);
}

interface MySet {
    void add(int x);
    void remove(int x);
    boolean contains(int x);
}

class MyArrayList implements MyList {
    int[] arr = new int[5];
    int size = 0;

    public void add(int x) {
        arr[size++] = x;
    }

    public void remove(int x) {
        size--;
    }

    public boolean contains(int x) {
        for(int i=0;i<size;i++)
            if(arr[i]==x) return true;
        return false;
    }
}

class MyHashSet implements MySet {
    int[] arr = new int[5];
    int size = 0;

    public void add(int x) {
        arr[size++] = x;
    }

    public void remove(int x) {
        size--;
    }

    public boolean contains(int x) {
        for(int i=0;i<size;i++)
            if(arr[i]==x) return true;
        return false;
    }
}

public class Program7 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyHashSet set = new MyHashSet();

        list.add(10);
        set.add(20);

        System.out.println(list.contains(10));
        System.out.println(set.contains(20));
    }
}
