package service;

import model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUser();
    User getUser(long id);

}
