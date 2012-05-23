package com.xiaoqi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username != null
				&& password != null
				&& (username.equals("xiaoxiao") && password.equals("xiaoxiao") || username
						.equals("qiqi") && password.equals("qiqi"))) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("/home.jsp");
		} else {
			resp.sendRedirect("/index.html");
		}
	}

}
