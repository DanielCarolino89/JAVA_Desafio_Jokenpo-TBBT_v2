package tarefajokenpo.Domain;

import java.util.Map;

public class Pedra extends Algoritmo {
 
    @Override
    public Map<String, String>executar(Tipo pTipo) {
       switch (pTipo){
       
           case PAPEL ->  valor = "Perdeu. Papel embrulha a pedar!";
           case TESOURA ->  valor = "Ganhou! Pedra quebra a tesoura!";
           case PEDRA ->  valor = "Empatou! Pedra empata com pedra!";
           case LAGARTO ->  valor = "Ganhou! Pedra esmaga o lagarto!";
           case SPOCK ->  valor = "Perdeu! Spock vaporiza a pedra!";
           default ->  valor = "Opção inválida!";
               
       } 
        
        resultado.put(KEY, valor);
        return resultado;        
        
    }
    
}

/*
else if (jogada == PEDRA && computador == PAPEL) {
            System.out.println("Perdeu. Papel embrulha a pedar!");
        } else if (jogada == PEDRA && computador == TESOURA) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (jogada == PEDRA && computador == PEDRA) {
            System.out.println("Empatou! Pedra empata com pedra!");
        } else if (jogada == PEDRA && computador == LAGARTO) {
            System.out.println("Ganhou! Pedra esmaga o lagarto!");
        } else if (jogada == PEDRA) {
            System.out.println("Perdeu! Spock vaporiza a apedra!");


*/
