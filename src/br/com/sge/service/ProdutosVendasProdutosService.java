package br.com.sge.service;

import java.util.ArrayList;
import br.com.sge.model.ProdutosVendasProdutosModel;
import br.com.sge.model.dao.ProdutosVendasProdutosDao;

/**
 *
 * @author joseluiz
 */
public class ProdutosVendasProdutosService {

    ProdutosVendasProdutosDao produtosVendasProdutosDao = new ProdutosVendasProdutosDao();

    public ArrayList<ProdutosVendasProdutosModel> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        return produtosVendasProdutosDao.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }

}
