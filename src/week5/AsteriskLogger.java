package week5;

public class AsteriskLogger implements Logger{


	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		String asterisks = "*".repeat(message.length() + 10);
	    System.out.println(asterisks);
	    System.out.println("***Error: " + message + "***");
	    System.out.println(asterisks);
	
	}

}
