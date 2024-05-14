/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestMain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Process extends Thread{
    private Socket socket;

    public Process(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //Xử lí sau
            Thread.sleep(500);
            
            //đọc dữ liệu từ socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //ghi dữ liệu lên socket
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            
            
            
            Scanner sc =new Scanner(System.in);
            //chat quài luôn
            while(true){
                //nhận tin nhắn
                String message;
                message=reader.readLine();
                System.out.println("Client: "+ message);  
                
                //gửi tin nhắn
                System.out.println("Server: ");
                message = sc.nextLine();
                writer.println(message);
                writer.flush();
            }
        } catch (Exception e) {
        }
        
    }
    
    
    
    
    
}
