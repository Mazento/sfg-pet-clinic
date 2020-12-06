package zentari.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zentari.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
