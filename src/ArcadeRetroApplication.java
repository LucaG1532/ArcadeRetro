import java.util.Scanner;

import service.GameService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		// creazione oggetto scanner, gameservice e dichiarazionie variabile booleana
		Scanner scanner = new Scanner(System.in);
		GameService gameService = new GameService();
		boolean isRunning = true;
		
		// ciclo infinito
		while(isRunning) 
		{
			//println vari ed eventuali
			System.out.println("ARCADE RETRO");
			System.out.println("Scegli un'opzione tra le seguenti");
			System.out.println("(1) Aggiungi gioco");
			System.out.println("(2) Visualizza tutti i giochi");
			System.out.println("(3) Cerca gioco");
			System.out.println("(4) Filtro tra i giochi più difficili (Difficoltà >= 4");
			System.out.println("(5) Esci");
			System.out.print("Inserire qui: ");
			// creazione variabile choose per scegliere che cosa l'utente vuole fare
			String choose = scanner.nextLine();
			// costrutto per determinare le scelte
			switch(choose) 
			{
			//caso 1 aggiungere gioco
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
			    while (difficultLevel > 5 || difficultLevel < 1) { 
                    System.out.println("Errore! Inserisci un numero tra 1 e 5.");
                    System.out.println("Reinserisci la difficoltà: ");
                    difficultLevel = scanner.nextInt();
                    scanner.nextLine(); 
                }
			    gameService.insertGame(name, data, difficultLevel);
			    break;
				}
				// caso 2 stampa lista giochi
				case "2":
				{
					gameService.printGameList();
					break;
				}
				// caso 3 ricerca dei giochi
				case "3":
				{
					System.out.println("Inserisci il gioco da cercare: ");
					String search = scanner.nextLine();
					gameService.searchGame(search);
					break;
				}
				// filtro giochi di difficoltà difficile
				case "4":
				{
					gameService.printFromDifficulty();
					break;
				}
				//caso 5, mi fa uscire dal ciclo
				case "5":
				{
					isRunning = false; 
					break;
				}
				//tutti gli altri casi diversi da quelli precedenti
				default: 
				{
					System.out.println("errore! reinserire il numero.");
					break;
				}
			}
			
		}
		//terminazione ed uccisione del programma
		System.out.println("Programma Terminato");
		scanner.close();
		System.exit(0);
	}

}
