package am.work.shop.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop implements Serializable {

    private static final long serialVersionUID = 9029958502125535825L;

    private Integer id;
    private Date fromStockDate;
    private Date toSellerDate;
    private Stock fromStock;
    private Seller toSeller;
    private List<Good> goodList;
}