package micro.listRepair.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "list_repair")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListRepairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // En los siguientes atributos se guardará el precio de cada tipo de reparación
    @Column(name = "description")
    private String description;

    @Column(name = "gasoline")
    private Integer gasoline;

    @Column(name = "diesel")
    private Integer diesel;

    @Column(name = "hybrid")
    private Integer hybrid;

    @Column(name = "electric")
    private Integer electric;
}
