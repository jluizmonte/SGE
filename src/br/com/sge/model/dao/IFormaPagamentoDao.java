package br.com.sge.model.dao;

import java.util.ArrayList;
import br.com.sge.model.FormaPagamentoModel;

/**
 *
 * @author joseluiz
 */
public interface IFormaPagamentoDao {

    public int salvarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento);

    public FormaPagamentoModel getFormaPagamentoDAO(int pIdForPag);

    public ArrayList<FormaPagamentoModel> getListaFormaPagamentoDAO();

    public boolean atualizarFormaPagamentoDAO(FormaPagamentoModel pModelFormaPagamento);

    public boolean excluirFormaPagamentoDAO(int pIdForPag);

}
