import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {
    Atleta atleta;

    @BeforeEach
    public void setUp(){
        atleta = new Atleta();
    }

    //Atleta Descansando

    @Test
    public void atletaForaDoDescansoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Atleta fora do Descanso", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de caminhada iniciado", atleta.caminhando());
    }
    @Test
    public void atletaIniciouTreinoDenatacaoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de natação iniciado", atleta.nadando());
    }

}