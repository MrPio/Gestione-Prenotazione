package sistema_prenotazione;

import java.util.Date;

public class Prenotazione {
	Date inizio_prenotazione=new Date();
	Date fine_prenotazione=new Date();
	String nome_prenotazione;
	
	public Prenotazione(Date inizio_prenotazione,Date fine_prenotazione,String nome_prenotazione) {
		this.inizio_prenotazione=inizio_prenotazione;
		this.fine_prenotazione=fine_prenotazione;
		this.nome_prenotazione=nome_prenotazione;
	}
	
	public String toString() {
		return "nome: "+nome_prenotazione+System.lineSeparator()+
				"inizio:"+inizio_prenotazione.toLocaleString()+System.lineSeparator()+
				"fine:"+fine_prenotazione.toLocaleString()+System.lineSeparator();
	}
	
}
