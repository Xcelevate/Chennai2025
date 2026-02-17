package mybank.service;

import mybank.dao.UserServiceDAO;
import mybank.entities.Users;
import mybank.exception.UserNotFoundException;

public class LoginService {
    static Users currentUser ;
    private static boolean loggedIn = false;
    UserServiceDAO userServiceDAO;

    public LoginService() {
         userServiceDAO= new UserServiceDAO();
    }

    public boolean isLoggedIn() {
        return  loggedIn;
    }

    public boolean login(String username, String pwd) throws UserNotFoundException {
         Users user = userServiceDAO.getUserById(username, pwd);
        if(user == null){
            throw new UserNotFoundException("User Not Found");
        }
        if(user.getPwd().equals(pwd)){
            loggedIn = true;

            currentUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedIn = false;
        currentUser = null;
    }
}