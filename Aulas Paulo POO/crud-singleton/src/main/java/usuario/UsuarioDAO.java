package usuario;

import dao.GenericDAO;

public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }


}
