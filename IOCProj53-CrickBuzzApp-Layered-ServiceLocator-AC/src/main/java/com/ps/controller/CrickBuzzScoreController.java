package com.ps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.service.CrickBuzzService;
import com.ps.service.CrickBuzzServiceImpl;

public class CrickBuzzScoreController extends HttpServlet {
	private ApplicationContext ctx;	
	
	@Override
	public void init() throws ServletException {
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
	}
	    
 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CrickBuzzService service=null;
		String score=null;
		int mid=0;
		RequestDispatcher rd=null;
		//read match id given by hyperlink as additional req param value
		mid=Integer.parseInt(req.getParameter("mid"));
		//get service class object
		service=ctx.getBean("cbService", CrickBuzzServiceImpl.class);
		//use service
		score=service.fetchMatchScore(mid);		
		//Keep score in req scope
		req.setAttribute("score", score);
		//forward to show_score.jsp
		rd=req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}

}
