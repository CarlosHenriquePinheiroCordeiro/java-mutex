package mutex;

/**
 * Thread do decremento
 */
public class DecrementoThread extends Thread {

final private Contador contador;
	
	/**
	 * Adquire a instância do contador
	 * @param contador
	 */
	public DecrementoThread(Contador contador) {
		this.contador = contador;
		this.setName("Thread Decremento");
	}
	
	/**
	 * Executa o incremento
	 */
	public void executar() {
		contador.decremento();
	}
	
	
}
