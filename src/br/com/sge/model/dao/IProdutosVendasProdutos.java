package br.com.sge.model.dao;

import java.util.ArrayList;
import br.com.sge.model.ProdutosVendasProdutosModel;

/**
 *
 * @author joseluiz
 */
public interface IProdutosVendasProdutos {

    public ArrayList<ProdutosVendasProdutosModel> getListaProdutosVendasProdutosDAO(int pCodigoVenda);
}
