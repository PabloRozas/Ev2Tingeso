package micro.listRepair.Services;

import org.springframework.stereotype.Service;
import micro.listRepair.Entities.ListRepairEntity;
import micro.listRepair.Repositories.ListRepairRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ListRepairService {
    @Autowired
    private ListRepairRepository listRepairRepository;

    /**
     * Método que permite guardar un tipo de reparación
     */
    public ListRepairEntity saveListRepair(ListRepairEntity listRepair) {
        return listRepairRepository.save(listRepair);
    }

    /**
     * Método que permite buscar un tipo de reparación por su nombre
     */
    public ListRepairEntity findByName(String name) {
        return listRepairRepository.findByName(name);
    }

    /**
     * Método que permite buscar un tipo de reparación por su id
     */
    public ListRepairEntity findById(long id) {
        return listRepairRepository.findById(id);
    }
}