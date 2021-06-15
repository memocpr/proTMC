
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Message myMessage=new Message("memo", "hihi");

        MessagingService s1=new MessagingService();

        s1.add(myMessage);



        System.out.println(s1.getMessages());
    }
}
