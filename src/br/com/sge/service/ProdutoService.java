package br.com.sge.service;

import java.util.ArrayList;
import br.com.sge.model.ProdutoModel;
import br.com.sge.model.dao.ProdutoDao;

/**
 *
 * @author joseluiz
 */
public class ProdutoService {

    ProdutoDao produtoDao = new ProdutoDao();

    public int salvarProdutoDAO(ProdutoModel pProdutoModel) {
        return produtoDao.salvarProdutoDAO(pProdutoModel);
    }

    public ProdutoModel getProdutoDAO(int pIdProduto) {
        return produtoDao.getProdutoDAO(pIdProduto);
    }

    public void getProdutoDAO(int productCode, int amount) {
        produtoDao.getProdutoDAO(productCode, amount);
    }

    public ArrayList<ProdutoModel> getListaProdutoDAO() {
        return produtoDao.getListaProdutoDAO();
    }

    public boolean atualizarProdutoDAO(ProdutoModel pProdutoModel) {
        return produtoDao.atualizarProdutoDAO(pProdutoModel);
    }

    public boolean excluirProdutoDAO(int pIdProduto) {
        return produtoDao.excluirProdutoDAO(pIdProduto);
    }

    public boolean alterarEstoqueProdutosDAO(ArrayList<ProdutoModel> pListaProdutoModel) {
        return produtoDao.alterarEstoqueProdutosDAO(pListaProdutoModel);
    }

    public ProdutoModel retornarProdutoDAO(String pProdutoNome) {
        return produtoDao.retornarProdutoDAO(pProdutoNome);
    }

    public ProdutoModel filtrarEstoqueProdutosDAO(String pEstoqueProduto) {
        return produtoDao.filtrarEstoqueProdutosDAO(pEstoqueProduto);
    }
}
