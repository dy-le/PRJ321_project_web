/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Comment;
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

    public List<post> getPostByTypeID(int idtype) throws Exception {
        List<post> list = new ArrayList<>();
        String sql = "select * from Paper where TypeID=" + idtype;
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
            System.out.println(e.getMessage() + "  --> postDAO.getPostByTypeID");
        }
        return list;
    }

    public List<post> getPopulerPost() throws Exception {
        List<post> list = new ArrayList<>();
        String sql = "SELECT TOP (5) pa.*, cl.dol FROM [Paper] pa, (SELECT COUNT([PaperID]) as dol, "
                + "[PaperID] FROM [like] GROUP BY [PaperID]) cl WHERE pa.PaperID = cl.PaperID "
                + "ORDER BY cl.dol DESC ";
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
            System.out.println(e.getMessage() + "  --> postDAO.getPostByTypeID");
        }
        return list;
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
    
    public List<post> selectByAuthor(String name) throws Exception {
        post pt = new post();
        List<post> list = new ArrayList<>();
        String sql = "select * from Paper where author=N'" + name + "'" ;
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

    public boolean insert(post pt) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT INTO Paper VALUES (N'" + pt.getHeader() + "',N'" + pt.getAcc()
                + "',N'" + pt.getBody() + "','" + pt.getImg() + "','" + pt.getTypeId() + "','"
                + format.format(pt.getDate()) + "'," + pt.getStatus() + ")";
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

    public void addcomment(int userid, int paperid, String commentCt) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String sql = "Insert into Comment values (" + userid + "," + paperid + ",N'"
                + commentCt + "','" + format.format(date) + "')";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareCall(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.addcomment");
        }
    }

    public String getNameComment(int userid) {
        String name = "";
        String sql = "select name from account where userid=" + userid;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                name = rs.getString("name");
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getNameComment");
        }
        return name;
    }

    public int getCountCmt(int paperid) {
        int count = -1;
        String sql = "select count(paperid) as[Count] from Comment where PaperID=" + paperid;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                count = rs.getInt("Count");
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getCountCmt");
        }
        return count;
    }

    public int getCountLike(int paperid) {
        int count = -1;
        String sql = "select count(paperid) as[Count] from [Like] where PaperID=" + paperid;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                count = rs.getInt("Count");
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getCountLike");
        }
        return count;
    }

    public int getLike(int userid, int paperid) {
        int count = -1;
        String sql = "Select COUNT(userid) as[like] from [like] where userid =" + userid
                + "and PaperID =" + paperid;
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                count = rs.getInt("like");
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getLike");
        }
        return count;
    }

    public void deleteLike(int userid, int paperid) {
        String sql = "Delete [like] where userid =" + userid + " and paperid = " + paperid;
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareStatement(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.deleteLike");
        }
    }

    public void addLike(int userid, int paperid) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String sql = "Insert into [Like] values(" + userid + "," + paperid + ",'" + format.format(date) + "')";
        try {
            Connection conn = new DBContext().getConnection();
            conn.prepareStatement(sql).execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.addLike");
        }
    }

    public List<Comment> getComment(int paperid) {
        String sql = "Select * from Comment where paperid='" + paperid + "'";
        List<Comment> list = new ArrayList();
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int userid = rs.getInt("userid");
                String commentct = rs.getString("Content Comment");
                Date date = rs.getDate("Date comment");
                String name = getNameComment(userid);
                list.add(new Comment(userid, paperid, commentct, name, date));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> postDAO.getComment");
        }

        return list;
    }

    public List<post> getPost(int page, int size) throws Exception {
        int from = (page - 1) * size + 1;
        int to = size * page;
        String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER(ORDER BY Date DESC) AS Row#,* FROM Paper) x WHERE x.Row# BETWEEN " + from + " AND " + to;

        List<post> list = new ArrayList<>();

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
            System.out.println(e.getMessage() + "  --> postDAO.getPost");
        }
        return list;

    }

    public int getPages(int size) throws Exception {
        String sql = "select count(*) from Paper";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        int rows = 0;
        if (rs.next()) {
            rows = rs.getInt(1);
        }
        int pages = rows / size;
        int du = rows % size;
        if (du > 0) {
            pages++;
        }//Math.ceil(a / 100)
        return (rows < size ? 1 : pages);
    }
    
    

    public static void main(String[] args) throws Exception {
        PostDAO dao = new PostDAO();
//        dao.addcomment(1, 1, "111111: hôm nay tôi buồn ahihi");
//        List<Comment> list = dao.getComment(2);
//        for (Comment x : list) {
//            System.out.println(x.getName());
//        }
//        dao.insert(new post(1, "say hay", "ahihhi", "duy1.jpg", 1, new Date(), true, "daemon-lee"));

//        System.out.println(dao.getLike(1, 6));
//        dao.deleteLike(1, 6);
//        dao.addLike(1, 6);
//        dao.getPost(1, 5);
//        System.out.println(dao.getCountLike(11));
//        System.out.println(dao.selectByAuthor("Tuấn Anh").get(0));
    }

}
