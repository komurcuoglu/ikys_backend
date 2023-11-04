package komurcuoglu.ikys_backend.business.concretes;
import komurcuoglu.ikys_backend.business.abstracts.UserService;
import komurcuoglu.ikys_backend.core.dataAccess.UserDao;
import komurcuoglu.ikys_backend.core.entities.User;
import komurcuoglu.ikys_backend.core.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import komurcuoglu.ikys_backend.core.utilities.results.SuccessDataResult;
import java.util.List;
@Service
public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public DataResult<List<User>> getAll(){
        return new SuccessDataResult<List<User>>(userDao.findAll());
    }
    @Override
    public DataResult<User> getById(int id){
        return new SuccessDataResult<User>(userDao.getById(id));
    }
    @Override
    public DataResult<User> getByEmail(String email){
        return new SuccessDataResult<User>(userDao.getByEmail(email));
    }
}
