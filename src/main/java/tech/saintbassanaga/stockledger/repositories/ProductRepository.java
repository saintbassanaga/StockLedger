package tech.saintbassanaga.stockledger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.stockledger.models.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
  }