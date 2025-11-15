import java.util.Scanner;
public class ThisIsNokia{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String homeMenu = """

        1. Phone book
        2. Messages
        3. Chat
        4. Call Register
        5. Tones
        6. Setting
        7. Call divert
        8. Games
        9. Calculator
        10. Reminders
        11. Clock
        12. Profiles
        13. SIM services

        """;

        System.out.println(homeMenu);

        System.out.println("Enter a menu option");
        int home  = input.nextInt();
        

        switch(home){
            case 1:
                System.out.println("PHONE BOOK:");
                String phoneBook = """

                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8.Options
                9.Speed dials
                10. Voice tags

                """;

                System.out.println(phoneBook);

                System.out.println("Select choice:");
                int phoneBookValue = input.nextInt();

                switch(phoneBookValue){
                    case 1:System.out.println("Search");break;
                    case 2:System.out.println("Service Nos.");break;   
                    case 3: System.out.println("Add name");break;   
                    case 4: System.out.println("Erase");break;     
                    case 5:  System.out.println("Assign tone");break;
                    case 6:System.out.println("Edit");break;
                    case 7:System.out.println("Send b'card");break;
                    case 8: System.out.println("Options");break;
                    case 9:System.out.println("Speed dials");break;  
                    case 10: System.out.println("Voice tags"); break;
                }break;

           case 8: 
                String options = """
                1. Type of view
                2. Memory status
                """;

                System.out.println(options);

                System.out.println("Select choice:");
                int optionValue = input.nextInt();

                switch(optionValue){
                    case 1:System.out.println("Type of view");break;
                    case 2:System.out.println("Search");break;
                }break;
                
         case 2:
            System.out.println("MESSAGE:");
                String message = """
                1. Write messages
                2. Inbox
                3. Outbox 
                4. Picture messages
                5. Templates
                6. Smiley
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                 
            """;

           System.out.println(message);
            switch(phoneBookValue){
                    case 1:System.out.println("Write message");break;
                    case 2:System.out.println("Inbox");break;   
                    case 3: System.out.println("Outbox");break;   
                    case 4: System.out.println("Picture messages");break;     
                    case 5:  System.out.println("Templates");break;
                    case 6:System.out.println("Smiley");break;
                    case 7:System.out.println("Message settings");break;
                    case 8: System.out.println("Info Service");break;
                    case 9:System.out.println("Voice mailbox number");break;  
                    case 10: System.out.println("Service command editor"); break;

                    }break;
                    case 7:
                        String messageSettings = """
                       1. Set 1
                       2. Common
                       """;
                     System.out.println(messageSettings);

                    System.out.println("Select choice:");
                int messageSettingValue = input.nextInt();

                switch(messageSettingValue){
                    case 1:System.out.println("Set 1");break;
                    case 2:System.out.println("Common");break;
                }break;
              case 1: 
             String set = """
              1. Message center number
              2. Message sent as
              3. Message Validity

            """;
            
    }
}


