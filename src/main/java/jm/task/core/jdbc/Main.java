package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.util.dao.UserDao;
import jm.task.core.jdbc.util.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util.getConnection();

        UserDao userDao = new UserDaoJDBCImpl();
//
        userDao.createUsersTable();
//
        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 21);
        userDao.saveUser("Name3", "LastName3", (byte) 22);
        userDao.saveUser("Name4", "LastName4", (byte) 23);

        userDao.removeUserById(3);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
