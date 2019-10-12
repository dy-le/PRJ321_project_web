/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.User;

/**
 *
 * @author Tuan Anh
 */
public class UserDao {

    // fixed name of DB
    public List<User> selectByID(int id) throws Exception {
        List<User> list = new ArrayList<>();
        String sql = "Select * from [Routes] where UserID =" + id; //fixe here 
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        while (rs.next()) {
//            int id = rs.getInt("userID");
            String name = rs.getString("userName");
            String email = rs.getString("Email");
            String detail = rs.getString("detail");
            Date date = rs.getDate("birthDay");
            list.add(new User(id, name, email, detail, date));
        }
        rs.close();
        conn.close();
        return list;
    }
}
