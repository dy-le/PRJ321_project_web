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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        try (PrintWriter out = response.getWriter()) {
            //get value from login.jsp
            if (request.getParameter("signin")!= null 
                    && request.getParameter("inputEmail") != null 
                    && request.getParameter("inputPassword") != null) {
                String username = request.getParameter("inputEmail");
                response.getWriter().println(username);
                String password = request.getParameter("inputPassword");
                response.getWriter().println(password);

                AccountDAO dao = new AccountDAO();
                List<Account> acc = dao.login(username, password);

                HttpSession session = request.getSession(true);
                //validate account
                if (acc.size() == 1) {
                    String role = "user";
                    if (username.equals("admin")) {
                        role = "admin";
                    }
                    session.setAttribute("login", acc);
                    session.setMaxInactiveInterval(15 * 60);

                    RequestDispatcher rs = request.getRequestDispatcher("home.jsp");
                    rs.forward(request, response);
                }
            }

            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.forward(request, response);

        } catch (Exception ex) {
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.include(request, response);
//            response.getWriter().println(ex);
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
