package calculomedia;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informa a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Informa a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Informa a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Informa a nota 4 ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com a nota: " + media);				
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com a nota: " + media);
			}
		}else {
				JOptionPane.showMessageDialog(null, "Aluno já esta reprovado com a nota: " + media);	
		}
		
		
		
		
		
	}

}
