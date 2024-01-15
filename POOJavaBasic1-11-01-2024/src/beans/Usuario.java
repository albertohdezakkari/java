package beans;

public class Usuario {
    // ATRIBUTOS
    private long idUsuario = 0;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String adr;
    // CONSTRUCTORES
    public Usuario(){
                          // INSERT
    }
    public Usuario(long idUsuario, String nombre, String apellido1, String apellido2, int edad, String adr) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.adr = adr;
    }

    public Usuario(long idUsuario){
        this.idUsuario = idUsuario; //UPDATE, DELETE
    }
    // FUNCIONES/PROCEDIMIENTOS (MÉTODOS)
        //GETTER/SETTER

    public long getIdUsuario() {
        return this.idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getAdr() {
        return adr;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
}
