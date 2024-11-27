package org.ifpr.crudta.usuario.dao;

import org.ifpr.crudta.banco.GenericDAO;
import org.ifpr.crudta.usuario.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

}
