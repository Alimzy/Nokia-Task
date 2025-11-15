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
              System.out.println("MESSAGES");
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
            int selectMessages = input.nextInt();
            switch(selectMessages){
                    case 1:System.out.println("Write message");break;
                    case 2:System.out.println("Inbox");break;   
                    case 3: System.out.println("Outbox");break;   
                    case 4: System.out.println("Picture messages");break;     
                    case 5:  System.out.println("Templates");break;
                    case 6:System.out.println("Smiley");break;
                    case 7:System.out.println("Message settings");
                             String messageSettings = """
                                       1. Set 1
                                       2. Common
                                       """;
                                    
                             System.out.println(messageSettings);
                             System.out.println("Select choice:");
                             int messageSettingValue = input.nextInt();

                             switch(messageSettingValue){
                                 case 1:System.out.println("Set 1");
                                     String set = """
                                       1. Message centre number
                                       2. Message sent as
                                       3. Message validity
                                       """;
                                    
                                         System.out.println(set);
                                         System.out.println("Select choice:");
                                         int setInput = input.nextInt();

                                  switch(setInput){
                                    case 1:System.out.println("Message centre number");break;
                                    case 2:System.out.println("Message sent as");break;   
                                    case 3: System.out.println("Message Validity");break; 

                                       };

                                    case 2:System.out.println("Common");

                                    String common = """
                                       1. Delivery reports
                                       2. Reply via same centre
                                       3. Character support
                                       """;
                                    
                                         System.out.println(common);
                                         System.out.println("Select choice:");
                                         int commonInput = input.nextInt();

                                  switch(commonInput){
                                    case 1:System.out.println("Delivery reports");break;
                                    case 2:System.out.println("Reply via same centre");break;   
                                    case 3: System.out.println("Character support");break;  
                          
                                }break;
                                 
                        
                    case 8: System.out.println("Info Service");break;
                    case 9:System.out.println("Voice mailbox number");break;  
                    case 10: System.out.println("Service command editor"); break;
                    }break;

                      } 
        case 3:
            System.out.println("CHAT");
        String chat = """
                        chat
                      """; 
        System.out.println("chat");
        int chatInput = input.nextInt();
        
       switch(chatInput){
          case 1:System.out.println("Chat");break;

         };break;

        case 4: 
          System.out.print("CAll REGISTER");
            String callReg = """
           1. Missed calls
           2. Received calls
           3. Dialled numbers
           4. Erase recent call duration
           5. Show call duration
           6. Show call costs
           7. Call cost settings
           8. Prepaid credit
      
            """;

       System.out.println(callReg);
       int callRegister = input.nextInt();
      switch(callRegister){
                    case 1:System.out.println("Missed calls");break;
                    case 2:System.out.println("Received calls");break;   
                    case 3: System.out.println("Dialled numbers");break;   
                    case 4: System.out.println("Erase recent call duration");break;     
                    case 5:  System.out.println("Show call duration");
                             String callDuration = """
                                       1. Last call duration
                                       2. All calls' duration
                                       3. Received calls' duration
                                       4. Dialled calls' duration
                                       5. Clear timers
                                       """;
                            System.out.println(callDuration);
                            int call = input.nextInt();
                             switch(call){
                                    case 1:System.out.println("Last call duration");break;
                                    case 2:System.out.println("All calls' duration");break;
                                    case 3: System.out.println("Received calls' duration");break;
                                    case 4:System.out.println("Dialled calls' duration");break;
                                    case 5: System.out.println("Clear timers");break;

                                       };

                                      
                    case 6:System.out.println("SHOW CALL COST");
                                      String showCall = """
                                        1. Last call cost
                                       2. All calls' cost
                                       3. Clear counters
                                       
                                       """;
                            System.out.println(showCall);
                            int callCost = input.nextInt();
                             switch(callCost){
                                    case 1:System.out.println("Last call cost");break;
                                    case 2:System.out.println("All calls' cost");break;
                                    case 3: System.out.println("Clear counters");break;
                                   

                                       };

                    case 7:System.out.println("CALL COST SETTINGS");
                             String callSetting = """
                                        1. Last call cost
                                       2. Show costs in
                                       
                                       """;
                            System.out.println(callSetting);
                            int costInput = input.nextInt();
                             switch(costInput){
                                    case 1:System.out.println("Last call cost");break;
                                    case 2:System.out.println("Show costs in");break;
                                    
                                   

                                       };
                    
                    case 8:System.out.println("Prepaid credit");break;
     
       };

            case 5:
            System.out.println("TONES");
        String tones = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen Savers
                      """; 
        System.out.println("tones");
        int tonesInput = input.nextInt();
        
       
           switch(tonesInput){
                    case 1:System.out.println("Ringint tone");break;
                    case 2:System.out.println("Ringing Volume");break;   
                    case 3: System.out.println("Incoming call alert");break;   
                    case 4: System.out.println("Composer");break;     
                    case 5:  System.out.println("Message alert tone");     
                    case 6:System.out.println("Keypad tones");break;
                    case 7:System.out.println("Warning and game tones");break;   
                    case 8: System.out.println("Vibrating alert");break;   
                    case 9: System.out.println("Screen Savers");break;     
                      
                        


         };break;


          case 6:
            System.out.println("SETTINGS");
        String settings = """
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                       
                      """; 
      System.out.println(settings);
      int settingInput = input.nextInt();
        
       
           switch(settingInput){
                    case 1:System.out.println("CALL SETTINGS");
                         String callSettings = """
                                       1. Automatic Redial
                                       2. Speed dialling
                                       3. Call waiting options
                                       4. Own number sending
                                       5. Phone line in use
                                       6.Automatic answer
                                       """;
                                    
                                         System.out.println(callSettings);
                                         System.out.println("Select choice:");
                                         int callInput = input.nextInt();

                                  switch(callInput){
                                    case 1: System.out.println("Automatic Redial");break;
                                    case 2: System.out.println("Speed dialling");break;   
                                    case 3: System.out.println("call waiting options");break; 
                                    case 4: System.out.println("Own number sending");break;
                                    case 5: System.out.println("Phone line in use");break;   
                                    case 6: System.out.println("Automatic answer");break; 
                                    
                                }break;
                    case 2:System.out.println("PHONE SETTINGS"); 
                        String phoneSettings = """
                                       1. Language
                                       2. Cell info display
                                       3. Welcome note
                                       4. Network selection
                                       5. Light
                                       6. Confirm SIM service actions
                                       """;
                                    
                                         System.out.println(phoneSettings);
                                         System.out.println("Select choice:");
                                         int phoneInput = input.nextInt();

                                  switch(phoneInput){
                                    case 1: System.out.println("Language");break;
                                    case 2: System.out.println("Cell info display");break;   
                                    case 3: System.out.println("Welcome note");break; 
                                    case 4: System.out.println("Network selection");break;
                                    case 5: System.out.println("Light");break;   
                                    case 6: System.out.println("Confirm SIM service action");break; 
                                    
                                }break;  
                    case 3: System.out.println("Security settings"); 
                        String securitySettings = """
                                       1. PIN code request
                                       2. Call barring service
                                       3. Fixed dialling
                                       4. Closed user group
                                       5. Phone security
                                       6. Change access codes
                                       """;
                                    
                                         System.out.println(securitySettings);
                                         System.out.println("Select choice:");
                                         int securityInput = input.nextInt();

                                  switch(securityInput){
                                    case 1: System.out.println("PIN code request");break;
                                    case 2: System.out.println("Call barring service");break;   
                                    case 3: System.out.println("Fixed dialling");break; 
                                    case 4: System.out.println("Closed user group");break;
                                    case 5: System.out.println("Phone security");break;   
                                    case 6: System.out.println("Change access codes");break; 
                                    
                                }break;      
                        
                    case 4: System.out.println("Rstore factory settings");break;     
                                        


         };break;
     
           case 7:
            System.out.println("CALL DIVERTS");
        String divert = """
                        Call divert
                      """; 
        System.out.println("Call divert");
        int divertInput = input.nextInt();
        
       switch(divertInput){
          case 1:System.out.println(divertInput);break;

         };break;



      case 8:
            System.out.println("GAMES");
        String games = """
                        Games
                      """; 
        System.out.println(games);
        int gamesInput = input.nextInt();
        
       switch(gamesInput){

          case 1:System.out.println("Games");break;
         };break;



     case 9:
            System.out.println("CALCULATOR");
        String calculator = """
                        Calculator
                      """; 
        System.out.println(calculator);
        int calculatorInput = input.nextInt();
        
       switch(calculatorInput){
          case 1:System.out.println("Calculator");break;
         };break;

        case 10:
            System.out.println("REMINDERS");
        String reminders = """
                        Reminders
                      """; 
        System.out.println(reminders);
        int remindersInput = input.nextInt();
        
       switch(remindersInput){
          case 1:System.out.println("remindersInput");break;
         };break;

        case 11:
            System.out.println("CLOCK");
        String clock = """
                        1. Alarm Clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        
                      """; 
        System.out.println("clock");
        int clockInput = input.nextInt();
        
       
           switch(clockInput){
                    case 1:System.out.println("Alarm clock");break;
                    case 2:System.out.println("Clock settings");break;   
                    case 3: System.out.println("Date setting");break;   
                    case 4: System.out.println("Stopwatch");break;     
                    case 5:  System.out.println("Countdown timer");     
                    case 6:System.out.println("Auto update of date and time");break;
                  

         };break;

 case 12:
            System.out.println("PROFILES");
        String profiles = """
                        Profiles
                      """; 
        System.out.println(profiles);
        int profilesInput = input.nextInt();
        
       switch(profilesInput){
          case 1:System.out.println("Profiles");break;
         };break;


 case 13:
            System.out.println("SIM SERVICES");
        String sim = """
                        SIM services
                      """; 
        System.out.println(sim);
        int simInput = input.nextInt();
        
       switch(simInput){
          case 1:System.out.println("SIM services");break;
         };break;





}
            
   
}

}
