package threads;
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	public void run() {
		int i=1;
		while(true) {
			a.put(i++);
		}
	}
}
class Queue{
	int x;
	public void put(int i) {
		x=i;
		System.out.println("producer has produced the data "+i+" into "+x);
	}
	public void get() {
		System.out.println("consumer has consumed the data "+x);
	}
}
class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	public void run() {
		while(true) {
			b.get();
		
	}
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.start();
		c.start();

	}

}
