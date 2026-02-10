package threads;
class Microsoft extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			specllcheck();
		}
		else {
			saving();
		}
	}

	private void saving() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Saving...");
				Thread.sleep(300);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void specllcheck() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Spellcheck...");
				Thread.sleep(300);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("typing...");
				Thread.sleep(300);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class Launch1 {
	public static void main(String args[]) {
		Microsoft m=new Microsoft();
		m.setName("typing");
		Microsoft m2=new Microsoft();
		m2.setName("spellcheck");
		Microsoft m3=new Microsoft();
		m3.setName("saving");
		m.start();
		m2.start();
		m3.start();
	}
}
