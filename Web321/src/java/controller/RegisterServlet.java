/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author Tuan Anh
 */
public class RegisterServlet extends HttpServlet {

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
            if (request.getParameter("username") != null
                    && request.getParameter("email") != null
                    && request.getParameter("password1") != null
                    && request.getParameter("password2") != null
                    && request.getParameter("register") != null) {
                String username = request.getParameter("username");
                System.out.println(username);
                String email = request.getParameter("email");
                System.out.println(email);
                String password1 = request.getParameter("password1");
                System.out.println(password1);
                String password2 = request.getParameter("password2");
                System.out.println(password2);

                if (password1.equals(password2)) {
                    AccountDAO dao = new AccountDAO();
                    dao.register(username, email, password1);
                    response.sendRedirect("login");
                }
            } else {
                RequestDispatcher rs = request.getRequestDispatcher("Register/register.jsp");
                rs.forward(request, response);
            }

        } catch (Exception ex) {
            RequestDispatcher rs = request.getRequestDispatcher("Register/register.jsp");
            rs.forward(request, response);
            System.out.println(ex.getMessage() + "  --> ResgisterServlet");
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
        RequestDispatcher rs = request.getRequestDispatcher("register");
        rs.forward(request, response);
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
