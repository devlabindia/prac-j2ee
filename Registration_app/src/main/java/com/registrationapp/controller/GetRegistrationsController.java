package com.registrationapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationapp.model.DAOServiceImpl;

@WebServlet("/GetRegistrationsController")
public class GetRegistrationsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetRegistrationsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		
		ResultSet result = service.readAllRegistrations();
		
		request.setAttribute("result",result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/all_registrations.jsp");
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
