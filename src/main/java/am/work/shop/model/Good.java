package am.work.shop.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Good implements Serializable {

    private static final long serialVersionUID = 5049311882232440483L;

    private Integer id;
    private String goodName;
    private Double unitMeasurment;
    private Double countInShop;
    private Double countInStock;

}