/**
 * @author saintbassanaga
 * @created 2023-11-15
 */
package tech.saintbassanaga.stockledger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "StockMouvement")
public class StockMouvement extends AbstractEntity{

    @OneToMany(mappedBy = "stockMouvement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private StockType stockType;
}
