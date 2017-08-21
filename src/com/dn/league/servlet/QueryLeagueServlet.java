package com.dn.league.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dn.league.dao.SqlBean;
import com.dn.league.leaguebean.LeagueBean;

/**
 * Servlet implementation class QueryLeagueServlet
 */
@WebServlet("/QueryLeagueServlet")
public class QueryLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryLeagueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    String lid = request.getParameter("id");
	    
	    int id = Integer.parseInt(lid);
	    
	    
	    String sql = "select * from league where lid = ?";
	    
	    SqlBean sBean = new SqlBean();
	    LeagueBean lBean = sBean.query_1(sql, id);
	    
	    request.setAttribute("lBean", lBean);
	    
	    request.getRequestDispatcher("querysuccess.jsp").forward(request,response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
