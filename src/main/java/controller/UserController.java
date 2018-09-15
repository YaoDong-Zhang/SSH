//package controller;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import pojo.Teacher;
//import pojo.User;
//
///**
// * @program: dszg
// * @Date: 2018/9/15 15:26
// * @Author: Mr.Zhang
// * @Description:
// */
//@Controller
//public class UserController {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @RequestMapping("/login.do")
//    public String login(){
//        Session session = sessionFactory.openSession();
//        User user = session.load(User.class,1);
//        System.out.println(user.getPassword());
//        Teacher teacher = session.load(Teacher.class,1);
//        System.out.println(teacher.getName());
//        return "index";
//    }
//}
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.User;
import service.UserService;

/**
 * @program: SpringHibernate
 * @Date: 2018/9/13 17:13
 * @Author: Mr.Zhang
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user){
        if(userService.checkUser(user)){
            return "index";
        }
        return "login";
    }
    @RequestMapping(value = "regist.do",method = RequestMethod.POST)
    public String regist(User user){
        userService.regist(user);
        return "index";
    }
}
