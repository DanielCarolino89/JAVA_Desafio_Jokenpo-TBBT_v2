package tarefajokenpo.Domain;

import java.util.HashMap;
import java.util.Map;

public abstract class Algoritmo {
    
    protected final String KEY = "resultado";
    
    protected String valor;
    
    protected Map<String, String> resultado = new HashMap<>();
    
    public abstract Map<String, String> executar(Tipo pTipo);
}