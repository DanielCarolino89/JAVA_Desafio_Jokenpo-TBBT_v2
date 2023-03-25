package tarefajokenpo.Domain;

public enum Tipo {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4),SPOCK(5);

    Tipo(Integer pId) {
        this.id = pId;
    }

    private final Integer id;

    public Integer getId() {
        return id;
    }

    public static Tipo getInstance(Integer pId) {
        for (Tipo t: Tipo.values()) {
            if(t.getId().equals(pId)) {
                return t;
            }
        }
        throw new RuntimeException(String.format("Tipo inválido. Id: %d", pId));
    }
}