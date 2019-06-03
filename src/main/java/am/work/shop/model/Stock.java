package am.work.shop.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock implements Serializable {

    private static final long serialVersionUID = 687573700852360001L;

    private Integer id;
    private Date fromBuyerDate;
    private Date toShopDate;
    private Buyer fromBuyer;
    private Shop toShop;
    private List<Good> goodList;
}