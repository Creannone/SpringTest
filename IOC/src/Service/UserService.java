package Service;

import Dao.UserDao;

public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void run(){
        System.out.println("service run....");
        userDao.update();
    }
}
