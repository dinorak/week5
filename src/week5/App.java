package week5;

public class App {
	public static void main(String[] args) {
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Karim"); 
        spacedLogger.error("Karim");
        
        Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.log("Karim"); 
        
        asteriskLogger.error("Karim");
        
    
	}
}
