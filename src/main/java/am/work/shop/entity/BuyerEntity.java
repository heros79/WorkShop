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
@Table(name = "BUYER", indexes = {@Index(name = "idIndex", columnList = "id"),
        @Index(name = "buyerFirmNameIndex", columnList = "FIRM_NAME"),
        @Index(name = "buyerNameAndLastNameIndex", columnList = "BUYER_NAME, BUYER_LAST_NAME"),
        @Index(name = "buyerPhoneIndex", columnList = "BUYER_PHONE"),
        @Index(name = "buyerMailIndex", columnList = "BUYER_MAIL")})
public class BuyerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "FIRM_NAME")
    private String firmName;

    @Column(name = "BUYER_NAME")
    private String buyerName;

    @Column(name = "BUYER_LAST_NAME")
    private String buyerLastName;

    @Column(name = "BUYER_PHONE")
    private String buyerPhone;

    @Column(name = "BUYER_ADDRESS")
    private String buyerAddress;

    @Column(name = "BUYER_MAIL")
    private String buyerMail;

}