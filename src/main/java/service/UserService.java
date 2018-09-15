package service;

import pojo.User;

/**
 * @program: SpringHibernate
 * @Date: 2018/9/13 18:06
 * @Author: Mr.Zhang
 * @Description:
 */
public interface UserService {
    boolean checkUser(User user);
    void regist(User user);
}
