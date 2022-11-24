class ItemQueue{
	int n;
	boolean val=false;
	synchronized int get() {
		while(!val) {
			try {
				Thread.sleep(1000);
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("consumed:"+n);
			val=false;
			notify();
		}
		return n;
	}
	synchronized void put(int n) {
		while(val) {
			try {
				Thread.sleep(1000);
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			this.n=n;
			val=true;
			System.out.println("produced:"+n);
			notify();
		}
	}
}
class Producer implements Runnable{
	ItemQueue q;
	Producer(ItemQueue q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	ItemQueue q;
	Consumer(ItemQueue q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
public class Main {
	public static void main(String args[]) {
		ItemQueue q=new ItemQueue();
		new Producer(q);
		new Consumer(q);
		System.out.println("press control c to stop");
	}
}

