/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tuan Anh
 */
public class Account {

    int userID, age;
    String name, phone, email, userName, password, roleAcc;

    public Account() {
    }

    public Account(int age, String name, String phone, String email) {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Account(int userID, int age, String name, String phone, String email, String userName, String password, String roleAcc) {
        this.userID = userID;
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.roleAcc = roleAcc;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleAcc() {
        return roleAcc;
    }

    public void setRoleAcc(String roleAcc) {
        this.roleAcc = roleAcc;
    }

    @Override
    public String toString() {
        return "Account{" + "userID=" + userID + ", age=" + age + ", name=" + name + ", phone=" + phone + ", email=" + email + ", userName=" + userName + ", password=" + password + ", roleAcc=" + roleAcc + '}';
    }

}
