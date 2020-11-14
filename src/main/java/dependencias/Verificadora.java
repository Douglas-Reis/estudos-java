package dependencias;

import java.util.GregorianCalendar;

public class Verificadora {
	
	public boolean Palindromo (String palavra) {
		
		String palavraInvertida="";
        int tamanho,i;
        
        String valorcorrigido = palavra.replace(" " , "").toUpperCase();
        tamanho=valorcorrigido.length(); 
        
        for(i=tamanho-1;i>=0;i--){  
            palavraInvertida += valorcorrigido.charAt(i);
         }
        
        boolean resultado = valorcorrigido.equals(palavraInvertida);
        return resultado;
	}
	
	public boolean AnoBissexto(String ano) {
		
		GregorianCalendar calendario = (GregorianCalendar) GregorianCalendar.getInstance();
		
		int numeroConvertido = Integer.parseInt(ano);
		boolean isLeapYear = calendario.isLeapYear(numeroConvertido);
	    
	    return isLeapYear;
	}
	
	public String VerificaVoto (int idade) {
		 
		if(idade >= 18 && idade < 60) {
			return "O voto é obrigatório";
		}else if (idade >= 16 && idade < 18 || idade >= 60){
			return "O voto é facultativo";
		}else if (idade < 16) {
			return "Você não pode voltar";
		}else {
			return "Idade inválida";
		}
	}
	
	public boolean VerificaNumero (int numero) {
		
		boolean resultado = numero % 2 == 0;
		return resultado;
	}
}
