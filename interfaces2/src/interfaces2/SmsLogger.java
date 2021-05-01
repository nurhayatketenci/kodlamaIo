package interfaces2;

public class SmsLogger implements Logger {

	@Override
	public void Log(String message) {
    System.out.println("Sms loglandý "+message);		
	}

}
