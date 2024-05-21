package micro.vehicle.Repositories;

import micro.vehicle.Entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    // Encontrar un vehículo por su patente
    VehicleEntity findByPatent(String patent);

}
