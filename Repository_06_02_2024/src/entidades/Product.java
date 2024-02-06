package entidades;

public class Product {
    int idProduct;
    String titulo;
    String desc;
    float precio;

    public Product() {
    }
    public Product(String titulo, String desc, float precio) {
        this.titulo = titulo;
        this.desc = desc;
        this.precio = precio;
    }
    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
