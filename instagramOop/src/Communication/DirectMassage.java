package Communication;

public class DirectMassage {
	private String message;
	private String call;
	private String likeMessage;
	
	public DirectMassage() {
		super();
	}
	
	public DirectMassage(String message, String call, String likeMessage) {
		super();
		this.message = message;
		this.call = call;
		this.likeMessage = likeMessage;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getLikeMessage() {
		return likeMessage;
	}
	public void setLikeMessage(String likeMessage) {
		this.likeMessage = likeMessage;
	}
	
	
	
}
