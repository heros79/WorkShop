package am.work.shop.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Buyer implements Serializable {

    private static final long serialVersionUID = -7048973251009022242L;

    private Integer id;
    private String buyerFirmName;
    private String buyerName;
    private String buyerLastName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerMail;
}
