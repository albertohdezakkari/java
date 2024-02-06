package repositories;

import entidades.Product;
import interfaces.Repository;

public class ProductRepositoryDB
        implements Repository<Product> {

    @Override
    public void save(Product entity) {
        System.out.println("Guardar en BD");
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
