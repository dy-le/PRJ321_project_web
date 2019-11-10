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

    public List<Account> select(String accName) throws Exception {
        List<Account> list = new ArrayList<>();
        String sql = "Select * from Account WHERE Username like " + accName;
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

    public Account select(int userid) throws Exception {
        Account list = new Account();
        String sql = "Select * from Account WHERE userid = " + userid;
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
                list = new Account(id, age, name, phone, email, userName, password, roleAcc);
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

    public Account getAccount(int id) {
        try {
            ResultSet rs = new DBContext().getConnection().createStatement().executeQuery("select * from account where userid='" + id + "'");
            while (rs.next()) {
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                return new Account(age, name, phone, email);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " -->  AccountDAO.getAccount");
        }
        return null;
    }

    public void profile(int id, String name, int age, String phone, String email) {
        String sql = "UPDATE [Account]"
                + "SET Name = N'" + name + "', Age=" + age + ",Phone='" + phone + "',Email='" + email + "'"
                + "WHERE UserID ='" + id + "'";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareStatement(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " -->  AccountDAO.profile");
        }
    }

    public void register(String name, String username, String email, String password) {
        String sql = "INSERT INTO [Account] (Name, Email, Username,Password,RoleAcc)"
                + "  VALUES (N'" + name + "','" + email + "','" + username + "','" + password + "','user')";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareStatement(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " -->  AccountDAO.register");
        }
    }

    public List<String> getListAuthor() throws Exception {
        List<String> list = new ArrayList<>();
        String sql = "select distinct(Name) from Account";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                list.add(rs.getString("name"));
            }
            rs.close();
            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getListAuthor");
        }
        return list;
    }

    public static void main(String[] args) throws Exception {

        //check register
        AccountDAO dao = new AccountDAO();
//        dao.register("bangoccho", "bangpc@fpt.edu.vn", "bangpc@fpt.edu.vn", "ahihi123");
//        check login
//        AccountDAO dao = new AccountDAO();
//        List<Account> list = dao.login("anhnt@fpt.edu.vn", "ahihi123");
//        try {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i).getUserID());
//            }
//        } catch (Exception e) {
//        }
//        Account list = dao.select(1);
//        System.out.println(list.getName());
//        System.out.println(dao.select().get(2).getName());
    }
}
