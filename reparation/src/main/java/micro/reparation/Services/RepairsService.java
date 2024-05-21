package micro.reparation.Services;

import org.springframework.stereotype.Service;
import micro.reparation.Entities.RepairsEntity;
import micro.reparation.Repositories.RepairsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RepairsService {
    @Autowired
    private RepairsRepository repairsRepository;

    /**
     * Método que permite guardar una reparación
     */
    public RepairsEntity saveRepairs(RepairsEntity repairs) {
        return repairsRepository.save(repairs);
    }

    /**
     * Método que permite buscar una reparación por su id
     */
    public RepairsEntity findById(long id) {
        return repairsRepository.findById(id);
    }

    /**
     * Método que permite eliminar una reparación por su id
     */
    public RepairsEntity deleteById(long id) {
        return repairsRepository.deleteById(id);
    }

    /**
     * Método que permite buscar todas las reparaciones
     */
    public List<RepairsEntity> findAll() {
        return repairsRepository.findAll();
    }
}
