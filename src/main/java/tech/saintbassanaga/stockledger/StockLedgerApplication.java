package tech.saintbassanaga.stockledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class StockLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockLedgerApplication.class, args);
    }

}
