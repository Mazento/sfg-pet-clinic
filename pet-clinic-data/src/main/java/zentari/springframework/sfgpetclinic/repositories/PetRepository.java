package zentari.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zentari.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
