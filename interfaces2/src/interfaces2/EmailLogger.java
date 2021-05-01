package interfaces2;

public class EmailLogger implements Logger{

	@Override
	public void Log(String message) {
	    System.out.println("Email loglandý "+message);		
		
	}

}
