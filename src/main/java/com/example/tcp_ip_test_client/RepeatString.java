package com.example.tcp_ip_test_client;

public class RepeatString {
    public static void alive() throws InterruptedException {
        new Thread(() -> {
            while (true) {
                System.out.println("서버랑 커넥션 연결 됐고, 2초에 한번씩 메시지 전송한다.");
                try {
                    Thread.sleep(2000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}