package micro.listRepair.Repositories;

import micro.listRepair.Entities.ListRepairEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepairRepository extends JpaRepository<ListRepairEntity, Long> {
    // Encontrar un tipo de reparación por su nombre
    ListRepairEntity findByName(String name);

    // Encontrar un tipo de reparación por su id
    ListRepairEntity findById(long id);

    // Eliminar un tipo de reparación por su nombre
    ListRepairEntity deleteByName(String name);

    // Eliminar un tipo de reparación por su id
    ListRepairEntity deleteById(long id);

    // Guardar un tipo de reparación
    ListRepairEntity save(ListRepairEntity listRepairEntity);

    // Encontrar todos los tipos de reparación
    List<ListRepairEntity> findAll();
}
