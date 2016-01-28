package demo.dao;

import demo.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by pc on 1/25/16.
 */
public class UserDaoImpl implements UserDao {

    public Session getSession() {

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        return session;
    }


    @Override
    public void add(User user) {

        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();

        session.close();
    }

    @Override
    public User get(String username) {

        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();

        User user = (User) session.get(User.class, username);

        transaction.commit();

        session.close();

        return user;
    }

    @Override
    public User get(String username, String password) {

        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();

        User user = (User) session.get(User.class, username);

        transaction.commit();

        session.close();

        if (user != null) {

            if (password.equals(user.getPassword())) {

                return user;
            }
        }
        return null;
    }


}
