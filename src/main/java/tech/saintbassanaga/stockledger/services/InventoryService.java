/**
 * @author saintbassanaga
 * @created 2023-11-15
 */
package tech.saintbassanaga.stockledger.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tech.saintbassanaga.stockledger.models.Vente;
import tech.saintbassanaga.stockledger.repositories.StockMouvementRepository;

import java.util.UUID;

@Component
public interface InventoryService {

    void addStock(UUID productId, int quantity);

    void removeStock(UUID productId, int quantity);

    Vente adjustStock();

    void restock(UUID productId, int quantity);
}
