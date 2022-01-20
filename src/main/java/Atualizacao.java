public class Atualizacao {
    private String codigoAtualizacao;
    private boolean obsoleto;

    public Atualizacao(String codigoAtualizacao, boolean obsoleto) {
        this.codigoAtualizacao = codigoAtualizacao;
        this.obsoleto = obsoleto;
    }

    public String getCodigoAtualizacao() {
        return codigoAtualizacao;
    }

    public void setCodigoAtualizacao(String codigoAtualizacao) {
        this.codigoAtualizacao = codigoAtualizacao;
    }

    public boolean isObsoleto() {
        return obsoleto;
    }

    public void setObsoleto(boolean obsoleto) {
        this.obsoleto = obsoleto;
    }
}
