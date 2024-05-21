package micro.reparation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import micro.reparation.Entities.RepairsEntity;

@Repository
public interface RepairsRepository extends JpaRepository<RepairsEntity, Long> {
    // Encontrar una reparación por su id
    RepairsEntity findById(long id);

    // Eliminar una reparación por su id
    RepairsEntity deleteById(long id);

    // Guardar una reparación
    RepairsEntity save(RepairsEntity repairsEntity);

    // Encontrar todas las reparaciones
    List<RepairsEntity> findAll();
}
