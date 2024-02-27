package com.example.tcp_ip_test_client;

import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void client() throws IOException, InterruptedException {
//        String hostname = "127.0.0.1"; // Replace with server hostname or IP
        String hostname = "nlb-6300-db6a98ba3869d41f.elb.ap-northeast-2.amazonaws.com";
        int portNumber = 6300; // Replace with server port number

        // Create socket
        Socket clientSocket = new Socket(hostname, portNumber);

        System.out.println("6300 서버랑 연결 됐다 ~~: " + hostname + ":" + portNumber);

        // Create input and output streams
        InputStream inputStream = clientSocket.getInputStream();
        OutputStream outputStream = clientSocket.getOutputStream();

        // Send message to server
        String message = "야 나 6300 클라이언트인데 연결 됐어 ~~";
        String messageForOutPutStream = "다른 포트로도 아웃풋 보내본다.";
        outputStream.write(message.getBytes());

        RepeatString.alive();

        // Receive response from server
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        String response = new String(buffer, 0, bytesRead);

        System.out.println("서버랑 6300 연결 끊겼다... 안녕 ~~: " + response);

        // Close streams and socket
        outputStream.close();
        inputStream.close();
        clientSocket.close();
    }
}
