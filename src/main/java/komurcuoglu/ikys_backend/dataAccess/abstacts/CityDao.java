package komurcuoglu.ikys_backend.dataAccess.abstacts;

import komurcuoglu.ikys_backend.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
