package Interfaces;
interface Sortable {
    void sort();
}

interface Searchable {
    void search();
}

class MyListData implements Sortable {
    public void sort() {
        System.out.println("List sorted");
    }
}

class Dictionary implements Searchable {
    public void search() {
        System.out.println("Word searched in dictionary");
    }
}

public class Program11 {
    public static void main(String[] args) {
        MyListData l = new MyListData();
        Dictionary d = new Dictionary();

        l.sort();
        d.search();
    }
}
