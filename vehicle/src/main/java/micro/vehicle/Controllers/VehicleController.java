package micro.vehicle.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import micro.vehicle.Services.VehicleService;
import micro.vehicle.Entities.VehicleEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    // Permite obtener un vehículo por su patente
    // @param patent
    // @return VehicleEntity
    // @throws Exception
    @GetMapping("/{patent}")
    public VehicleEntity getVehicleByPatent(@PathVariable String patent) throws Exception {
        return vehicleService.findByPatent(patent);
    }

    // Permite guardar un vehículo
    // @param vehicle
    // @return VehicleEntity
    // @throws Exception
    @PostMapping("/create")
    public VehicleEntity saveVehicle(@RequestBody Map<String, String> credentials) throws Exception {
        VehicleEntity vehicle = new VehicleEntity();
        vehicle.setPatent(credentials.get("patent"));
        vehicle.setBrand(credentials.get("brand"));
        vehicle.setModel(credentials.get("model"));
        vehicle.setYear(Integer.parseInt(credentials.get("year")));
        vehicle.setTypeEngine(credentials.get("typeEngine"));
        vehicle.setNumberSeats(Integer.parseInt(credentials.get("numberSeats")));
        return vehicleService.saveVehicle(vehicle);
    }
}
