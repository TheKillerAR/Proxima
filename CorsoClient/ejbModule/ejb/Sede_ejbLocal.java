package ejb;

import java.util.ArrayList;

import javax.ejb.Local;

import dto.SedeDTO;

@Local
public interface Sede_ejbLocal {

	public ArrayList<SedeDTO> mostraSede();

	public SedeDTO cercaIdsede(int idsede);

	public boolean aggiornaSede(int idsede, String nomesede, String via, String citta, int cap);

	public boolean inserisciSede(int idsede, String nomesede, String via, String citta, int cap);

	public boolean cancellaSede(int idsede);

}
