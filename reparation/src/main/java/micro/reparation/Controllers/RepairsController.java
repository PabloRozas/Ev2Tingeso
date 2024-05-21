package micro.reparation.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import micro.reparation.Entities.RepairsEntity;
import micro.reparation.Services.RepairsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Date;
import java.sql.Time;
import java.util.Map;

@RestController
@RequestMapping("/repairs")
@CrossOrigin(origins = "*")
public class RepairsController {
    @Autowired
    private RepairsService repairsService;

    // Permite guardar una reparación
    // @param repairs
    // @return RepairsEntity
    // @throws Exception
    @PostMapping("/create")
    public RepairsEntity saveRepairs(@RequestBody Map<String, String> credentials) throws Exception {
        RepairsEntity repairs = new RepairsEntity();
        repairs.setDateAdmission(Date.valueOf(credentials.get("dateAdmission")));
        repairs.setTimeAdmission(Time.valueOf(credentials.get("timeAdmission")));
        repairs.setDateDeparture(Date.valueOf(credentials.get("dateDeparture")));
        repairs.setTimeDeparture(Time.valueOf(credentials.get("timeDeparture")));
        repairs.setDateRetirement(Date.valueOf(credentials.get("dateRetirement")));
        repairs.setTimeRetirement(Time.valueOf(credentials.get("timeRetirement")));
        repairs.setMountRepairs(Double.parseDouble(credentials.get("mountRepairs")));
        repairs.setMountDiscount(Double.parseDouble(credentials.get("mountDiscount")));
        repairs.setMountSurcharge(Double.parseDouble(credentials.get("mountSurcharge")));
        repairs.setMountIVA(Double.parseDouble(credentials.get("mountIVA")));
        repairs.setMountTotal(Double.parseDouble(credentials.get("mountTotal")));
        repairs.setKilometers(Integer.parseInt(credentials.get("kilometers")));
        return repairsService.saveRepairs(repairs);
    }

    // Permite buscar una reparación por su id
    // @param id
    // @return RepairsEntity
    // @throws Exception
    @GetMapping("/findById/{id}")
    public RepairsEntity findById(@PathVariable long id) throws Exception {
        return repairsService.findById(id);
    }

}
