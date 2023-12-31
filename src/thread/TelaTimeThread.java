package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Adiciona");
	private JButton jButton2 = new JButton("Stop");	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	public TelaTimeThread() {/*Executa o que estiver dentro no momento da abertura ou execu��o / estanciar o objeto*/
	
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controlador de componentes*/
				
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets (5,10,5,5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(true);
		jPanel.add(mostraTempo, gridBagConstraints);		
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(true);
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2,gridBagConstraints);
		
		gridBagConstraints.gridheight = 1;
		
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
				
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
						
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o clique no bot�o*/
				// TODO Auto-generated method stub
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 0; qtd < 100; qtd++) {
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - " +qtd);
				
				fila.add(filaThread);
				}
		
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null;
								
			
			}
		});
		
		
		fila.start();
		add(jPanel, BorderLayout.WEST);	
		
		
		setVisible(true);/*Ultimo comando a ser executado, torna a tela visivel para o usu�rio*/
		
	}

	
	
}
