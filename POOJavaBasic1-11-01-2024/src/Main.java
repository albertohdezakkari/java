import beans.Usuario;
import coleccion.ColeccionUsuarios;

public class Main {
    static void saludar(){

    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
            usuario.setApellido1("PEPE");
            usuario.setApellido2("PEPE");
            usuario.setNombre("PEPE");
            usuario.setAdr("PEPE");

        ColeccionUsuarios coleccionUsuarios = new ColeccionUsuarios();
        coleccionUsuarios.addUsuario(usuario); // pos = 0
        //usuario = null;
        coleccionUsuarios.addUsuario(usuario); // pos = 1
        coleccionUsuarios.addUsuario(usuario); // pos = 2


        Usuario usuario2 = new Usuario(1);
        usuario2 = usuario;
        usuario2.setIdUsuario(3);
        System.out.println(usuario.getIdUsuario());
        // 1 => 15
        // 3 => 7



        // usuario.
        //saludar();
        // System.out.println("Hello world!");
    }
}