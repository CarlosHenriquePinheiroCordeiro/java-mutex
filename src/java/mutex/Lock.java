package java.mutex;

/**
 * Classe que cont�m o Lock e o Unlock das Threads, ligando ou desligando a se��o cr�tica da thread em quest�o
 */
public class Lock {

	private boolean bloqueado = false;
	
	/**
	 * M�todo que bloqueia a execu��o da thread
	 */
	public synchronized void bloquear() {
		while (bloqueado) { //Enquanto estiver bloqueado, o programa tem que aguardar, pois h� uma se��o cr�tica em andamento
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		bloqueado = true;
	}
	
	/**
	 * M�todo que desbloqueia a execu��o da thread
	 */
	public synchronized void desbloquear() {
		bloqueado = false;
		notify(); //Ao desbloquear, notifica o programa em quest�o para continuar sua execu��o, encerrando a se��o cr�tica
	}
	
	
}
