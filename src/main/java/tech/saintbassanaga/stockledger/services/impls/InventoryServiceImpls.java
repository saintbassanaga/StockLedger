package tech.saintbassanaga.stockledger.services.impls;

import org.springframework.stereotype.Service;
import tech.saintbassanaga.stockledger.models.Vente;
import tech.saintbassanaga.stockledger.repositories.StockMouvementRepository;
import tech.saintbassanaga.stockledger.services.InventoryService;

import java.util.UUID;

@Service
public class InventoryServiceImpls implements InventoryService {

    public InventoryServiceImpls(StockMouvementRepository stockMouvementRepository) {
    }

    @Override
    public void addStock(UUID productId, int quantity) {

    }

    @Override
    public void removeStock(UUID productId, int quantity) {

    }

    @Override
    public Vente adjustStock() {
        return null;
    }

    @Override
    public void restock(UUID productId, int quantity) {

    }
}
