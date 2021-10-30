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
    @Test
    public void atletaIniciouTreinoDePedaladaAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de bicicleta iniciado", atleta.pedalando());
    }
    @Test
    public void atletaIniciouTreinoDeSurfAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de Surf iniciado", atleta.surfando());
    }
    @Test
    public void atletaIniciouTreinoDeCorridaAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.correndo());
    }
    // Atleta Caminhando

    @Test
    public void atletaNoDescansoAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeCaminhadaAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNaoIniciouTreinoDePedaladaAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.pedalando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeSurfAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.surfando());
    }
    @Test
    public void atletaIniciouTreinoDeCorridaAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.correndo());
    }
    // Atleta Correndo

    @Test
    public void atletaNoDescansoAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino de caminhada iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNaoIniciouTreinoDePedaladaAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.pedalando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeSurfAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.surfando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }
}