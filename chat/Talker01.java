package chat;

public class Talker01 {
    public static void main(String[] args) {
        new Thread(new TalkSend(1111,"localhost",2222)).start();
        new Thread(new TalkReceive(3333,"Talker1")).start();
    }
}
