package br.com.sge.model.dao;

import java.util.ArrayList;

import br.com.sge.model.ClienteModel;

/**
 *
 * @author jluiz
 */
public interface IClienteDao {

    public int salvarClienteDAO(ClienteModel pClienteModel);

    public ClienteModel getClienteDAO(int pIdCliente);

    public ClienteModel getClienteDAO(String pNomeCliente);

    public ArrayList<ClienteModel> getListaClienteDAO();

    public boolean atualizarClienteDAO(ClienteModel pClienteModel);

    public boolean excluirClienteDAO(int pIdCliente);

    public ClienteModel getQuantidadeCliente();

}
