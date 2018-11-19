package ejb;

import java.util.ArrayList;

import javax.ejb.Local;

import dto.FrequenzaDTO;

@Local
public interface Frequenza_ejbLocal {

	public ArrayList<FrequenzaDTO> mostraFrequenza();

	public FrequenzaDTO cercaIdfrequenza(int idfrequenza);

	public boolean inserisciFrequenza(int idfrequenza, int idedizione, int idimp);

	public boolean aggiornaFrequenza(int idfrequenza, int idedizione, int idimp);

	public boolean cancellaFrequenza(int idfrequenza);

}
