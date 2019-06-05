package am.work.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SHOP", indexes = {@Index(name = "idIndex", columnList = "id")})
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "INPUT_DATE")
    private Date inputDate;

    @Column(name = "OUTPUT_DATE")
    private Date outputDate;

    @Column(name = "OUT_PRICE", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double incomingGoodPrice;

    @Column(name = "INCOME_COUNT", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double incomingGoodCount;

    @Column(name = "OUT_COUNT", columnDefinition = "Decimal(10,2) default '0.00'", nullable = false)
    private Double outgoingGoodCount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "GOOD_ID", referencedColumnName = "id")
    private GoodEntity goodEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUYER_ID", referencedColumnName = "id")
    private BuyerEntity buyerEntity;


}