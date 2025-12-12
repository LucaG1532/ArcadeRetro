import java.util.Scanner;

public class ArcadeRetroApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		
		while(isRunning) 
		{
			System.out.println("ARCADE RETRO");
			System.out.println("Scegli un'opzione tra le seguenti");
			System.out.println("(1) Aggiungi gioco");
			System.out.println("(2) Visualizza tutti i giochi");
			System.out.println("(3) Cerca gioco");
			System.out.println("(4) Filtro tra i giochi più difficili (Difficoltà >= 4");
			System.out.println("(5) Esci");
			String choose = scanner.nextLine();
			switch(choose) 
			{
				case "1":
				{
					
				}
				case "2":
				{
					
				}
				case "3":
				{
					
				}
				case "4":
				{
					
				}
				case "5":
				{
					isRunning = false; 
					break;
				}
			}
			System.out.println("Opzione non valida");
		}

	}

}
