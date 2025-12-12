import java.util.Scanner;

import service.GameService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GameService gameService = new GameService();
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
			    System.out.println("Inserisci il nome del gioco");
			    String name = scanner.nextLine(); 
			    System.out.println("Inserisci l'anno di uscita");
			    int data = scanner.nextInt();
			    scanner.nextLine(); 
			    System.out.println("Inserisci il livello di difficoltà");
			    int difficultLevel = scanner.nextInt();
			    scanner.nextLine(); 
			    if(difficultLevel > 5)
			    {
			        System.out.println("A merda schifosa, reinserisci la difficoltà, MASSIMO 5");
			        difficultLevel = scanner.nextInt();
			        scanner.nextLine(); 
			    }
			    gameService.insertGame(name, data, difficultLevel);
			    break;
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
