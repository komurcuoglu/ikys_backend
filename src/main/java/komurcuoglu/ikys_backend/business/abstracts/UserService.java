package komurcuoglu.ikys_backend.business.abstracts;

import komurcuoglu.ikys_backend.core.entities.User;
import komurcuoglu.ikys_backend.core.utilities.results.DataResult;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    DataResult<User>getById(int id);
    DataResult<User>getByEmail(String email);

}
