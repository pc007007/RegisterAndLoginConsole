package demo.dao;

import demo.domain.User;

/**
 * Created by pc on 1/25/16.
 */
public interface UserDao {

    public void add(User user);

    public User get(String username);

    public User get(String username, String password);
}
