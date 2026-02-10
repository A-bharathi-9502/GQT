package Interfaces;
interface MyComparable {
    int compareTo(int x);
}

interface MyCloneable {
    Object clone();
}

class MyNumber implements MyComparable, MyCloneable {
    int n;

    MyNumber(int n) {
        this.n = n;
    }

    public int compareTo(int x) {
        return n - x;
    }

    public Object clone() {
        return new MyNumber(n);
    }
}

class Person implements MyComparable, MyCloneable {
    int age;

    Person(int age) {
        this.age = age;
    }

    public int compareTo(int x) {
        return age - x;
    }

    public Object clone() {
        return new Person(age);
    }
}

public class Program5 {
    public static void main(String[] args) {
        MyNumber num = new MyNumber(10);
        Person p = new Person(25);

        System.out.println(num.compareTo(5));
        System.out.println(p.compareTo(30));

        MyNumber n2 = (MyNumber) num.clone();
        Person p2 = (Person) p.clone();

        System.out.println("Cloned objects created");
    }
}
