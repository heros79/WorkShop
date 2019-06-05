package am.work.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STOCK", indexes = {@Index(name = "idIndex", columnList = "id")})
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "INPUT_DATE")
    private Date inputDate;

    @Column(name = "OUTPUT_DATE")
    private Date outputDate;

    @Column(name = "INCOME_PRICE", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double incomingGoodPrice;

    @Column(name = "INCOME_COUNT", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double incomingGoodCount;

    @Column(name = "OUT_COUNT", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double outgoingGoodCount;

    @Formula("SELECT SUM(a.INCOME_COUNT) FROM STOCK a WHERE a.INCOME_COUNT != 0.00")
    private Double inStockCount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "GOOD_ID", referencedColumnName = "id")
    private GoodEntity goodEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SELLER_ID", referencedColumnName = "id")
    private SellerEntity sellerEntity;
}