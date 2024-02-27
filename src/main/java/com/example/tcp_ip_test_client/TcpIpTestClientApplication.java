package com.example.tcp_ip_test_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.Socket;

@SpringBootApplication
public class TcpIpTestClientApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(TcpIpTestClientApplication.class, args);
		SimpleClient.client();
//		SimpleClientForAnother.clientForAnother();
	}

}
