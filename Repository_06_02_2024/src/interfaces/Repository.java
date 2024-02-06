package interfaces;

// public interface Repository<Producto> {
public interface Repository<E> { //Repository<Product>
    void save(E entity);
    void find();
    void findOne();
    void delete();
    void update();
}
