package repositories;

import entidades.Category;
import interfaces.Repository;

public class CategoryDB
        implements Repository<Category> {
    @Override
    public void save(Category entity) {
        String cad = "";
        cad += "INSERT INTO";
        cad += " PRODUCTOS";
        cad += " (*) VALUES";
        cad += "('product 1', 'fda', 123)";
        System.out.println();
    }

    @Override
    public void find() {
        String cad = "";
        cad += " SELECT * ";
        cad += " FROM PELICULA ";
        /*
        * SELECT *
        * FROM
        * WHERE
        * GROUP BY
        * HAVING
        * ORDER BY
        * */
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
