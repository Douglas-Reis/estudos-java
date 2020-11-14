package dependencias;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Verificadora {
	
	public static void Palindromo () {
		String palavra, palavraInvertida="";
        int tamanho,i;
        
        palavra = JOptionPane.showInputDialog(null,"Digite uma palavra");
        tamanho=palavra.length(); 
        
        for(i=tamanho-1;i>=0;i--){  
            palavraInvertida += palavra.charAt(i);
         }
                
        if(palavra.equals(palavraInvertida)) 
             JOptionPane.showMessageDialog(null,palavra + " É uma palavra palindroma"); 
        else 
             JOptionPane.showMessageDialog(null,palavra + " Não é uma palavra palindroma");
	}
	
	public void AnoBissexto(String ano) {
		GregorianCalendar calendario = (GregorianCalendar) GregorianCalendar.getInstance();
		
		ano = JOptionPane.showInputDialog(null,"Digite um ano:");
		int numeroConvertido = Integer.parseInt(ano);
		
		boolean isLeapYear = calendario.isLeapYear(numeroConvertido);
	    JOptionPane.showMessageDialog(null,"É um ano bissexto: "+isLeapYear);
	}
	
	public void VerificaVoto (String idade) {
		
		idade = JOptionPane.showInputDialog(null,"Digite sua idade:");
		int idadeConvertida = Integer.parseInt(idade);
		
		if(idadeConvertida >= 18 && idadeConvertida < 60) {
			JOptionPane.showMessageDialog(null,"O voto é obrigatório");
		}else if (idadeConvertida >= 16 && idadeConvertida < 18 || idadeConvertida >= 60){
			JOptionPane.showMessageDialog(null,"O voto é facultativo");
		}else if (idadeConvertida < 16) {
			JOptionPane.showMessageDialog(null,"Você não pode voltar");
		}
	}
	
	public void VerificaNumero () {
		String numero;
		int resultado;
		
		numero = JOptionPane.showInputDialog(null,"Digite sua idade:");
		int numeroConvertido = Integer.parseInt(numero);
		
		resultado = numeroConvertido % 2;
		
		if(resultado == 0) {
			JOptionPane.showMessageDialog(null,"True");
		}else {
			JOptionPane.showMessageDialog(null,"False");
		}
	}
}
