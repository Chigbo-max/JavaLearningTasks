import java.util.Scanner;

public class Nokia3310ManualLatestVersion{

	public static void main(String... args){
			displayMainMenu();
			}

			public static void displayMainMenu(){
			
			String mainMenu = """

			Welcome to your Nokia phone
			
			Select an option
			================
				
			1 ->> Phone book
			2 ->> Messages
			3 ->> Chat
			4 ->> Call Register
			5 ->> Tones
			6 ->> Settings
			7 ->> Call divert
			8 ->> Games
			9 ->> Calculator
			10 >> Reminders
			11 >> Clock
			12 >> Profiles
			13 >> SIM services

			================

			""";
			System.out.println(mainMenu);
	
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int mainMenuOptions = userInput.nextInt();

			switch(mainMenuOptions)
			{
			case 1: displayPhoneBook(); break;
			case 2: displayMessageOptions(); break;
			case 3: System.out.println("Chat"); break;
			case 4: displayCallResgister();break;
			case 5: displayToneOptions(); break;
			case 6: displaySettings(); break;
			case 7: System.out.println("Call divert"); break;
			case 8: System.out.println("Games"); break;
			case 9: System.out.println("Calculator"); break;
			case 10: System.out.println("Reminders"); break;
			case 11: displayClock();break;
			case 12: System.out.println("Profiles"); break;
			case 13: System.out.println("SIM services"); break;
			default: System.out.println("oops,invalid number"); break;
			}
			
			}

			public static void displayPhoneBook(){
			
			String phoneBook = """
			1 ->> Search
			2 ->> Service Nos
			3 ->> Add name
			4 ->> Erase
			5 ->> Edit
			6 ->> Assign tone
			7 ->> Send b1 card
			8 ->> Options
			0 ->> Main menu
			""";

			System.out.println(phoneBook);

			Scanner userInput = new Scanner(System.in);
			System.out.print("Select an option: ");
			int phoneBookOptions = userInput.nextInt();
			
			switch(phoneBookOptions){
		
			case 1: System.out.println("\nSearch");break;
			case 2: System.out.println("Service Nos");break;
                        case 3: System.out.println("Add name");break;
			case 4: System.out.println("Erase");break;
			case 5: System.out.println("Edit");break;
			case 6: System.out.println("Assign tone");break;
			case 7: System.out.println("Send b1 card");break;
			case 8: displayOptions();break;		
			case 0: displayMainMenu();break;				
			default: System.out.println("oops,invalid number"); break;


			}


			}

			public static void displayOptions(){
						
			String phoneBookOptions = """
			1 ->> Type of view
			2 ->> Memory status
			0 ->> Previous menu

			""";
			System.out.println(phoneBookOptions);

			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter a number here: ");
			int  phoneBookList= userInput.nextInt();
						
			switch(phoneBookList)
			{
			case 1: System.out.println("\nType of view");break;
			case 2: System.out.println("Memory status");break;
			case 0: displayPhoneBook();break;					
			default: System.out.println("oops,invalid number"); break;

			}
					
			}	
			
			public static void displayMessageOptions(){

			String messageOptions = """
			1 ->> Write messages
			2 ->> Inbox
			3 ->> Outbox
			4 ->> Picture messages
			5 ->> Templates
			6 ->> Smiley
			7 ->> Message settings
			0 ->> Main menu
			""";
			System.out.print(messageOptions);

			Scanner userInput = new Scanner(System.in);
			System.out.print("\nEnter a number: ");
			int messagesOptions = userInput.nextInt();

			switch(messagesOptions)
			{
			case 1 : System.out.println("Write messages"); break;
			case 2 : System.out.println("Inbox"); break;
			case 3 : System.out.println("Outbox"); break;
			case 4 : System.out.println("Picture messages"); break;
			case 5 : System.out.println("Templates"); break;
			case 6 : System.out.println("Smiley"); break;
			case 7 : displayMessageSettings(); break;
			case 0 : displayMainMenu(); break;
			default: System.out.println("oops,invalid number"); break;


			}
			}


