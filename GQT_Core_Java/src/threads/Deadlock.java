package threads;
class Warior1 extends  Thread{
	String res1="AK-47";
	String res2="SNG";
	String res3="snipper";
	public void run() {
		if(Thread.currentThread().getName().equals("Sameer")) {
			sameer();

		}
		else {
			sathish();

		}
	}
	private void sathish() {
try {
	synchronized(res1) {
		System.out.println("sathis acquired resource :"+res1);
		Thread.sleep(3000);
		synchronized(res2) {
			System.out.println("sathis acquired resource :"+res2);
			Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("sathis acquired resource :"+res3);
				Thread.sleep(3000);

			}
		}
	}
}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	private void sameer() {
		try {
			synchronized(res3) {
				System.out.println("sameer acquired resource :"+res3);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("sameer acquired resource :"+res2);
					Thread.sleep(3000);
					synchronized(res1) {
						System.out.println("sameer acquired resource :"+res1);
						Thread.sleep(3000);

					}
				}
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}		
	}
}
public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warior1 w=new Warior1();
		w.setName("Sathish");
		Warior1 w1=new Warior1();
		w1.setName("sameer");
		w.start();
		w1.start();
	}

}
