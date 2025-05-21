package tech.saintbassanaga.stockledger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "VENTE")
public class Vente extends AbstractEntity {

    private LocalDate date;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "productUuid", nullable = false, unique = true)
    private Product product;
    private Long quantity;
}