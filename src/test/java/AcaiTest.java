import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AcaiTest {
    @Test
    void deveRetornarPrecoAcaiBase() {
        Acai acai = new AcaiBase();

        assertEquals(10.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComBanana() {
        Acai acai = new Banana(new AcaiBase());

        assertEquals(13.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComCalda() {
        Acai acai = new Calda(new AcaiBase());

        assertEquals(11.0f, acai.getPreco());
    }
    @Test
    void deveRetornarPrecoAcaiComGranola() {
        Acai acai = new Granola(new AcaiBase());

        assertEquals(12.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComMorango() {
        Acai acai = new Morango(new AcaiBase());

        assertEquals(15.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComBananaEMorango() {
        Acai acai = new Banana(new Morango(new AcaiBase()));

        assertEquals(18.0f, acai.getPreco());
    }
    @Test
    void deveRetornarPrecoAcaiComBananaEGranola() {
        Acai acai = new Banana(new Granola(new AcaiBase()));

        assertEquals(15.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComBananaGranolaECalda() {
        Acai acai = new Banana(new Granola(new Calda(new AcaiBase())));

        assertEquals(16.0f, acai.getPreco());
    }
    @Test
    void deveRetornarPrecoAcaiComTodosComponentes() {
        Acai acai = new Banana(new Granola(new Calda (new Morango(new AcaiBase()))));

        assertEquals(21.0f, acai.getPreco());
    }
    @Test
    void deveRetornarComponentesAcai() {
        Acai acai = new AcaiBase();

        assertEquals("Açai ", acai.getComponente());
    }

    @Test
    void deveRetornarComponentesAcaiComBanana() {
        Acai acai = new Banana( new AcaiBase());

        assertEquals("Açai  + Banana", acai.getComponente());
    }

    @Test
    void deveRetornarComponentesAcaiComBananaMorango() {
        Acai acai = new Banana( new Morango( new AcaiBase()));

        assertEquals("Açai  + Morango + Banana", acai.getComponente());
    }

    @Test
    void deveRetornarComponentesAcaiComBananaMorangoGranola() {
        Acai acai = new Banana( new Morango( new Granola( new AcaiBase())));

        assertEquals("Açai  + Granola + Morango + Banana", acai.getComponente());
    }
    @Test
    void deveRetornarComponentesAcaiComTodosComponentes() {
        Acai acai = new Banana(new Granola(new Calda (new Morango(new AcaiBase()))));

        assertEquals("Açai  + Morango + Calda + Granola + Banana", acai.getComponente());
    }
}