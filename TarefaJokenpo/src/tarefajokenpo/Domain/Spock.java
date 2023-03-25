package tarefajokenpo.Domain;

import java.util.Map;

public class Spock extends Algoritmo {
    
   
    @Override
    public Map<String, String>executar(Tipo pTipo) {
       switch (pTipo){
       
           case PAPEL ->  valor = "Perdeu. Papel refuta Spock!";
           case TESOURA ->  valor = "Ganhou! Spock derrete a tesoura!";
           case PEDRA ->  valor = "Ganhou! Spock vaporiza a pedra!";
           case LAGARTO ->  valor = "Perdeu! Lagarto envenena Spock!";
           case SPOCK ->  valor = "Empatou! Spock empata com Spock!";
           default ->  valor = "Opção inválida!";
               
       } 
        
        resultado.put(KEY, valor);
        return resultado;       
        
    }
    
}

/*
else if (jogada == SPOCK && computador == PAPEL) {
            System.out.println("Perdeu. Papel refuta Spock!");
        } else if (jogada == SPOCK && computador == TESOURA) {
            System.out.println("Ganhou! Spock derrete a tesoura!");
        } else if (jogada == SPOCK && computador == PEDRA) {
            System.out.println("Ganhou! Spock vaporiza a pedra!");
        } else if (jogada == SPOCK && computador == LAGARTO) {
            System.out.println("Perdeu! Lagarto envenena Spock!");
        } else if (jogada == SPOCK) {
            System.out.println("Empatou! Spock empata com Spock!");
*/
