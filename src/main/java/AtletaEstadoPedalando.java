public class AtletaEstadoPedalando implements AtletaEstado{
    private AtletaEstadoPedalando() {};
    private static AtletaEstadoPedalando instance = new AtletaEstadoPedalando();
    public static AtletaEstadoPedalando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Pedalando";
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
        return "Treino não iniciado";
    }
    public String correndo(Atleta atleta){
        return "Treino não iniciado";
    }
}
