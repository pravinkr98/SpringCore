package com.ps.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ps.service.CrickBuzzService;
import com.ps.service.CrickBuzzServiceImpl;

public class CrickBuzzScoreController extends HttpServlet {
	    
 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CrickBuzzService service=null;
		String score=null;
		int mid=0;
		RequestDispatcher rd=null;
		service=new CrickBuzzServiceImpl();
		mid=Integer.parseInt(req.getParameter("mid"));
		try {
			score=service.fetchMatchScore(mid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Keep score in req scope
		req.setAttribute("score", score);
		//forward to show_score.jsp
		rd=req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
