/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package springBackEnd.dto;

// Message Responses
public class MessageResponse {

	// Attributes
	private String message;

	// Constructor
	public MessageResponse(String message) {
		this.message = message;
	}

	// Getter
	public String getMessage() {
		return message;
	}

	// Setter
	public void setMessage(String message) {
		this.message = message;
	}
}
