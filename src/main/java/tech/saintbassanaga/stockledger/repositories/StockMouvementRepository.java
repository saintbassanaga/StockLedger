package tech.saintbassanaga.stockledger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.stockledger.models.StockMouvement;

import java.util.UUID;

public interface StockMouvementRepository extends JpaRepository<StockMouvement, UUID> {
  }