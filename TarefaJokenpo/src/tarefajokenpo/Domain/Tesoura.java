package tarefajokenpo.Domain;

import java.util.Map;

public class Tesoura extends Algoritmo {
   
    
    @Override
    public Map<String, String> executar(Tipo pTipo) {
       switch (pTipo){
       
           case PAPEL ->  valor = "Ganhou. Tesoura corta o papel!";
           case TESOURA ->  valor = "Empate! Tesoura empata com tesoura!";
           case PEDRA ->  valor = "Perdeu! Pedra quebra a tesoura!";
           case LAGARTO -> valor = "Ganhou! Tesoura decapta o lagarto!";
           case SPOCK ->  valor = "Perdeu! Spock derrete a tesoura!";
           default ->  valor = "Opção inválida!";
       }
        
        resultado.put(KEY, valor);
        return resultado;  
    }
    
}
/*
else if (jogada == TESOURA && computador == PAPEL) {
            System.out.println("Ganhou. Tesoura corta o papel!");
        } else if (jogada == TESOURA && computador == TESOURA) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (jogada == TESOURA && computador == PEDRA) {
            System.out.println("Perdeu! Pedra quebra a tesoura!");
        } else if (jogada == TESOURA && computador == LAGARTO) {
            System.out.println("Ganhou! Tesoura decapta o lagarto!");
        } else if (jogada == TESOURA) {
            System.out.println("Perdeu! Spock derrete a tesoura!");

*/
