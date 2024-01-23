package coleccion;

import beans.Usuario;
import interfaces.CRUD;

public class ColeccionUsuarios implements CRUD {
    private Usuario[] lstUsuario;
    private int numUsuarios;

    public ColeccionUsuarios(){
        // INICIALIZA LOS ATRIBUTOS
        this.lstUsuario = new Usuario[10];
        this.numUsuarios = 0;
    }

    
    @Override
    public void add(Usuario usuario) {
        lstUsuario[numUsuarios] = usuario;
        usuario.setIdUsuario(numUsuarios+1); // 1
        numUsuarios++;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long idUsuario, Usuario usuarioNew) {
        for (Usuario usuario:lstUsuario
        ) {
            if(usuario.getIdUsuario() == idUsuario){
                usuario.setAdr(usuarioNew.getAdr());
                usuario.setApellido1(usuarioNew.getApellido1());
                usuario.setApellido2(usuarioNew.getApellido2());
                usuario.setEdad(usuarioNew.getEdad());

                break;
            }
        }
    }

    @Override
    public void findAll() {

    }

    @Override
    public void findOne(long id) {

    }
    // eliminarUsuarioDeLaLista
    // listarUnUsuarioDeLaLista
    // listarTodosLosUsuariosDeLaLista


}
