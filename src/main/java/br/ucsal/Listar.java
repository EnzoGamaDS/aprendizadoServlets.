package br.ucsal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/Listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Listar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Controller banco = new Controller();
		List<Model> lista = banco.getEmpresas();
		PrintWriter out = response.getWriter();

		
		request.setAttribute("modelo", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/print.jsp");
		rd.forward(request, response);
	}

}
