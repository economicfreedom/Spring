package j12_다형성2;



public class MessengerMiddleware {
	private Messenger messenger;

	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
		
	}
	
	public void sendMessage() {
		messenger.send();
	}
	public void receiveMessage() {
		messenger.receive();
	}
	public void markOff() {
		if (messenger instanceof KakaoTalk) {
			((KakaoTalk) messenger).sendPresent();
		}else {
			((FacebookMessenger)messenger).call();
		}
	}
	
	
	
}
