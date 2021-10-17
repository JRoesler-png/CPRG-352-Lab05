package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author Jeramie R
 */

public class LoginServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        
        
        if (request.getParameter("logout") != null) {
            session.invalidate();
            request.setAttribute("message", "You have successfully logged out.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
          
           
        } else if(session.getAttribute("username") != null){
             response.sendRedirect("home");
        }else{

            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        AccountService bobert = new AccountService();
        
        User user = bobert.login(username, password);
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        
        if (username == null || username.equals("") || password == null || password.equals("")) {
            request.setAttribute("message", "Failed authentication");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        } else if (user instanceof User) {
            session.setAttribute("object", user);
            session.setAttribute("username", username);
            response.sendRedirect("home");
            
        } else {
            request.setAttribute("message", "Failed authentication");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        }

    }

}


