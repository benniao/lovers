package com.xiaoqi;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoversServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		System.out.println("Test");
		resp.getWriter().println("Hello, world");
	}
}
