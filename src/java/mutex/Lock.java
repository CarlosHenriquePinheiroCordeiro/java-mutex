package java.mutex;

/**
 * Classe que contém o Lock e o Unlock das Threads, ligando ou desligando a seção crítica da thread em questão
 */
public class Lock {

	private boolean bloqueado = false;
	
	/**
	 * Método que bloqueia a execução da thread
	 */
	public synchronized void bloquear() {
		while (bloqueado) { //Enquanto estiver bloqueado, o programa tem que aguardar, pois há uma seção crítica em andamento
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		bloqueado = true;
	}
	
	/**
	 * Método que desbloqueia a execução da thread
	 */
	public synchronized void desbloquear() {
		bloqueado = false;
		notify(); //Ao desbloquear, notifica o programa em questão para continuar sua execução, encerrando a seção crítica
	}
	
	
}
