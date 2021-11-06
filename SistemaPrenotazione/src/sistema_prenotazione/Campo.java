package sistema_prenotazione;
import java.util.Vector;

public class Campo {
	enum tipologia_campo {da_calcio,da_tennis,da_basket,da_pallavolo,da_padle};
	private tipologia_campo tipo_campo;
	static Vector<Prenotazione> lista_prenotazioni=new Vector<Prenotazione>();
	
	public Campo() {
		
	}
	
	public boolean addPrenotazione(Prenotazione p) {
		for(Prenotazione p1:lista_prenotazioni) 
		{
			if(!(
					(p.inizio_prenotazione.before(p1.inizio_prenotazione)||
					p.inizio_prenotazione.after(p1.fine_prenotazione))
					&&
					(p.fine_prenotazione.after(p1.fine_prenotazione) ||
							p.fine_prenotazione.before(p1.inizio_prenotazione))))
			{
				return false;
			}
		}
		lista_prenotazioni.add(p);
		return true;
	}
	public boolean removePrenotazione(String nome_cliente) {
		for(Prenotazione p:lista_prenotazioni) {
			if(p.nome_prenotazione.equals(nome_cliente))
			{
				lista_prenotazioni.removeElement(p);
				return true;
			}
		}
		return false;
	}
}
