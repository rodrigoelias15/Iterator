import java.util.Iterator;

public class Censo {
    public static Integer contarAtualizacoesNaoObsoletas(RepositorioSistemaOperacional repositorio) {
        int quantidade = 0;
        for (Atualizacao atualizacao : repositorio) {
            if (atualizacao.isObsoleto()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAtualizacoesRepositorio(RepositorioSistemaOperacional repositorio) {
        int quantidade = 0;
        for (Iterator a = repositorio.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
