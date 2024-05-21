package micro.vehicle.Services;

import micro.vehicle.Entities.VehicleEntity;
import micro.vehicle.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * Método que permite guardar un vehículo
     */
    public VehicleEntity saveVehicle(VehicleEntity vehicle) {
        return vehicleRepository.save(vehicle);
    }

    /**
     * Método que permite buscar un vehículo por su patente
     */
    public VehicleEntity findByPatent(String patent) {
        return vehicleRepository.findByPatent(patent);
    }
}
