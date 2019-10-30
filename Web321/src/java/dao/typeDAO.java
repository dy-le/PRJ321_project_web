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
import model.TypePaper;

/**
 *
 * @author lpxed
 */
public class typeDAO {

    public List<TypePaper> select() throws Exception {
        List<TypePaper> list = new ArrayList<>();
        String sql = "SELECT * FROM TypePaper";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                int id = rs.getInt("TypeID");
                String content = rs.getString("Content");
                list.add(new TypePaper(id, content));
            }
            rs.close();
            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> typeDAO.select");
        }
        return list;
    }

    public TypePaper selectById(int ids) throws Exception {
        TypePaper type = new TypePaper();
        String sql = "SELECT * FROM TypePaper Where TypeID='"+ids+"'";
        try {
            Connection conn = new DBContext().getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            rs.next();
            int id = rs.getInt("TypeID");
            String content = rs.getString("Content");
            type = new TypePaper(id, content);

            rs.close();
            conn.close();
            return type;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  --> typeDAO.select");
        }
        return type;
    }

}
