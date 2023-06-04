package week5;

public class SpacedLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		   String spacedMsg = message.replaceAll("", " ").trim();
	        System.out.println(spacedMsg);
	    }
	

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		String spacedMsg = message.replaceAll("", " ").trim();
        System.out.println("ERROR: " + spacedMsg);
    
        
	}

}
