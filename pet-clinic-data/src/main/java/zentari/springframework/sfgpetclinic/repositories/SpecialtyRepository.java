package zentari.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zentari.springframework.sfgpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
