package mutex;

/**
 * Exemplo de implementação que utilizará o Lock, um simples contador
 */
public class Contador {

	private Lock lock = new Lock();
	private int contador;
	
	public Contador() {
		contador = 0;
	}
	
	/**
	 * Imprime o número do contador
	 */
	public void imprimeContador() {
		System.out.println("O valor do contador é: "+contador);
	}
	
	/**
	 * Método que realiza o incremento do contador
	 * @return
	 */
	public int incremento() {
		System.out.println("Iniciando tranca: "+Thread.currentThread());
		lock.bloquear();
		
		System.out.println("Trancado: "+Thread.currentThread());
		int novoContador = ++contador;
		
		System.out.println("Incrementando: "+Thread.currentThread());
		lock.desbloquear();
		
		System.out.println("Destrancado: "+Thread.currentThread());
		
		return novoContador;
	}
	
	/**
	 * Método que realiza o decremento do contador
	 * @return
	 */
	public int decremento() {
		System.out.println("Iniciando tranca: "+Thread.currentThread());
		lock.bloquear();
		
		System.out.println("Trancado: "+Thread.currentThread());
		int novoContador = --contador;
		
		System.out.println("Decrementando: "+Thread.currentThread());
		lock.desbloquear();
		
		System.out.println("Destrancado: "+Thread.currentThread());
		
		return novoContador;
	}
	
	
}
