package am.work.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock implements Serializable {

    private static final long serialVersionUID = 687573700852360001L;

    private Integer id;
    private Date inputDate;
    private Date outputDate;
    private Double incomingGoodPrice;
    private Double incomingGoodCount;
    private Double outgoingGoodCount;
    private Double inStockCount;
    private Good good;
    private Seller seller;
}