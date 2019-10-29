/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.post;

/**
 *
 * @author lpxed
 */
public class PostDAO {

    public post select(String idp) throws Exception {
        post pt = new post();
        String sql = "select * from Paper where PaperID="+idp;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            rs.next();
            int id = rs.getInt("PaperID");
            String title = rs.getString("Title");
            String author = rs.getString("Author");
            int typeID = rs.getInt("TypeID");
            Date date = rs.getDate("Date");
            boolean Status = rs.getBoolean("Status");
            pt = new post(id, title, "smt", "smt", typeID, date, Status, author);
            rs.close();
            conn.close();
            return pt;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.select");
        }
        return pt;
    }

    public List<post> select() throws Exception {
        post pt = new post();
        List<post> list = new ArrayList<>();
        String sql = "select * from Paper";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int id = rs.getInt("PaperID");
                String title = rs.getString("Title");
                String author = rs.getString("Author");
                int typeID = rs.getInt("TypeID");
                Date date = rs.getDate("Date");
                boolean Status = rs.getBoolean("Status");
                list.add(new post(id, title, "smt", "3.jpg", typeID, date, Status, author));
            }
            rs.close();
            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.select");
        }
        return list;
    }
}
