/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.AccountDAO;
import dao.PostDAO;
import dao.typeDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lpxed
 */
public class post {

    int id;
    String header;
    String body;
    String img;

    int like;

    String acc;
    int typeId;
    Date date;
    boolean status;

    public post() {
    }

    public post(int id, String header, String body, String img, int typeId, Date date, boolean status, String accName) throws Exception {
        this.id = id;
        this.header = header;
        this.body = body;
        this.img = img;
        this.typeId = typeId;
        this.date = date;
        this.status = status;
//        this.acc = (Account)new AccountDAO().select(accName);
        this.acc = accName;
    }

//    public post(int id, String header, String body, String img, int like, Account acc, int typeId, Date date, boolean status) {
//        this.id = id;
//        this.header = header;
//        this.body = body;
//        this.img = img;
//        this.like = like;
//        this.acc = acc;
//        this.typeId = typeId;
//        this.date = date;
//        this.status = status;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getTypeId() {
        return typeId;
    }

    public TypePaper getType() throws Exception {
        typeDAO a = new typeDAO();
        TypePaper type = a.selectById(typeId);
        return type;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public int getStatus() {
        if (isStatus()) {
            return 1;
        }
        return 0;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "post{" + "id=" + id + ", header=" + header + ", body=" + body + ", img=" + img + ", like=" + like + ", acc=" + acc + ", typeId=" + typeId + ", date=" + date + ", status=" + status + '}';
    }

    public int getCountcmt() {
        PostDAO dao = new PostDAO();
        return dao.getCountCmt(getId());
    }

    public int getCountlike() {
        PostDAO dao = new PostDAO();
        return dao.getCountLike(getId());
    }
    
    public List<post> getPostByAuthor() throws Exception{
        PostDAO dao = new PostDAO();
        return dao.selectByAuthor(getAcc());
    }
}
