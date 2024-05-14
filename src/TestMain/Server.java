/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Tạo sever socket và lắng nghe
        try {
            int port=99;
        ServerSocket serverSocket = new ServerSocket(port);
        
        //Chấp nhận kết nối từ client
 //      Socket clientSocket = serverSocket.accept();
        
        //Bắt đầu trao đổi thông tin
        Thread.sleep(500); //milis
        
        //Ngắt kết nối
//        serverSocket.close();
//        clientSocket.close();

             //đọc dữ liệu từ socket
//            BufferedReader reader = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            
            //ghi dữ liệu lên socket
//            PrintWriter writer = new PrintWriter(serverSocket.getOutputStream());
            
            
            
            
            //chat quài luôn
            while(true){
               //Chấp nhận kết nối từ client
                Socket clientSocket = serverSocket.accept();
                Process mp = new Process(clientSocket);
                mp.start();
                }
               
 //           }
        
        } catch (Exception e) {
        }
        
    }
    
}
