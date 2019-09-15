package br.com.sge.service;

import java.util.ArrayList;
import br.com.sge.model.VendasProdutosModel;
import br.com.sge.model.dao.VendasProdutosDao;

/**
 *
 * @author joseluiz
 */
public class VendasProdutosService {

    VendasProdutosDao vendasProdutosDao = new VendasProdutosDao();

    public boolean salvarVendasProdutosDAO(ArrayList<VendasProdutosModel> plistaModelVendasProdutos) {
        return vendasProdutosDao.salvarVendasProdutosDAO(plistaModelVendasProdutos);
    }

    public boolean excluirVendasProdutosDAO(int pIdVendaProduto) {
        return vendasProdutosDao.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    public boolean atualizarVendasProdutosDAO(VendasProdutosModel pModelVendasProdutos) {
        return vendasProdutosDao.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    public ArrayList<VendasProdutosModel> getListaVendasProdutosDAO() {
        return vendasProdutosDao.getListaVendasProdutosDAO();
    }

    public VendasProdutosModel getVendasProdutosDAO(int pIdVendaProduto) {
        return vendasProdutosDao.getVendasProdutosDAO(pIdVendaProduto);
    }

    public int salvarVendasProdutosDAO(VendasProdutosModel pModelVendasProdutos) {
        return vendasProdutosDao.salvarVendasProdutosDAO(pModelVendasProdutos);
    }
}
