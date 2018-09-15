package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

/**
 * @program: SpringHibernate
 * @Date: 2018/9/13 18:08
 * @Author: Mr.Zhang
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public boolean checkUser(User user) {
        return userDao.query(user)!=null?true:false;
    }
    public void regist(User user) {
        userDao.insert(user);
    }
}
