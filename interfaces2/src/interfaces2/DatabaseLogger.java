package interfaces2;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String message) {
	    System.out.println("Database loglandý :"+message);		
		
	}

}
