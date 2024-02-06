import entidades.Product;
import interfaces.Repository;
import repositories.ProductRepositoryDB;
import repositories.ProductRepositoryFichero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Repository<Product>> lstProductos = new ArrayList<>();

        Repository<Product> productRepositoryDB = new ProductRepositoryDB();
        Repository<Product> productRepositoryFichero = new ProductRepositoryFichero();

            lstProductos.add(productRepositoryDB);
            lstProductos.add(productRepositoryFichero);

        for (Repository<Product> product:lstProductos
             ) {
             Product newProduct = new Product();
             product.save(newProduct);
                 newProduct.setDesc("fdsafdsa");
                 newProduct.setPrecio(451f);
                 newProduct.setTitulo("fdsafds");
            // product.save(new Product("fdsa", "fdsa", 123f));
        }


    }
}