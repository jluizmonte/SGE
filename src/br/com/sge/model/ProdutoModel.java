package br.com.sge.model;

/**
 *
 * @author joseluiz
 */
public class ProdutoModel {

    private int proCodigoProduto;
    private String proDescricao;
    private String proCategoria;
    private Double proValorTotal;
    private int proQuantidadeEstoque;
    private Double proValorUnitario;
    private String proObservacao;
    private String proCodigoBarras;
    private String proDataEntrada;

    public int getProCodigoProduto() {
        return proCodigoProduto;
    }

    public void setProCodigoProduto(int proCodigoProduto) {
        this.proCodigoProduto = proCodigoProduto;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public String getProCategoria() {
        return proCategoria;
    }

    public void setProCategoria(String proCategoria) {
        this.proCategoria = proCategoria;
    }

    public Double getProValorTotal() {
        return proValorTotal;
    }

    public void setProValorTotal(Double proValorTotal) {
        this.proValorTotal = proValorTotal;
    }

    public int getProQuantidadeEstoque() {
        return proQuantidadeEstoque;
    }

    public void setProQuantidadeEstoque(int proQuantidadeEstoque) {
        this.proQuantidadeEstoque = proQuantidadeEstoque;
    }

    public Double getProValorUnitario() {
        return proValorUnitario;
    }

    public void setProValorUnitario(Double proValorUnitario) {
        this.proValorUnitario = proValorUnitario;
    }

    public String getProObservacao() {
        return proObservacao;
    }

    public void setProObservacao(String proObservacao) {
        this.proObservacao = proObservacao;
    }

    public String getProCodigoBarras() {
        return proCodigoBarras;
    }

    public void setProCodigoBarras(String proCodigoBarras) {
        this.proCodigoBarras = proCodigoBarras;
    }

    public String getProDataEntrada() {
        return proDataEntrada;
    }

    public void setProDataEntrada(String proDataEntrada) {
        this.proDataEntrada = proDataEntrada;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" + "proCodigoProduto=" + proCodigoProduto + ", proDescricao=" + proDescricao + ", proCategoria=" + proCategoria + ", proValorTotal=" + proValorTotal + ", proQuantidadeEstoque=" + proQuantidadeEstoque + ", proValorUnitario=" + proValorUnitario + ", proObservacao=" + proObservacao + ", proCodigoBarras=" + proCodigoBarras + ", proDataEntrada=" + proDataEntrada + '}';
    }

}
