package tarefajokenpo.Domain;

import java.util.Map;

public class Jokenpo {
    
    private Algoritmo algoritimo;

    public void setAlgoritimo(Algoritmo algoritimo) {
        this.algoritimo = algoritimo;
    }
            
    public void jogar(Tipo pTipo){
        Map<String, String> map = algoritimo.executar(pTipo);
        System.out.println(map.values());
           
    }
    
}