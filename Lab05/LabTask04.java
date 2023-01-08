class Message {
    private String text;
    void setText(String text) {
        this.text = text;
    }   
    String tostring(){
        return text;
    }
}

class SMS extends Message {
    private long reciepentContactNumber;
    void setReciepentContactNumber(String text,long reciepentContactNumber) {
        super.setText(text);
        this.reciepentContactNumber = reciepentContactNumber;
    }
    String tostring(){
        String concatString = reciepentContactNumber + " " + super.tostring();
        return concatString;
    }
}

class Email extends Message {
    private String sender;
    private String reciver;
    private String subject;
    void setData(String sender, String reciver, String subject, String text) {
        super.setText(text);
        this.sender = sender;
        this.reciver = reciver;
        this.subject = subject;
    }
    String tostring(){
        String concatString = email + " " + reciver + " " + subject + " " + super.tostring();
        return concatString;
    }
}
public class LabTask04 {
    // containsKeywordmethod 
    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword, 0) >= 0) return true;

        return false;
    }

    // encode method converts each character in a string to its successive character    
    public static void encode(Message messageObject)  {
        String msg = messageObject.text;
        String encoded = "";

        for (char c: msg.toCharArray()) {
            if (!(c == ' '))
                encoded += Character.toString((char)(((c - 'a' + 1) % 26) + 'a'));
        }
        System.out.println(encoded);
    }
    public static void main(String[] args) {
        // sample email object 
        Email email = new Email("Me", "you", "Question", "Answered");
        // sample SMS object 
        SMS sms = new SMS("Hey", 909099909);

        // testing containsKeyword method 
        System.out.println("Testing ConatinsKeyword method..\n");
        System.out.println(ContainsKeyword(email, "Me"));
        System.out.println(ContainsKeyword(sms, "Hai"));

        // testing encode method. 
        System.out.println("Testing encode method");

        encode(new Message("This is Java"));    
    }
}
