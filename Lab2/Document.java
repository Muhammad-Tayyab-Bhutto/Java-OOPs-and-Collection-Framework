class Message {
	String text;

	Message(String text) {
		this.text = text;
	}

	void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "The content of message is " + text;
	}
}

class SMS extends Message {
	int recipientContactNo;

	SMS(String text, int recipientContactNo) {

		super(text);
		this.recipientContactNo = recipientContactNo;

	}

	int getNumber() {
		return recipientContactNo;
	}

	String gettext() {
		return super.toString();
	}

	void setNumber(int recipientContactNo) {
		this.recipientContactNo = recipientContactNo;
	}

	public String toString() {

		return "Recipient Contact number :  " + recipientContactNo + "\n\n" + super.toString();

	}
}

class Email extends Message {
	String sender;
	String reciever;
	String subject;

	Email(String text, String sender, String reciever, String subject) {

		super(text);
		this.sender = sender;
		this.reciever = reciever;
		this.subject = subject;
	}

	String getSender() {
		return sender;
	}

	String getReciever() {
		return reciever;
	}

	String getSubject() {
		return subject;
	}

	String gettext() {
		return super.toString();
	}

	void setSender(String newSenderMsg) {
		this.sender = sender;
	}

	void setReciever(String reciever) {
		this.reciever = reciever;
	}

	void setTitle(String subject) {
		this.subject = subject;
	}

	public String toString() {

		return "Sender is " + sender + "\n\nThe reciever is : " + reciever + "\n\nThe subject of the message is : "
				+ subject + "\n\n" + super.toString();

	}

	static boolean ContainsKeyword(SMS smsObject, String keyword) {
		if (smsObject.toString().indexOf(keyword, 0) >= 0)

			return true;

		else

			return false;
	}

	static boolean ContainsKeyword(Email emailObject, String keyword) {
		if (emailObject.toString().indexOf(keyword, 0) >= 0)

			return true;

		else

			return false;
	}

}

public class Document {
	static void display() {
		String text1 = "cricket is a good sport.";
		String text2 = "The dog is barking across the street.";
		String text3 = "I am playing cricket";
		String text4 = "She is playing football";

		Email email1 = new Email(text1, "Anisha", "Avantika", "Childrens");
		Email email2 = new Email(text2, "Rabia", "Huda", "animals");

		SMS sms1 = new SMS(text3, 333);
		SMS sms2 = new SMS(text4, 339);

		System.out.println("\n===========================================================\n");
		System.out.println(email1.toString());
		System.out.println("\n===========================================================\n");
		System.out.println(email2.toString());
		System.out.println("\n===========================================================\n");
		System.out.println(sms1.toString());
		System.out.println("\n===========================================================\n");
		System.out.println(sms2.toString());
		System.out.println("\n===========================================================\n");

		String testWord = "cricket";

		if (Email.ContainsKeyword(sms1, testWord))

		{
			System.out.println("\nMessage 1 contains the word " + testWord);
		} else
			System.out.println("\nMessage 1 does not contain " + "the word " + testWord);

		if (Email.ContainsKeyword(sms2, testWord))

			System.out.println("\nMessage 2 contains the word " + testWord);
		else
			System.out.println("\nMessage 2 does not contain" + " the word " + testWord);

		if (Email.ContainsKeyword(email1, testWord))

			System.out.println("\nEmail 1 contains the word " + testWord);
		else
			System.out.println("\nEmail 1 does not contain " + "the word " + testWord);

		if (Email.ContainsKeyword(email2, testWord))

			System.out.println("\nEmail 2 contains the word " + testWord);
		else {
			System.out.println("\nEmail 2 does not contain" + " the word " + testWord);
		}
	}

	static void encodeMessage(String text) {
		String encode = "";

		for (int i = 0; i < text.length(); i++) {
			char z = text.charAt(i);
			if (z >= (int) 'A' && z <= (int) 'Z') {
				if (z == 'Z') {
					encode += 'A';
					continue;
				}
				encode += (char) ((int) z + 1);
				
			} else if (z >= (int) 'a' && z <= (int) 'z') {
				if (z == 'Z') {
					encode += 'A';
					continue;
				}

				encode += (char) ((int) z + 1);
				;
			}
		}

		System.out.println(encode);
	}

	public static void main(String args[])

	{

		display();
		System.out.println("This is the final message \n\n");
		encodeMessage("This is java");

		// System.out.println("\n\nThe encode string is : " + encodeMessage("This is java"));

	}
}