package repositories;

import entidades.Product;
import interfaces.Repository;

public class ProductRepositoryFichero implements Repository<Product> {
    @Override
    public void save(Product entity) {
        System.out.println("Guardo en fichero");
    }

    @Override
    public void find() {

    }

    @Override
    public void findOne() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
