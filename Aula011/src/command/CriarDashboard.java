package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import model.Pais;
import service.PaisService;

public class CriarDashboard implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PaisService cs = new PaisService();
		
		RequestDispatcher view = null;

		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises = cs.dashboard();
		String chart = formatarDashboard(paises);
		request.setAttribute("chart", chart);
		view = request.getRequestDispatcher("Dashboard.jsp");

		view.forward(request, response);

	}
	public String formatarDashboard(ArrayList<Pais> paises) {
		String dashboard = "[[ 'Pais', 'Populacao'],";
		for (Pais pais : paises) {
			//['Uruguai', 55]
			dashboard += "['" + pais.getNome() + "' ," + pais.getPopulacao() + "],";
			System.out.println(pais.getNome());
		}
		dashboard = dashboard.substring(0,dashboard.length()-1);
		dashboard += " ]";
		return dashboard;
		//criar um metodo que retorne a seguinte string 

		
	}
	
	                                               
}