			public static void displayMessageSettings(){ 
						
	
			String messageSettings = """
			1->> Set 1, 2
			2->> Common 3
			3->> Character support
			0->> Previous menu
			""";
			System.out.println(messageSettings);

			Scanner userInput = new Scanner(System.in);
			System.out.println("\nEnter a number: ");
			int messageSetting = userInput.nextInt();

			switch(messageSetting)
			{
			case 1: displaySet12(); break;
			case 2: System.out.println("Common 3"); break;
			case 3: System.out.println("Character support"); break;
			case 0: displayMessageOptions(); break;
			default: System.out.println("oops,invalid number"); break;
			}


			}
				

			public static void displaySet12(){

			String setOneTwo = """
			1->> Message centre number
			2->> Message sent as
			3->> Message validity
			0->> Previous menu
			""";
			System.out.println(setOneTwo);

			Scanner userInput = new Scanner(System.in);
			System.out.println("\nEnter a number");
			int setOneOfTwo = userInput.nextInt();
							
			switch(setOneOfTwo)
			{
			case 1 : System.out.println("Message centre number"); break;
			case 2 : System.out.println("Message sent as"); break;
			case 3 : System.out.println("Message validity"); break;
			case 0 : displayMessageSettings(); break;
			default: System.out.println("oops,invalid number"); break;
			}

			}



			public static void displayCallResgister(){

			String callRegister = """
			1->> Missed calls
			2->> Received calls
			3->> Dialled numbers
			4->> Erase recent call lists
			5->> Show call duration
			6->> Show call cost
			7->> Call cost settings
			8->> Prepaid cost
			0->> Main Menu
			""";
					
			System.out.println(callRegister);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int callRegisterOptions = userInput.nextInt();
					
			switch(callRegisterOptions)
			{
			case 1 : System.out.println("\nMissed calls");break;
			case 2 : System.out.println("Received calls");break;
			case 3 : System.out.println("Dialled numbers");break;
			case 4 : System.out.println("Erase recent call lists");break;
			case 5 : ShowCallDuration();break;
			case 6 : showCallCosts();break;
			case 7 : displayCallCostSettings();break;
			case 8 : System.out.println("Prepaid credit");break;
			case 0 : displayMainMenu();break;
			default: System.out.println("oops,invalid number"); break;

			}

			}

			public static void ShowCallDuration(){

						 
			String callDuration = """
			1->> Last call duration
			2->> All calls' duration
			3->> Received calls' duration
			4->> Dialled calls' duration	
			5->> Clear timers
			0->> Previous menu	
			""";

			System.out.println(callDuration);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int callDurationDisplay = userInput.nextInt();
						
			switch(callDurationDisplay)
			{
			case 1: System.out.println("Last call duration"); break;
			case 2: System.out.println("All calls' duration"); break;
			case 3: System.out.println("Received calls' duration"); break;
			case 4: System.out.println("Dialled calls' duration"); break;
			case 5: System.out.println("Clear Timers"); break;
			case 0: displayCallResgister(); break;
			default: System.out.println("oops, invalid number"); break;
			}

			}

			public static void showCallCosts(){
							

			String callCost = """
			1->> Last call cost
			2->> All calls' cost
			3->> Clear counters
			0->> Previous menu	

			""";

			System.out.println(callCost);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int callCosts = userInput.nextInt();

			switch(callCosts)
			{
			case 1: System.out.println("Last call cost"); break;
			case 2: System.out.println("All calls' cost"); break;
			case 3: System.out.println("Clear counters"); break;
			case 0: displayCallResgister(); break;
			default: System.out.println("oops, invalid number"); break;
			}

			}

			public static void displayCallCostSettings(){
							
			String callCostSettings = """
			1->> Call cost limit
			2->> Show costs in
			0->> Previous menu	
			""";

			System.out.println(callCostSettings);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int callCostSettingsDisplay = userInput.nextInt();

			switch(callCostSettingsDisplay)
			{
			case 1: System.out.println("Call cost limit"); break;
			case 2: System.out.println("Show costs in"); break;
			case 0: displayCallResgister(); break;
			default: System.out.println("oops, invalid number"); break;
			}
			}



