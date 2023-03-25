package tarefajokenpo;

import tarefajokenpo.Domain.Algoritmo;
import tarefajokenpo.Domain.Jokenpo;
import tarefajokenpo.Domain.Lagarto;
import tarefajokenpo.Domain.Papel;
import tarefajokenpo.Domain.Pedra;
import tarefajokenpo.Domain.Spock;
import tarefajokenpo.Domain.Tesoura;
import tarefajokenpo.Domain.Tipo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();
        int jogada;

        do{
            System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
            jogada = in.nextInt();
            int computador = new Random().nextInt(5) + 1;
            System.out.println("Você escolheu: " + Tipo.getInstance(jogada));
            System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));
    
            var algoritmo = getAlgoritmo(jogada);

            jokenpo.setAlgoritimo(algoritmo);
            Tipo tipoJogadaComputador = Tipo.getInstance(computador);
    
            jokenpo.jogar(tipoJogadaComputador);

            System.out.println(" ");
            
        }while(jogada > 0 && jogada < 6);
        
        in.close();
    }

    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo;
        switch(pId){
            case 1: 
                algoritmo = new Papel();
                break;
            case 2: 
                algoritmo = new Tesoura();
                break;
            case 3: 
                algoritmo = new Pedra();
                break; 
            case 4:
                algoritmo = new Lagarto();
                break;
            case 5:
                algoritmo = new Spock();
                break;
            default: 
                throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }
}
