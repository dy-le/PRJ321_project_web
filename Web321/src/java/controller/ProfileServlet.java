/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ProfileServlet extends HttpServlet {

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

        HttpSession session = request.getSession(false);
        try {
            if (session.getAttribute("login") == null) {
                response.sendRedirect("login");
            } else {
                AccountDAO dao = new AccountDAO();
                Account list = (Account) session.getAttribute("login");
                session.setAttribute("login", dao.select(list.getUserID()));
               
                request.getRequestDispatcher("profile.jsp").forward(request, response);
            }
        } catch (Exception e) {
        }

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
        if (request.getParameter("username") == null) {
            doGet(request, response);
        }

        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(false);
            Account list = (Account) session.getAttribute("login");
            if (session != null) {

                
                String name = request.getParameter("name");
                int age = Integer.valueOf(request.getParameter("age"));
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");

                AccountDAO dao = new AccountDAO();
                dao.profile(list.getUserID(), name, age, phone, email);
                session.setAttribute("login", dao.select(list.getUserID()));

//                response.sendRedirect("profile");
                doGet(request, response);
            } else {
                doGet(request, response);
            }

//            String change = getServletConfig().getInitParameter("change");
//            request.setAttribute("change", change);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "  --> ProfileServlet");
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
