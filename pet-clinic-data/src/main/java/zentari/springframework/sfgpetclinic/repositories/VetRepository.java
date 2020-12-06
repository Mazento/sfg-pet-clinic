package zentari.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zentari.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