			public static void displayToneOptions(){ 
	
						
			String tones = """
			1->> Ringing Tone
			2->> Ringing volume
			3->> Incoming call alert
			4->> Composer
			5->> Message alert tone
			6->> Keypad tones
			7->> Warning game tones
			8->> Vibrating alert
			9->> Screen saver
			0->> Main menu
				""";
			System.out.println(tones);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int tonesOptions = userInput.nextInt();

			switch(tonesOptions)
			{
			case 1: System.out.println("Ringing Tone"); break;
			case 2: System.out.println("Ringing volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert tone"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning game tones"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;
			case 0: displayMainMenu(); break;
			default: System.out.println("oops, invalid number"); break;
			}
			
			}
			
			public static void displaySettings(){
			
			String settings = """
			1->> Call settings
			2->> Phone settings
			3->> Security settings
			4->> Restore factory settings
			0->> Main menu
						
			""";
			System.out.println(settings);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int settingsDisplay = userInput.nextInt();

			switch(settingsDisplay)
			{
			case 1: displayCallSettings();break;
			case 2: displayPhoneSettings();break;
			case 3: displaySecuritySettings();break;
			case 4: System.out.println("Restore factory settings"); break;
			case 0: displayMainMenu(); break;
			default: System.out.println("oops, invalid number"); break;

			}

			}
			
			public static void displayCallSettings(){
							
							
			String callSettings = """
							
			1->> Automatic redial
			2->> Speed dial
			3->> Call waiting options
			4->> Own number sending
			5->> Phone line in use
			6->> Automatic answer
			0->> Previous menu
				""";
							
			System.out.println(callSettings);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int callSettingsDisplay = userInput.nextInt();
							
			switch(callSettingsDisplay)
			{
			case 1 : System.out.println("Automatic redial"); break;
			case 2 : System.out.println("Speed dial"); break;
			case 3 : System.out.println("Call waiting options"); break;
			case 4 : System.out.println("Own number sending"); break;
			case 5 : System.out.println("Phone line in use"); break;
			case 6 : System.out.println("Automatic answer");break;
			case 0 : displaySettings(); break;
			default: System.out.println("oops, invalid number"); break;
			}
			
			}


			public static void displayPhoneSettings(){

			String phoneSettings = """		
			1->> Language
			2->> Cell into display
			3->> Welcome note
			4->> Network selection
			5->> Lights
			6->> Confirm SIM service actions
			0->> Previous menu

			""";
			System.out.println(phoneSettings);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int phoneSettingsDisplay = userInput.nextInt();
							
			switch(phoneSettingsDisplay)
			{
			case 1 : System.out.println("Language"); break;
			case 2 : System.out.println("Cell into display"); break;
			case 3 : System.out.println("Welcome note"); break;
			case 4 : System.out.println("Network selection"); break;
			case 5 : System.out.println("Lights"); break;
			case 6 : System.out.println("Confirm SIM service actions"); break;
			case 0 : displaySettings(); break;
			default: System.out.println("oops, invalid number"); break;
			}

			}


			public static void displaySecuritySettings(){
							

			String securitySettings = """
							
			1->> PIN code request
			2->> Call baring service
			3->> Fixed calling
			4->> Closed user group
			5->> Phone security
			6->> Change access codes
			0->> Previous menu

				""";

			System.out.println(securitySettings);
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int securitySettings1 =userInput.nextInt();

			switch(securitySettings1)
			{
			case 1 : System.out.println("PIN code request"); break;
			case 2 : System.out.println("Call baring service"); break;
			case 3 : System.out.println("Fixed calling");break;
			case 4 : System.out.println("Closed user group"); break;
			case 5 : System.out.println("Phone security"); break;
			case 6 : System.out.println("Change access codes"); break;
			case 0 : displaySettings(); break;
			default: System.out.println("oops, invalid number"); break;

			}

			}

			
			public static void displayClock(){;
				

			String clock = """
			1 ->> Alarm clock
			2 ->> Clock settings
			3 ->> Date settings
			4 ->> StopWatch
			5 ->> Countdown timer
			6 ->> Auto update of date and time
			0 ->> Main menu

				""";

			System.out.println(clock);

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int clockOptions = userInput.nextInt();
		
			switch(clockOptions)
			{
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date settings"); break;
			case 4: System.out.println("StopWatch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			case 0: displayMainMenu();break;					
			default: System.out.println("oops, invalid number"); break;
			}

			}		

}


