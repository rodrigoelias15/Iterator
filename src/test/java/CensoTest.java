import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void contarAtualizacoesNaoObsoletas() {
        RepositorioSistemaOperacional repositorio = new RepositorioSistemaOperacional(
                new Atualizacao("KB0x3210", true),
                new Atualizacao("KB0x3211", true),
                new Atualizacao("KB0x3212", false),
                new Atualizacao("KB0x3214", true)
        );
        assertEquals(3, Censo.contarAtualizacoesNaoObsoletas(repositorio));
    }

    @Test
    void contarTotalAtualizacoesRepositorio() {
        RepositorioSistemaOperacional repositorio = new RepositorioSistemaOperacional(
                new Atualizacao("KB0x3210", true),
                new Atualizacao("KB0x3211", true),
                new Atualizacao("KB0x3212", false),
                new Atualizacao("KB0x3214", true)
        );
        assertEquals(4, Censo.contarTotalAtualizacoesRepositorio(repositorio));
    }
}