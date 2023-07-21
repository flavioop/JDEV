package thread;

import javax.swing.JOptionPane;

public class Aulathread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Código da rotina que quero executar em paraleleo*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();			
		
		Thread threadNota = new Thread(thread2);
		threadNota.start();
			
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		
		public void run() {
			/*Código do sistema do usuário continua o fluxo de trabalho*/
			
			for(int pos = 0; pos< 10; pos++) {
				/* Quero executar esse envio com um tempo de de para, ou com tempo determinado*/
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*Dá um tempo*/
					System.out.println("Executando algo ou rotina, por exemplo Nota fiscal");
				}
			
			System.out.println("Chegou ao fim o código se teste");
			/*Fluxo do sistem*/
			JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
			
			/********************Divisão das Threads*/
			
			/*Envio de nota fiscal*/
			
			
		}
};
		
	private static Runnable thread1 = new Runnable() {
		
		public void run() {
			
			for(int pos = 0; pos< 10; pos++) {
				/* Quero executar esse envio com um tempo de de para, ou com tempo determinado*/
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*Dá um tempo*/
					System.out.println("Executando algo ou rotina, por exemplo envio de e-mail");
				}		
				/*Fim do paralelo*/		}
	};	

}
