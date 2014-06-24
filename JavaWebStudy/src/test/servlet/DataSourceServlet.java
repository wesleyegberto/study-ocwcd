package test.servlet;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "DataSourceServlet", urlPatterns = { "/data_source" })
public class DataSourceServlet extends HttpServlet {
	private static final long serialVersionUID = -5104071471777706364L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter pw = null;
		Connection conn = null;
		try {
			pw = response.getWriter();
			
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/DbPerson");
			
			conn = ds.getConnection();
			pw.write("Getting connection: " + conn);
			try {
				conn.close();
			} catch(SQLException e1) {
			}
			conn = null; // to avoid close conn twice
			
			conn = ds.getConnection();
			pw.write("\nGetting another connection: " + conn);
			try {
				conn.close();
			} catch(SQLException e1) {
			}
			conn = null; // to avoid close conn twice
		} catch(Exception e) {
			e.printStackTrace();
			if(pw != null) {
				pw.write("Error: " + e.getMessage());
			}
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e1) {
				}
			}
		} finally {
			if(pw != null)
				pw.close();
		}

	}
}
