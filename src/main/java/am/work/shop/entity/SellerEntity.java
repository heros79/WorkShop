package am.work.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SELLER", indexes = {@Index(name = "idIndex", columnList = "id"),
        @Index(name = "sellerFirmNameIndex", columnList = "SELLER_FIRM_NAME"),
        @Index(name = "sellerNameAndLastNameIndex", columnList = "SELLER_NAME, SELLER_LAST_NAME"),
        @Index(name = "sellerPhoneIndex", columnList = "SELLER_PHONE"),
        @Index(name = "sellerMailIndex", columnList = "SELLER_MAIL"),})
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "SELLER_FIRM_NAME")
    private String sellerFirmName;

    @Column(name = "SELLER_NAME")
    private String sellerName;

    @Column(name = "SELLER_LAST_NAME")
    private String sellerLastName;

    @Column(name = "SELLER_PHONE")
    private String sellerPhone;

    @Column(name = "SELLER_ADDRESS")
    private String sellerAddress;

    @Column(name = "SELLER_MAIL")
    private String sellerMail;
}