package dao;

import pojo.User;

/**
 * @program: SpringHibernate
 * @Date: 2018/9/13 16:50
 * @Author: Mr.Zhang
 * @Description:
 */
public interface UserDao {
    User query(User user);
    void insert(User user);
}
