package am.work.shop.entity;

import am.work.shop.entity.rf.UnitMeasurementEntity;
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
@Table(name = "GOOD", indexes = {@Index(name = "idIndex", columnList = "id"),
        @Index(name = "goodNameIndex", columnList = "GOOD_NAME")})
public class GoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "GOOD_NAME", nullable = false)
    private String goodName;

    @Column(name = "GOOD_DESCRIPTION")
    private String goodDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UNIT_ID", referencedColumnName = "id")
    private UnitMeasurementEntity unitMeasurementEntity;
}