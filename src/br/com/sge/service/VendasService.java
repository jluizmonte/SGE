package br.com.sge.service;

import br.com.sge.model.dao.VendasDao;
import java.util.ArrayList;
import br.com.sge.model.VendasModel;

/**
 *
 * @author joseluiz
 */
public class VendasService {

    VendasDao vendasDao = new VendasDao();

    public int salvarVendasDAO(VendasModel pModelVendas) {
        return vendasDao.salvarVendasDAO(pModelVendas);
    }

    public VendasModel getVendasDAO(int pIdVenda) {
        return vendasDao.getVendasDAO(pIdVenda);
    }

    public ArrayList<VendasModel> getListaVendasDAO() {
        return vendasDao.getListaVendasDAO();
    }

    public boolean atualizarVendasDAO(VendasModel pModelVendas) {
        return vendasDao.atualizarVendasDAO(pModelVendas);
    }

    public boolean excluirVendasDAO(int pIdVenda) {
        return vendasDao.excluirVendasDAO(pIdVenda);
    }

    public void returnAmountSale() {
        vendasDao.returnAmountSale();
    }
}
