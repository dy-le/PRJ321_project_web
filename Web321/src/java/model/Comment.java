/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Tuan Anh
 */
public class Comment {
    int userid,paperid;
    String commentct, name;
    Date date;

    public Comment() {
    }

    public Comment(int userid, int paperid, String commentct, String name, Date date) {
        this.userid = userid;
        this.paperid = paperid;
        this.commentct = commentct;
        this.name = name;
        this.date = date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
    }

    public String getCommentct() {
        return commentct;
    }

    public void setCommentct(String commentct) {
        this.commentct = commentct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
}
