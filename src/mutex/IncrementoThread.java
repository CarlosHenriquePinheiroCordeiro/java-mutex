package mutex;

/**
 * Thread do incremento
 */
public class IncrementoThread extends Thread {

	final private Contador contador;
	
	/**
	 * Adquire a instância do contador
	 * @param contador
	 */
	public IncrementoThread(Contador contador) {
		this.contador = contador;
		this.setName("Thread Incremento");
	}
	
	/**
	 * Executa o incremento
	 */
	public void executar() {
		contador.incremento();
	}
	
	
}
