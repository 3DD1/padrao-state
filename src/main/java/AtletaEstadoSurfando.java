public class AtletaEstadoSurfando implements AtletaEstado {
    private AtletaEstadoSurfando() {};
    private static AtletaEstadoSurfando instance = new AtletaEstadoSurfando();
    public static AtletaEstadoSurfando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Surfando";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String caminhando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String nadando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String surfando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String pedalando(Atleta atleta){
        return "Treino de natação iniciado";
    }
    public String correndo(Atleta atleta){
        return "Treino não iniciado";
    }
}
