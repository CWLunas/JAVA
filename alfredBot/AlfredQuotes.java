package alfredBot;  

import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Welcome to Wayne Mannor!";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Today's date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. I am the electrodynamo AI!";
        } else if (conversation.contains("Alfred")) {
            return "At your service. How can I assist you today?";
        } else {
            return "I'm sorry, does not compute, ERROR.";
        }
    }
    
    // Overloaded guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". Welcome to Wayne Mannor!";
    }
    
    // Custom AlfredQuote method
    public String AlfredQuote(String quote) {
        return "Alfred says: \"" + quote + "\"";
    }

    public static void main(String[] args) {
        // Example usage
        AlfredQuotes alfred = new AlfredQuotes();
        System.out.println(alfred.basicGreeting());
        System.out.println(alfred.guestGreeting("John"));
        System.out.println(alfred.dateAnnouncement());
        System.out.println(alfred.respondBeforeAlexis("Hey Alfred, can you bring me a cup of coffee?"));
        System.out.println(alfred.guestGreeting("Emily", "evening"));
        System.out.println(alfred.AlfredQuote("I am Batman."));
    }
}

