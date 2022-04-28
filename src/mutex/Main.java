package mutex;

public class Main {

	public static void main(String[] args) {
		Contador 		 contador  = new Contador();
		IncrementoThread incThread = new IncrementoThread(contador);
		DecrementoThread decThread = new DecrementoThread(contador);
		incThread.start();
		decThread.start();
	}

}
