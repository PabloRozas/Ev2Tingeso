package micro.reparation.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "repairs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RepairsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_admission")
    private Date dateAdmission;

    @Column(name = "time_admission")
    private Time timeAdmission;

    @Column(name = "date_departure")
    private Date dateDeparture;

    @Column(name = "time_departure")
    private Time timeDeparture;

    @Column(name = "date_retirement")
    private Date dateRetirement;

    @Column(name = "time_retirement")
    private Time timeRetirement;

    // Monto total de las reparaciones
    @Column(name = "mount_repairs")
    private Double mountRepairs;

    @Column(name = "mount_discount")
    private Double mountDiscount;

    @Column(name = "mount_surcharge")
    private Double mountSurcharge;

    @Column(name = "mount_IVA")
    private Double mountIVA;

    @Column(name = "mount_total")
    private Double mountTotal;

    // Kilometros con los que ingreso al momento de la reparacion
    @Column(name = "kilometers")
    private Integer kilometers;
}
