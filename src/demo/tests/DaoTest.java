package demo.tests;

import demo.dao.UserDao;
import demo.dao.UserDaoImpl;
import demo.domain.User;
import org.junit.Test;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by pc on 1/25/16.
 */
public class DaoTest {

    @Test
    public void addTest() {

        User user = new User("bing","yang","Yinchuan","1234567890","ocean@gmail.com");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }

    @Test
    public void getTest() {

        UserDao dao = new UserDaoImpl();
        User user = dao.get("bing");
    }

    @Test
    public void get2Tset() {

        UserDao dao = new UserDaoImpl();
        User user = dao.get("bing","yang");
    }
}
