package importFinance.repository;

import importFinance.model.Product;
import org.springframework.data.repository.CrudRepository;

interface ProductRepository extends CrudRepository<Product, Long> {
}
