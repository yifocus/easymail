package com.focus.easymail.dao;

import com.focus.easymail.entity.User;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserDaoImp implements UserDao {

    @Override
    public User queryById(Integer id) {

        Connection con = null;
        String sql = "select * from User where id = #{id}";
        try {
            PreparedStatement stamt = con.prepareStatement(sql);
            ResultSet result = stamt.executeQuery();

            User user = new User();
            while (result.next()) {
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));

            }

            return user;
        } catch (SQLException e) {

        }
        return null;
    }

    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public List<User> queryAll(User user) {
        return null;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }

    @Override
    public User queryByUserName(String username) {
        return null;
    }
}
