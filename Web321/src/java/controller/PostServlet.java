/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.post;

/**
 *
 * @author lpxed
 */
public class PostServlet extends HttpServlet {

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
        try {
            PostDAO dao = new PostDAO();
            List<post> list = new ArrayList();
            list = dao.selectTop();
            
            String like = "fa-heart-o";
            String id = request.getParameter("idPost");
            post pt = dao.select(id);

            request.setAttribute("post", pt);
            request.setAttribute("listpost", list);

            HttpSession session = request.getSession(false);
            Account login = (Account) session.getAttribute("login");
            if (login != null
                    && request.getParameter("message") != null
                    && request.getParameter("idPost") != null) {
                int userid = login.getUserID();
                int paperid = Integer.valueOf(id);
                String commentct = request.getParameter("message");
                System.out.println("userid: " + userid);
                System.out.println("commentct: " + commentct);
                //addcomment
                dao.addcomment(userid, paperid, commentct);
                //showlike

            }
            
            if (login != null) {
                if (dao.getLike(login.getUserID(), Integer.valueOf(id)) == 1) {
                    like = "fa-heart";
                    System.out.println("111111like: " + like);
                }
            }

            if (id != null) {
                request.setAttribute("listComment", dao.getComment(Integer.valueOf(id)));
                request.setAttribute("countCmt", dao.getCountCmt(Integer.valueOf(id)));
                request.setAttribute("like", like);
            }
            System.out.println("======countCmt:  " + dao.getCountCmt(Integer.valueOf(id)));
            System.out.println("======idPost:  " + Integer.valueOf(id));

            RequestDispatcher rd = request.getRequestDispatcher("yummy/single.jsp");
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
//        processRequest(request, response);
//        HttpSession session = request.getSession(false);
//
//        PostDAO dao = new PostDAO();
//        Account login = (Account) session.getAttribute("login");
//
//        if (login != null
//                && request.getParameter("message") != null
//                && request.getParameter("idPost") != null) {
//            int userid = login.getUserID();
//            int paperid = Integer.valueOf(request.getParameter("idPost"));
//            String commentct = request.getParameter("message");
//            dao.addcomment(userid, paperid, commentct);
//        }
//        doGet(request, response);
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
