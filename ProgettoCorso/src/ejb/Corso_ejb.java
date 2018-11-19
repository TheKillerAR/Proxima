package ejb;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Util.ConvCorso;
import dto.CorsoDTO;
import model.Corso;
import dao.CorsoDAO;

@Stateless
@LocalBean
public class Corso_ejb implements Corso_ejbRemote, Corso_ejbLocal {
	
	@PersistenceContext(unitName= "Hib4PU")
	private EntityManager em;

	public Corso_ejb() {
	}
	
	public boolean insertCorsojpa(CorsoDTO cdto){
		CorsoDAO cd = new CorsoDAO(em);
		modeljpa.Corso cjpa = new modeljpa.Corso();
		cjpa.setIdcorso(cdto.getIdcorso());
		cjpa.setDescrizione(cdto.getDescrizione());
		cd.insertCorsojpa(cjpa);
		return true;
	}
	
	public boolean updateCorsojpa(CorsoDTO cdto){
		CorsoDAO cd = new CorsoDAO(em);
		modeljpa.Corso cjpa = new modeljpa.Corso();
		cjpa.setIdcorso(cdto.getIdcorso());
		cjpa.setDescrizione(cdto.getDescrizione());
		cd.updateCorsojpa(cjpa);
		return true;
	}
	
	
	
	
	
	public CorsoDTO cercaId(int idcorso) {
		CorsoDAO cd = new CorsoDAO(em);
		modeljpa.Corso cjpa = new modeljpa.Corso();
		cjpa = cd.cercaId(idcorso);
		CorsoDTO cdto = new CorsoDTO();
		cdto.setIdcorso(cjpa.getIdcorso());
		cdto.setDescrizione(cjpa.getDescrizione());
		return cdto;
		
	}

	
	
	
	
	
	
	public ArrayList<CorsoDTO> mostraCorso() {

		CorsoDAO cd = new CorsoDAO();

		ArrayList<CorsoDTO> cdt = new ArrayList<CorsoDTO>();
		ArrayList<Corso> cr;

		try {

			cr = cd.mostraCorso();
			for (Corso c : cr) {
				CorsoDTO cdto = new CorsoDTO();
				cdto.setIdcorso(c.getIdcorso());
				cdto.setDescrizione(c.getDescrizione());
				cdt.add(cdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return cdt;
	}

	public CorsoDTO cercaIdcorso(int idcorso) {
		CorsoDAO dao = new CorsoDAO();

		try {
			return ConvCorso.convertCorso(dao.cercaIdcorso(idcorso));
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (NamingException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public boolean aggiornaCorso(int idcorso, String descrizione) {
		CorsoDAO dao = new CorsoDAO();

		try {
			dao.aggiornaCorso(idcorso, descrizione);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean inserisciCorso(int idcorso, String descrizione) {

		CorsoDAO c = new CorsoDAO();

		c.inserisciCorso(idcorso, descrizione);

		return true;
	}

	public boolean cancellaCorso(int idcorso) {

		CorsoDAO c = new CorsoDAO();

		c.cancellaCorso(idcorso);

		return true;
	}
}