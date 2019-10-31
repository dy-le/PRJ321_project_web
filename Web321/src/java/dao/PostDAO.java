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
import java.text.SimpleDateFormat;
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
        String sql = "select * from Paper where PaperID=" + idp;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            rs.next();
            int id = rs.getInt("PaperID");
            String title = rs.getString("Title");
            String author = rs.getString("Author");
            String body = rs.getString("Body");
            String img = rs.getString("Img");
            int typeID = rs.getInt("TypeID");
            Date date = rs.getDate("Date");
            boolean Status = rs.getBoolean("Status");
            pt = new post(id, title, body, img, typeID, date, Status, author);
            rs.close();
            conn.close();
            return pt;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.select1");
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
                String body = rs.getString("Body");
                String img = rs.getString("Img");
                int typeID = rs.getInt("TypeID");
                Date date = rs.getDate("Date");
                boolean Status = rs.getBoolean("Status");
                list.add(new post(id, title, body, img, typeID, date, Status, author));
            }
            rs.close();
            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.select2");
        }
        return list;
    }

    public List<post> selectTop() throws Exception {
        post pt = new post();
        List<post> list = new ArrayList<>();
        String sql = "select TOP (5) * from Paper ORDER BY Date desc";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int id = rs.getInt("PaperID");
                String title = rs.getString("Title");
                String author = rs.getString("Author");
                String body = rs.getString("Body");
                String img = rs.getString("Img");
                int typeID = rs.getInt("TypeID");
                Date date = rs.getDate("Date");
                boolean Status = rs.getBoolean("Status");
                list.add(new post(id, title, body, img, typeID, date, Status, author));
            }
            rs.close();
            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.selectTop");
        }
        return list;
    }

    public boolean insert(post pt) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT INTO Paper VALUES (N'"+pt.getHeader()+"',N'"+pt.getAcc()+"',N'"+pt.getBody()+"','"+pt.getImg()+
            "','" + pt.getTypeId() + "','" + format.format(pt.getDate()) + "'," + pt.getStatus() +")";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareCall(sql).execute();
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.insert");
        }
        return false;
    }
    
    public void addcomment(int userid, int paperid,String commentCt){
        String sql = "Insert into Comment values ("+ userid + ","+ paperid + ",N'" + commentCt + "')";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareCall(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.addcomment");
        }
    }
    
    public static void main(String[] args) {
//        PostDAO dao = new PostDAO();
//        dao.addcomment(1, 1, "hôm nay tôi buồn ahihi");
    }
    
    
    
}
