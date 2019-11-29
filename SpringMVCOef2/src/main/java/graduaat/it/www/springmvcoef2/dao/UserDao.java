package graduaat.it.www.springmvcoef2.dao;

import java.util.List;
 
import graduaat.it.www.springmvcoef2.model.User;

public interface UserDao {
    User findById(int id);
 
    void saveUser(User user);
     
    void deleteUserById(int id);
     
    List<User> findAllUsers();
}
