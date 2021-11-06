package sistema_prenotazione;

import java.util.Date;
import java.util.Scanner;



public class Sistema
{
	static Campo cmp= new Campo();
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		while(true) {
			boolean risposta = false;
			System.out.println("Benvenuto, vuoi (e)ffettuare o (r)imuovere una prenotazione?");
			String scelta = input.nextLine();
			if(scelta.equals("e")) {
			
				System.out.println("Nome:");
				String nome_cliente = input.nextLine();
				System.out.println("Giorno(gg/mm/aaaa)");
				String data = input.nextLine();
				System.out.println("Orario di inizio(ore:minuti)");
				String ora_inizio = input.nextLine();
				System.out.println("Orario di fine(ore:minuti)");
				String ora_fine = input.nextLine();
				
				Prenotazione p = new Prenotazione(new Date(Date.parse(data+" "+ora_inizio)),
						new Date(Date.parse(data+" "+ora_fine)),
						nome_cliente);
				
				if(cmp.addPrenotazione(p)) {
					System.out.print("ok");
				}
				else System.out.print("no");
			}
			else if(scelta.equals("r")) {
				System.out.println("Nome:");
				System.out.println(cmp.removePrenotazione(input.nextLine()));
			}

			System.out.println();
			for(Prenotazione p1:Campo.lista_prenotazioni)
				System.out.print(p1);
		}
	}
}