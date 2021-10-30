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
    // Atleta Nadando

    @Test
    public void atletaNoDescansoAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNaoIniciouTreinoDePedaladaAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.pedalando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeSurfAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino de Surf iniciado", atleta.surfando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }
    // Atleta Surfando

    @Test
    public void atletaNoDescansoAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Treino de natação iniciado", atleta.nadando());
    }
    @Test
    public void atletaNaoIniciouTreinoDePedaladaAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Treino não iniciado", atleta.pedalando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeSurfAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Treino não iniciado", atleta.surfando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaSurfando(){
        atleta.setEstado(AtletaEstadoSurfando.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }
    // Atleta Pedalando

    @Test
    public void atletaNoDescansoAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNaoIniciouTreinoDePedaladaAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Treino não iniciado", atleta.pedalando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeSurfAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Treino não iniciado", atleta.surfando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaPedalando(){
        atleta.setEstado(AtletaEstadoPedalando.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }
}