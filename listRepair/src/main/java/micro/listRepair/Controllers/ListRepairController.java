package micro.listRepair.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import micro.listRepair.Services.ListRepairService;
import micro.listRepair.Entities.ListRepairEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("/listRepair")
@CrossOrigin(origins = "*")
public class ListRepairController {
    @Autowired
    private ListRepairService listRepairService;

    // Permite guardar un tipo de reparación
    // @param listRepair
    // @return ListRepairEntity
    // @throws Exception
    @PostMapping("/create")
    public ListRepairEntity saveListRepair(@RequestBody Map<String, String> credentials) throws Exception {
        ListRepairEntity listRepair = new ListRepairEntity();
        listRepair.setName(credentials.get("name"));
        listRepair.setDescription(credentials.get("description"));
        listRepair.setGasoline(Integer.parseInt(credentials.get("gasoline")));
        listRepair.setDiesel(Integer.parseInt(credentials.get("diesel")));
        listRepair.setHybrid(Integer.parseInt(credentials.get("hybrid")));
        listRepair.setElectric(Integer.parseInt(credentials.get("electric")));
        return listRepairService.saveListRepair(listRepair);
    }

    // Permite buscar un tipo de reparación por su nombre
    // @param name
    // @return ListRepairEntity
    // @throws Exception
    @GetMapping("/findByName/{name}")
    public ListRepairEntity findByName(@PathVariable String name) throws Exception {
        return listRepairService.findByName(name);
    }

}
