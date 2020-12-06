package zentari.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zentari.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
