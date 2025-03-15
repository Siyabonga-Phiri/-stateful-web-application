/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.NewSessionBeanLocal;

/**
 *
 * @author user
 */
public class TicketServlet extends HttpServlet {

    @EJB
    NewSessionBeanLocal ts;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       // Integer numTickets=100;
        int numTickets = Integer.parseInt(request.getParameter("num_buy"));
        
       Integer num = ts.deductTicket(numTickets);
       // Integer num = ts.calcTickets();
        
        HttpSession session = request.getSession();
        
        //String name = (String)getServletContext().getAttribute("comp_name");
        
       session.setAttribute("num", num);
      
       RequestDispatcher rd = request.getRequestDispatcher("outcome.jsp");
       rd.forward(request, response);
    }

}
