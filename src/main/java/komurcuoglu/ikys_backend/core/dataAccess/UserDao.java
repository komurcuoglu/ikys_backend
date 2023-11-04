package komurcuoglu.ikys_backend.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import komurcuoglu.ikys_backend.core.entities.User;
public interface UserDao extends JpaRepository<User,Integer>  {

    User getByEmail(String email);

}
