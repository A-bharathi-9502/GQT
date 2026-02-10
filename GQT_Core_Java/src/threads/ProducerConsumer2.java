package threads;
class Producer1 extends Thread{
	Queue1 a;
	public Producer1(Queue1 q) {
		a=q;
	}
	public void run() {
		int i=1;
		while(true) {
			a.put(i++);
		}
	}
}
class Queue1{
	int x;
	boolean value_of_x=false;
	synchronized public void put(int i) {
		try {
			if(value_of_x==false) {
				x=i;
				System.out.println("producer has produced the data "+i+" into "+x);
				value_of_x=true;
				notify();
				}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void get() {
		try {
		if(value_of_x==true) {
			System.out.println("consumer has consumed the data "+x);
			value_of_x=false;
			notify();
		}
		else {
			wait();
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Consumer1 extends Thread{
	Queue1 b;
	public Consumer1(Queue1 q) {
		b=q;
	}
	public void run() {
		while(true) {
			b.get();
		
	}
	}
}
public class ProducerConsumer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q=new Queue1();
		Producer1 p=new Producer1(q);
		Consumer1 c=new Consumer1(q);
		p.start();
		c.start();

	}

}
