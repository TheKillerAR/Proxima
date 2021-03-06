package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.FrequenzaDTO;
import ejb.Frequenza_ejbRemote;

public class FrequenzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName = "java:jboss/exported/ProgettoEARmaven-0.0.1-SNAPSHOT/ProgettoCorso2-0.0.1-SNAPSHOT/Frequenza_ejb!ejb.Frequenza_ejbRemote")
	private Frequenza_ejbRemote freejbr;

	public FrequenzaServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
		
			String idedizione2 = request.getParameter("idedizione");			
			String idimp2 = request.getParameter("idimp");
			
			FrequenzaDTO fdto = new FrequenzaDTO();
			
			int idedizione = Integer.parseInt(request.getParameter("idedizione"));
			int idimp = Integer.parseInt(request.getParameter("idimp"));
			
			fdto.setIdedizione(idedizione);
			fdto.setIdimp(idimp);
			
			freejbr.insertFrequenzajpa(fdto);
			
		}else if (fn.equals("aggiorna")){
			
			String idedizione2 = request.getParameter("idedizione");			
			String idimp2 = request.getParameter("idimp");
			
			FrequenzaDTO fdto = new FrequenzaDTO();
			
			int idedizione = Integer.parseInt(request.getParameter("idedizione"));
			int idimp = Integer.parseInt(request.getParameter("idimp"));
			
			fdto.setIdedizione(idedizione);
			fdto.setIdimp(idimp);
			
			freejbr.updateFrequenzajpa(fdto);
		}else if(fn.equals("cercaid")) {
			
			int idfrequenza = Integer.parseInt(request.getParameter("idfrequenza"));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
