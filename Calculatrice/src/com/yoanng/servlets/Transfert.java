package com.yoanng.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Transfert
 */
@WebServlet("/Transfert")
public class Transfert extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *  
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calc.jsp").forward(request,response);
		
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String premier = request.getParameter("first");
		if (premier.isEmpty()||premier==null)//Si case vide definir la valeur à zero
			{
				premier="0";
			}
	
		 String deuxieme = request.getParameter("second");
		 if (deuxieme.isEmpty()||deuxieme==null)//idem premier if
				{
					deuxieme="0";
				}
			
			
		String operande=request.getParameter("operande");
		float resultat=0;
		float prem=Float.parseFloat(premier);//Conversion de type String vers float pour les calculs
		float deux=Float.parseFloat(deuxieme);//idem
		
		switch(operande)
		{
			case"addition":
				resultat=prem+deux;
				break;
			case"soustraction":
				resultat=prem-deux;
				break;
			case"multiplication":
				resultat=prem*deux;
				break;
			case"division":
				resultat=prem/deux;
				break;
			default:
				resultat=0;
				break;
		}
		String envoi=Float.toString(resultat);//Conversion de Float vers String avant l'envoi
		request.setAttribute("essai",envoi);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calc.jsp").forward(request,response);
		
		
	}
}
		
		
		
		 
		
		
		
	


