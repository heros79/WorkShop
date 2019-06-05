package am.work.shop.model;

import am.work.shop.model.rf.UnitMeasurement;
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
    private String goodDescription;
    private UnitMeasurement unitMeasurement;

}