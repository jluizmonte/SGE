package br.com.sge.service;

import java.util.ArrayList;
import br.com.sge.model.FornecedorModel;
import br.com.sge.model.dao.FornecedorDao;

/**
 *
 * @author joseluiz
 */
public class FornecedorService {

    FornecedorDao fornecedorDao = new FornecedorDao();

    public int salvarFornecedorDAO(FornecedorModel pFornecedorModel) {
        return fornecedorDao.salvarFornecedorDAO(pFornecedorModel);
    }

    public FornecedorModel getFornecedorDAO(int pIdFornecedor) {
        return fornecedorDao.getFornecedorDAO(pIdFornecedor);
    }

    public FornecedorModel getFornecedorDAO(String pNomeFornecedor) {
        return fornecedorDao.getFornecedorDAO(pNomeFornecedor);
    }

    public ArrayList<FornecedorModel> getListaFornecedorDAO() {
        return fornecedorDao.getListaFornecedorDAO();
    }

    public boolean atualizarFornecedorDAO(FornecedorModel pFornecedorModel) {
        return fornecedorDao.atualizarFornecedorDAO(pFornecedorModel);
    }

    public boolean excluirFornecedorDAO(int pIdFornecedor) {
        return fornecedorDao.excluirFornecedorDAO(pIdFornecedor);
    }
}
