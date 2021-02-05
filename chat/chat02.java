package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接受
public class chat02 {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket=new DatagramSocket(1234);
        while(true) {

            byte[] container=new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet);
            byte[] data=packet.getData();
            String receiveData= new String(data,0,data.length);
            System.out.println(receiveData);
            if (receiveData.equals("拜拜")){
                break;
            }

        }
        socket.close();
    }
}
