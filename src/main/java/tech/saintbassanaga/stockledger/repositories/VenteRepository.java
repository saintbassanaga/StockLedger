/**
 * @author saintbassanaga
 * @created 2023-11-15
 */
package tech.saintbassanaga.stockledger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.stockledger.models.Vente;

import java.util.UUID;

public interface VenteRepository extends JpaRepository<Vente, UUID> {
}
