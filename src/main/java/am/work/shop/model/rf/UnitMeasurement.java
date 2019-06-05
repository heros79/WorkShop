package am.work.shop.model.rf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnitMeasurement implements Serializable {

    private static final long serialVersionUID = -5323363945977728562L;

    private Integer id;
    private String unitName;
}