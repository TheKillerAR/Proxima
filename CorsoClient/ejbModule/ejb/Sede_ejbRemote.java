package ejb;

import java.util.ArrayList;

import javax.ejb.Remote;

import dto.SedeDTO;

@Remote
public interface Sede_ejbRemote {

	public ArrayList<SedeDTO> mostraSede();

	public SedeDTO cercaIdsede(int idsede);

	public boolean aggiornaSede(int idsede, String nomesede, String via, String citta, int cap);

	public boolean inserisciSede(int idsede, String nomesede, String via, String citta, int cap);

	public boolean cancellaSede(int idsede);
}
