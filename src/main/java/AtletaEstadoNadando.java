public class AtletaEstadoNadando implements AtletaEstado {
    private AtletaEstadoNadando() {};
    private static AtletaEstadoNadando instance = new AtletaEstadoNadando();
    public static AtletaEstadoNadando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Nadando";
    }
    public String descansando(Atleta atleta){
        return "Fora do Descando";
    }
    public String caminhando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String nadando(Atleta atleta){
        return "Treino não iniciado";
    }

}
