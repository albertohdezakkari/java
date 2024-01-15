package interfaces;

import beans.Usuario;

public interface CRUD {
    void add(Usuario usuario);
    void delete(long id);
    void update(long id, Usuario usuario);
    void findAll();
    void findOne(long id);

}
