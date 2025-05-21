package tech.saintbassanaga.stockledger.services;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import tech.saintbassanaga.stockledger.models.Vente;

import java.util.concurrent.Flow;

@Service
public  class SaleProcessor implements ItemProcessor<Vente, Vente> {

    private final InventoryService inventoryService;

    public SaleProcessor(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @Override
    public Vente process(Vente vente) {
        return inventoryService.adjustStock();
    }

}
