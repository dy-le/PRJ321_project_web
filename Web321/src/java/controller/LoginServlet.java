/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import context.DBContext;
import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Tuan Anh
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.sendRedirect("login/login.jsp");

//        response.sendRedirect( request.getContextPath() + "/login/login.jsp");
        request.getRequestDispatcher("login/login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //get value from login.jsp
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession(true);

        if (username != null
                && password != null) {
            AccountDAO dao = new AccountDAO();
            List<Account> acc = dao.login(username, password);
            System.out.println(acc.size());

            //validate account
            if (acc.size() == 1) {
                String role = "user";
                if (username.equals("admin")) {
                    role = "admin";
                }
                System.out.println("ahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111112222222222222233333");
                session.setAttribute("login", acc.get(0));
                session.setMaxInactiveInterval(15 * 60);

                response.addCookie(new Cookie("id", String.valueOf(acc.get(0).getUserID())));
                response.sendRedirect("home");
            } else {
                doGet(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
