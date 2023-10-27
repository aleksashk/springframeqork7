package by.flameksandr.services;

import by.flameksandr.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * DEFAULT  ---> read commited
     *
     *  READ_UNCOMMITTED
     *  READ_COMMITTED
     *  REPEATABLE_READ
     *  SERIALIZABLE
     *
     *  PROBLEMS:
     *  - dirty reads
     *  - repeatable reads
     *  - phantom reads
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void addTenProduct() {
        for (int i = 0; i < 10; i++) {
            productRepository.addProduct("Product " + i);
        }
    }
}
