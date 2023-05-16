
import java.util.Scanner;
public class TestStudente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Studente studente1= new Studente(null, 0);

		System.out.println("Inserisci il nome del primo studente: ");
		String nome1 = input.nextLine();
		studente1.setNome(nome1);

		System.out.println("Inserisci l'anno di nascita del primo studente: ");
		int anno1 = input.nextInt();
		studente1.setAnnoNascita(anno1);
		
		System.out.println(studente1.toString());
		input.nextLine();
			
		System.out.println("Inserisci il nome del secondo studente: ");
		String nome2 = input.nextLine();
		studente1.setNome(nome2);

		System.out.println("Inserisci l'anno di nascita del secondo studente: ");
		int anno2 = input.nextInt();
		studente1.setAnnoNascita(anno2);
		
		Studente studente2= new Studente(nome2, anno2);
		
		input.nextLine();
		System.out.println(studente2.toString());
			
		input.close();
			
			
			
		if (anno1==anno2) {
			System.out.println("Gli studenti sono coetanei");
		}
		else {
			System.out.println("Gli studenti non sono coetanei");
			if (anno1<anno2) {
				System.out.println("E' nato prima "+nome1);
			}
			else {
				System.out.println("E' nato prima "+nome2);
			}
		}
		
	}

}