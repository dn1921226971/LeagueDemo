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
 * Servlet implementation class UpdateLeagueServlet
 */
@WebServlet("/UpdateLeagueServlet")
public class UpdateLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLeagueServlet() {
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
	    String lyear = request.getParameter("year");
	    String season = request.getParameter("season");
	    String title = request.getParameter("title");
	    
	    int id = Integer.parseInt(lid);
	    int year = Integer.parseInt(lyear);
	    LeagueBean lBean = new LeagueBean();
	    lBean.setYear(year);
	    lBean.setSeason(season);
	    lBean.setTitle(title);
	    
	    
	    String sql = "update league set lyear = ?,season = ?,title = ? where lid = ?";
	    SqlBean sBean = new SqlBean();
	    sBean.update(sql, lBean, id);
	    
	    request.getRequestDispatcher("listLeague.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
