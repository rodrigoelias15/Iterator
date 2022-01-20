import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RepositorioSistemaOperacional implements Iterable<Atualizacao> {

    private List<Atualizacao> atualizacoes = new ArrayList<Atualizacao>();

    public RepositorioSistemaOperacional(Atualizacao... atualizacoes) {
        this.atualizacoes = Arrays.asList(atualizacoes);
    }

    @Override
    public Iterator<Atualizacao> iterator() {
        return atualizacoes.iterator();
    }

}
