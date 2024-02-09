package com.registrationapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp.model.DAOServiceImpl;

@WebServlet("/GetRegistrationsController")
public class GetRegistrationsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetRegistrationsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(90);
			if(session.getAttribute("email")!=null) {
				DAOServiceImpl service = new DAOServiceImpl();
				service.connectDB();
				
				ResultSet result = service.readAllRegistrations();
				
				request.setAttribute("result",result);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/all_registrations.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "Session timedout. Login Again!!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
