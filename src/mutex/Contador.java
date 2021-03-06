package mutex;

/**
 * Exemplo de implementa??o que utilizar? o Lock, um simples contador
 */
public class Contador {

	private Lock lock = new Lock();
	private int contador;
	
	public Contador() {
		contador = 0;
	}
	
	/**
	 * Imprime o n?mero do contador
	 */
	public void imprimeContador() {
		System.out.println("O valor do contador ?: "+contador);
	}
	
	/**
	 * M?todo que realiza o incremento do contador
	 * @return
	 */
	public int incremento() {
		System.out.println("Iniciando tranca: "+Thread.currentThread().getName());
		lock.bloquear();
		
		System.out.println("Trancado: "+Thread.currentThread().getName());
		int novoContador = ++contador;
		
		System.out.println("Incrementando: "+Thread.currentThread().getName());
		lock.desbloquear();
		
		System.out.println("Destrancado: "+Thread.currentThread().getName());
		
		return novoContador;
	}
	
	/**
	 * M?todo que realiza o decremento do contador
	 * @return
	 */
	public int decremento() {
		System.out.println("Iniciando tranca: "+Thread.currentThread().getName());
		lock.bloquear();
		
		System.out.println("Trancado: "+Thread.currentThread().getName());
		int novoContador = --contador;
		
		System.out.println("Decrementando: "+Thread.currentThread().getName());
		lock.desbloquear();
		
		System.out.println("Destrancado: "+Thread.currentThread().getName());
		
		return novoContador;
	}
	
	
}
