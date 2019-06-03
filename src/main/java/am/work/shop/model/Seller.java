package am.work.shop.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller implements Serializable {

    private static final long serialVersionUID = -6437451603861439288L;

    private Integer id;
    private String firmName;
    private String sellerName;
    private String sellerLastName;
    private String sellerPhone;
    private String sellerAddress;
    private String sellerMail;
}