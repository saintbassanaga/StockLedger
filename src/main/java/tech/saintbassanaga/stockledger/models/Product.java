/**
 * @author saintbassanaga
 * @created 2023-11-15
 */
package tech.saintbassanaga.stockledger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "PRODUCT")
public class Product extends AbstractEntity {
    private String name;
    private String quantity;
    private BigDecimal price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stockMouvementId")
    private StockMouvement stockMouvement;

}
