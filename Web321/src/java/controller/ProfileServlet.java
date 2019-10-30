/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        String a = request.getContextPath();
        System.out.println("Contextpath: "+ a);
        Cookie [] cookies = request.getCookies();
        String id = "";
        for (Cookie cooky : cookies) {
            if(cooky.getName().equals("id")){
                id = cooky.getValue();
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("account", new AccountDAO().getAccount(Integer.valueOf(id)));
        request.getRequestDispatcher("profile.jsp").forward(request, response);
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            if (request.getParameter("save") != null
                    && request.getParameter("name") != null) {
                String name = request.getParameter("name");
                int age = Integer.valueOf(request.getParameter("age"));
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                Cookie[] cookies = request.getCookies();
                String id = "";
                for (Cookie cooky : cookies) {
                    if (cooky.getName().equals("id")) {
                        id = cooky.getValue();
                    }
                }
                session.setAttribute("email", email);
                session.setAttribute("name", name);
                session.setAttribute("age", age);
                session.setAttribute("phone", phone);

                AccountDAO dao = new AccountDAO();
                dao.profile(id, name, age, phone, email);

            }

            RequestDispatcher rs = request.getRequestDispatcher("profile.jsp");
            rs.forward(request, response);

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
