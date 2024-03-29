package com.example.thuc_hanh.service;

import com.example.thuc_hanh.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAOService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    List<User> searchUser(String country);

    List<User> arrangeUser();

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);
}
