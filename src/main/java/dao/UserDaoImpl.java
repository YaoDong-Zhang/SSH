package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;

/**
 * @program: SpringHibernate
 * @Date: 2018/9/13 16:51
 * @Author: Mr.Zhang
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public User query(User user) {
        Session session = sessionFactory.openSession();
        String hql = "from User where userid=:userid and password=:password";
        Query query = session.createQuery(hql);
        query.setParameter("userid",user.getUserid());
        query.setParameter("password",user.getPassword());
        User user1 = (User)query.uniqueResult();
        session.close();
        return user1;
    }
    @Transactional
    public void insert(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
    }
}

