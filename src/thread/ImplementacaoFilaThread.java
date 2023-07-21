package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<>();
	
	public static void add(ObjetoFilaThread ObjetoFilaThread) {
		pilha_fila.add(ObjetoFilaThread);		
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true){
			
			Iterator iteracao = pilha_fila.iterator();
			

			synchronized(iteracao) {/*Bloquear o acesso a esta lista poe outro processo*/
				
				while(iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual*/
					
					/*Processar 10 mil notas fiscais*/
					/*Gerar uma lista enorme de PDF*/
					/*Gerar um envio em massa de e-mail*/
					
					
					System.out.println("----------------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					iteracao.remove();
					try {
						Thread.sleep(1000);/*Dar um tempo para descarregar a memória*/
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
			}
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		
		}
				
		
	}
	
}
