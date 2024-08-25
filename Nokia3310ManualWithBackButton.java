import java.util.Scanner;

public class Nokia3310ManualWithBackButton{

	public static void main(String... args){
			Scanner userInput = new Scanner(System.in);
			boolean next = true;
			while(next==true){

		System.out.println("Welcome to your Nokia phone\n\nList of Menu Options\n\nSelect any option\n1 -> Phone book\n2 -> Messages			\n3 -> Chat\n4 -> Call register\n5 -> Tones\n6 -> Settings\n7 -> Call divert\n8 -> Games\n9 -> Calculator					\n10 -> Reminders\n11 -> Clock\n12 -> Profiles\n13 -> SIM services");
	
			

			System.out.print("Enter a number here: ");
			int menuOptions = userInput.nextInt();

				switch(menuOptions)
				{
				case 1: System.out.println("\nPhone book"); 
					
					boolean next1 = true;						
												
					while(next1==true){


					String phoneBookOptions = """
					1 ->> Search
					2 ->> Service Nos
					3 ->> Add name
					4 ->> Erase
					5 ->> Edit
					6 ->> Assign tone
					7 ->> Send b1 card
					8 ->> Options

						""";
					System.out.println(phoneBookOptions);



					System.out.print("Enter a number here: ");
					int assignedPhoneBookOptions = userInput.nextInt();
					

					switch(assignedPhoneBookOptions)
					{
					case 1: System.out.println("\nSearch");break;
					case 2: System.out.println("Service Nos");break;
                                        case 3: System.out.println("Add name");break;
					case 4: System.out.println("Erase");break;
					case 5: System.out.println("Edit");break;
					case 6: System.out.println("Assign tone");break;
					case 7: System.out.println("Send b1 card");break;
					default: System.out.println("sorry, you just entered an invalid number"); break;
					

					case 8: System.out.println("Options");
						boolean next2 = true;
						while(next2==true){

						String phoneBookOptions1 = """
						1 ->> Type of view
						2 ->> Memory status

						""";
						System.out.println(phoneBookOptions1);
						System.out.print("Enter a number here: ");
						int assignedPhoneBookOptions1 = userInput.nextInt();
						
						switch(assignedPhoneBookOptions1)
						{
						case 1: System.out.println("\nType of view");break;
						case 2: System.out.println("Memory status");break;
				                default: System.out.println("sorry, you just entered an invalid number"); break;
									}
							System.out.println("To go back, press 1");
							int searchInput2 = userInput.nextInt();
							if (searchInput2!=1){
							next2 = false;
							System.out.println("sorry, you just entered an invalid number, please try again"); 
									}
					
								}
							}

						System.out.println("To go back, press 1");
						int searchInput1 = userInput.nextInt();
						if (searchInput1!=1){
						next1 = false;
						System.out.println("sorry, you just entered an invalid number, please try again"); 
								
						}
					}
					break;
				case 2: System.out.println("Messages"); 
					boolean next3 = true;
					while(next3==true){


					String messagesOptions = """
					1 ->> Write messages
					2 ->> Inbox
					3 ->> Outbox
					4 ->> Picture messages
					5 ->> Templates
					6 ->> Smiley
					7 ->> Message settings
					""";
					System.out.print(messagesOptions);
					System.out.print("\nEnter a number: ");
					int messagesOptions1 = userInput.nextInt();

					switch(messagesOptions1)
					{
					case 1 : System.out.println("Write messages"); break;
					case 2 : System.out.println("Inbox"); break;
					case 3 : System.out.println("Outbox"); break;
					case 4 : System.out.println("Picture messages"); break;
					case 5 : System.out.println("Templates"); break;
					case 6 : System.out.println("Smiley"); break;
					default : System.out.println("sorry, you just entered an invalid number"); break;

					case 7 : System.out.println("Message settings"); 
						boolean next4 = true;
						while(next4==true){
	
						String messageSettings = """
						1->> Set 1, 2
						2->> Common 3
						3->> Character support
							""";
						System.out.println(messageSettings);
						System.out.println("\nEnter a number: ");
						int messageSettings1 = userInput.nextInt();

						switch(messageSettings1)
						{
						case 1: System.out.println("Set 1, 2");
							String setOne = """
							1->> Message centre number
							2->> Message sent as
							3->> Message validity
							""";
							System.out.println(setOne);
							System.out.println("\nEnter a number");
							int setOneOfTwo = userInput.nextInt();
							
							switch(setOneOfTwo)
							{
							case 1 : System.out.println("Message centre number"); break;
							case 2 : System.out.println("Message sent as"); break;
							case 3 : System.out.println("Message validity"); break;
							default : System.out.println("sorry, you just entered an invalid number"); break;
							}

							
						case 2: System.out.println("Common 3"); break;
						case 3: System.out.println("Character support"); break;
						default: System.out.println("sorry, you just entered an invalid number"); break;
								
							}
						System.out.println("To go back, press 1");
						int searchInput4 = userInput.nextInt();
						if (searchInput4!=1){
						next4 = false;
						System.out.println("sorry, you just entered an invalid number, please try again"); 
									}
								}
							}
				System.out.println("To go back, press 1");
				int searchInput3 = userInput.nextInt();
				if (searchInput3!=1){
				next3 = false;
				System.out.println("sorry, you just entered an invalid number, please try again"); 
							
						}

					}
				break;
				case 3: System.out.println("Chat"); break;
				case 4: System.out.println("Call resgister");

					boolean next5 = true;
					while(next5==true){

					String callRegister = """
					1->> Missed calls
					2->> Received calls
					3->> Dialled numbers
					4->> Erase recent call lists
					5->> Show call duration
					6->> Show call cost
					7->> Call cost settings
					8->> Prepaid cost
						""";
					
					System.out.println(callRegister);
					System.out.println("Enter a number");
					int callRegister1 = userInput.nextInt();
					
					switch(callRegister1)
					{
					case 1 : System.out.println("\nMissed calls");break;
					case 2 : System.out.println("Received calls");break;
					case 3 : System.out.println("Dialled numbers");break;
					case 4 : System.out.println("Erase recent call lists");break;
					case 5 : System.out.println("Show call duration");

						 boolean next6 = true;
					         while(next6==true){
						
						String callDuration = """
						1->> Last call duration
						2->> All calls' duration
						3->> Received calls' duration
						4->> Dialled calls' duration	
						5->> Clear timers	
						""";
						System.out.println(callDuration);
						System.out.println("Enter a number");
						int callDuration1 = userInput.nextInt();
						
						switch(callDuration1)
						{
						case 1: System.out.println("Last call duration"); break;
						case 2: System.out.println("All calls' duration"); break;
						case 3: System.out.println("Received calls' duration"); break;
						case 4: System.out.println("Dialled calls' duration"); break;
						case 5: System.out.println("Clear Timers"); break;
						default : System.out.println("sorry, you just entered an invalid number"); break;
								}
							
						System.out.println("To go back, press 1");
						int searchInput6 = userInput.nextInt();
						if (searchInput6!=1){
						next6 = false;
						System.out.println("sorry, you just entered an invalid number, please try again");
							 	}
							}
						break;
					
					case 6 : System.out.println("Show call costs");
						
						boolean next7 = true;
					        while(next7==true){

						String callCost = """
						1->> Last call cost
						2->> All calls' cost
						3->> Clear counters	
						""";

						System.out.println(callCost);
						System.out.println("Enter a number");
						int callCost1 = userInput.nextInt();

						switch(callCost1)
						{
						case 1: System.out.println("Last call cost"); break;
						case 2: System.out.println("All calls' cost"); break;
						case 3: System.out.println("Clear counters"); break;
						default : System.out.println("sorry, you just entered an invalid number"); break;

						}

						System.out.println("To go back, press 1");
						int searchInput7 = userInput.nextInt();
						if (searchInput7!=1){
						next7 = false;
						System.out.println("sorry, you just entered an invalid number, please try again");
								}
							}
						break;

					case 7 : System.out.println("Call cost settings");
						
						boolean next8 = true;
					        while(next8==true){

						String callCostSettings = """
						1->> Call cost limit
						2->> Show costs in
						""";

						System.out.println(callCostSettings);
						System.out.println("Enter a number");
						int callCostSettings1 = userInput.nextInt();

						switch(callCostSettings1)
						{
						case 1: System.out.println("Call cost limit"); break;
						case 2: System.out.println("Show costs in"); break;
						default: System.out.println("sorry, you just entered an invalid number,"); break;

						}

						System.out.println("To go back, press 1");
						int searchInput8 = userInput.nextInt();
						if (searchInput8!=1){
						next8 = false;
						System.out.println("sorry, you just entered an invalid number, please try again");
							}
						}
						break;


					case 8 : System.out.println("Prepaid credit");break;
					default: System.out.println("sorry, you just entered an invalid number"); break;
							}
						System.out.println("To go back, press 1");
						int searchInput5 = userInput.nextInt();
						if (searchInput5!=1){
						next5 = false;
						System.out.println("sorry, you just entered an invalid number, please try again"); 
						}
					}

				break;
				case 5: System.out.println("Tones"); 

						boolean next8 = true;
					        while(next8==true){
						
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
						""";
						System.out.println(tones);

						System.out.println("Enter a number");
						int tones1 = userInput.nextInt();

						switch(tones1)
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
						default: System.out.println("sorry, you just entered an invalid number"); break;
						}
						
						System.out.println("To go back, press 1");
						int searchInput8 = userInput.nextInt();
						if (searchInput8!=1){
						next8 = false;
						System.out.println("sorry, you just entered an invalid number, please try again");
							}
						}

				break;
				case 6: System.out.println("Settings"); 
						boolean next9 = true;
					        while(next9==true){

						String settings = """
						1->> Call settings
						2->> Phone settings
						3->> Security settings
						4->> Restore factory settings
						
						""";
						System.out.println(settings);

						System.out.println("Enter a number");
						int settings1 = userInput.nextInt();

						switch(settings1)
						{
						case 1: System.out.println("Call settings");
							boolean next10 = true;
					        	while(next10==true){
							
							String callSettings = """
							
							1->> Automatic redial
							2->> Speed dial
							3->> Call waiting options
							4->> Own number sending
							5->> Phone line in use
							6->> Automatic answer
							""";
							
							System.out.println(callSettings);
							System.out.println("Enter a number: ");
							int callSettings1 = userInput.nextInt();
							
							switch(callSettings1)
							{
							case 1 : System.out.println("Automatic redial"); break;
							case 2 : System.out.println("Speed dial"); break;
							case 3 : System.out.println("Call waiting options"); break;
							case 4 : System.out.println("Own number sending"); break;
							case 5 : System.out.println("Phone line in use"); break;
							case 6 : System.out.println("Automatic answer");break;
							default : System.out.println("sorry, you just entered an invalid number"); break;
								}

							System.out.println("To go back, press 1");
							int searchInput10 = userInput.nextInt();
							if (searchInput10!=1){
							next10 = false;
							System.out.println("sorry, you just entered an invalid number, please try again");
								}
							}
						      break;
						case 2: System.out.println("Phone settings");

							boolean next11 = true;
					        	while(next11==true){ 

							String phoneSettings = """
							
							1->> Language
							2->> Cell into display
							3->> Welcome note
							4->> Network selection
							5->> Lights
							6->> Confirm SIM service actions
							""";
							System.out.println(phoneSettings);
							System.out.println("Enter a number");
							int phoneSettings1 = userInput.nextInt();
							
							switch(phoneSettings1)
							{
							case 1 : System.out.println("Language"); break;
							case 2 : System.out.println("Cell into display"); break;
							case 3 : System.out.println("Welcome note"); break;
							case 4 : System.out.println("Network selection"); break;
							case 5 : System.out.println("Lights"); break;
							case 6 : System.out.println("Confirm SIM service actions"); break;

							default : System.out.println("Sorry, you just entered an invalid number"); break;
							}
							System.out.println("To go back, press 1");
							int searchInput11 = userInput.nextInt();
							if (searchInput11!=1){
							next11 = false;
							System.out.println("sorry, you just entered an invalid number, please try again");
								}
							}
						break;
						case 3: System.out.println("Security settings");

							boolean next12 = true;
					        	while(next12==true){

							String securitySettings = """
							
							1->> PIN code request
							2->> Call baring service
							3->> Fixed calling
							4->> Closed user group
							5->> Phone security
							6->> Change access codes
							""";

							System.out.println(securitySettings);
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
							default : System.out.println("Sorry, you just entered an invalid number"); break;
							}

							System.out.println("To go back, press 1");
							int searchInput12 = userInput.nextInt();
							if (searchInput12!=1){
							next12 = false;
							System.out.println("sorry, you just entered an invalid number, please try again");

								}
							}
						break;
						case 4: System.out.println("Restore factory settings"); break;
						
						default: System.out.println("sorry, you just entered an invalid number"); break;
						}

						System.out.println("To go back, press 1");
						int searchInput9 = userInput.nextInt();
						if (searchInput9!=1){
						next9 = false;
						System.out.println("sorry, you just entered an invalid number, please try again");
								}
							}
						break;
	
				case 7: System.out.println("Call divert"); break;
				case 8: System.out.println("Games"); break;
				case 9: System.out.println("Calculator"); break;
				case 10: System.out.println("Reminders"); break;

				case 11: System.out.println("Clock");

					 boolean next13 = true;
					 while(next13 = true){

					 String clock = """
					 1 ->> Alarm clock
					 2 ->> Clock settings
					 3 ->> Date settings
					 4 ->> StopWatch
					 5 ->> Countdown timer
					 6 ->> Auto update of date and time
					 """;

					System.out.println(clock);
					System.out.println("Enter a number: ");
					int clock1 = userInput.nextInt();
					
					switch(clock1){
					
					case 1: System.out.println("Alarm clock"); break;
					case 2: System.out.println("Clock settings"); break;
					case 3: System.out.println("Date settings"); break;
					case 4: System.out.println("StopWatch"); break;
					case 5: System.out.println("Countdown timer"); break;
					case 6: System.out.println("Auto update of date and time"); break;
					default: System.out.println("sorry, you just entered an invalid number"); break;
					}
					System.out.println("To go back, press 1");
					int searchInput13 = userInput.nextInt();
					if(searchInput13!=1){
					next13 = false;
					System.out.println("sorry, you just entered an invalid number, please try again");

						}
					}
				break;
				case 12: System.out.println("Profiles"); break;
				case 13: System.out.println("SIM services"); break;

				default: System.out.println("sorry, you just entered an invalid number"); break;
				}
				
				System.out.println("To go back, press 1");
				int searchInput = userInput.nextInt();
				if (searchInput!=1){
				next = false;
				System.out.println("sorry, you just entered an invalid number, please try again"); break;

					}
				}

				System.out.println("\nHave fun with this new human technology");




	}




}