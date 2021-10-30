public interface AtletaEstado {

    String getEstado();

    String descansando(Atleta atleta);

    String caminhando(Atleta atleta);

    String correndo(Atleta atleta);

    String nadando(Atleta atleta);

    String surfando(Atleta atleta);

    String pedalando(Atleta atleta);
}
