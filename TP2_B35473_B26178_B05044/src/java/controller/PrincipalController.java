package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectModel.UserModel;

/**
 *
 * @author Ana Teresa
 */
public class PrincipalController {

    private UserModel userModel;

    public void createUserModel(UserModel newUserModel) throws SQLException {
        userModel = new UserModel();
        userModel = newUserModel;
        userModel.createModel();
    }

    public boolean updateUser(UserModel userToUpdate) {
        try {
            userModel = userToUpdate;
            userModel.updateModel();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public UserModel loginUser(UserModel user) throws SQLException {
        userModel = user.loginUser();
        user.setId(userModel.getId());
        return userModel;
    }

    public boolean deleteUser(UserModel user) throws SQLException {
        userModel = user;
        return userModel.deleteUser();
    }

    public String tableContent() throws SQLException {
        return userModel.tableC();
    }

}