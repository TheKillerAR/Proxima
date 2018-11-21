package ejb;

import dto.CorsoDTO;

import javax.ejb.Local;

@Local
public interface Corso_ejbLocal {
	
	public boolean insertCorsojpa(CorsoDTO cdto);
	
	public boolean updateCorsojpa(CorsoDTO cdto);
	
	public CorsoDTO cercaId(int idcorso);
	
}
