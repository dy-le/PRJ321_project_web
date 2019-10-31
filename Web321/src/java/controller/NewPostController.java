/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import dao.typeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TypePaper;
import model.post;

/**
 *
 * @author lpxed
 */
public class NewPostController extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            typeDAO dao = new typeDAO();
            List<TypePaper> list = dao.select();
            if (request.getParameter("submit") != null) {
                String header = request.getParameter("title");
                String body = request.getParameter("body");
                int typeId = Integer.valueOf(request.getParameter("stypeSelect"));
                Date date = new Date();
                System.out.println(date);
                post pt = new post(1, header, body, "duy1.jpg", typeId, date, true, "daemon-lee");
                PostDAO dao1 = new PostDAO();
                if (dao1.insert(pt)) {
                    response.sendRedirect("/Web321/home");
                }
            }
            request.setAttribute("listType", list);
            RequestDispatcher rd = request.getRequestDispatcher("yummy/newPost.jsp");
            rd.forward(request, response);
            
        } catch (Exception Ex) {
            response.getWriter().println(Ex);
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
