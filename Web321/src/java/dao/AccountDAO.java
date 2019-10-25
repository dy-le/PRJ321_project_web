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
import java.util.List;
import javax.xml.registry.infomodel.User;
import model.Account;

/**
 *
 * @author Tuan Anh
 */
public class AccountDAO {

    public List<Account> select() throws Exception {
        List<Account> list = new ArrayList<>();
        String sql = "Select * from Account";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int id = rs.getInt("userID");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String roleAcc = rs.getString("roleAcc");
                list.add(new Account(id, age, name, phone, email, userName, password, roleAcc));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> accountDAO.select");
        }
        return list;
    }

    public List<Account> login(String user, String pwd) {
        List<Account> list = new ArrayList<>();

        String sql = "SELECT * FROM Account where username='" + user
                + "' and password= '" + pwd + "'";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int id = rs.getInt("userID");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String roleAcc = rs.getString("roleAcc");
                list.add(new Account(id, age, name, phone, email, userName, password, roleAcc));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " -->  AccountDAO.login");
        }

        return list;
    }

    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        List<Account> list = dao.login("anhnt@fpt.edu.vn", "ahihi123");
        try {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getUserID());
            }
        } catch (Exception e) {
        }
    }
}
