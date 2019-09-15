package br.com.sge.service;

import br.com.sge.model.UsuarioModel;
import br.com.sge.model.dao.UsuarioDao;
import java.util.ArrayList;

/**
 *
 * @author jluiz
 */
public class UsuarioService {

    UsuarioDao usuarioDao = new UsuarioDao();

    public int salvarUsuarioDAO(UsuarioModel pModelUsuario) {
        return usuarioDao.salvarUsuarioDAO(pModelUsuario);
    }

    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
        return usuarioDao.getUsuarioDAO(pIdUsuario);
    }

    public UsuarioModel getUsuarioDAO(String pLogin) {
        return usuarioDao.getUsuarioDAO(pLogin);
    }

    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        return usuarioDao.getListaUsuarioDAO();
    }

    public boolean atualizarUsuarioDAO(UsuarioModel pModelUsuario) {
        return usuarioDao.atualizarUsuarioDAO(pModelUsuario);
    }

    public boolean excluirUsuarioDAO(int pIdUsuario) {
        return usuarioDao.excluirUsuarioDAO(pIdUsuario);
    }

    public boolean getValidarUsuarioDAO(UsuarioModel pModelUsuario) {
        return usuarioDao.getValidarUsuarioDAO(pModelUsuario);
    }

    public UsuarioModel getQuantidadeUsuariosCadastrados() {
        return usuarioDao.getQuantidadeUsuariosCadastrados();
    }
}
