package chat;

public class Talker02 {
    public static void main(String[] args) {
        new Thread(new TalkSend(4444,"localhost",3333)).start();
        new Thread(new TalkReceive(2222,"Talker2")).start();
    }
}
