package br.com.sge.service;

import java.util.ArrayList;

import br.com.sge.model.VendasClientesModel;
import br.com.sge.model.dao.VendasClientesDao;

/**
 *
 * @author joseluiz
 */
public class VendasClientesService {

    VendasClientesDao vendasClientesDao = new VendasClientesDao();

    public ArrayList<VendasClientesModel> getListaVendasClienteDAO() {
        return vendasClientesDao.getListaVendasClienteDAO();
    }

}
