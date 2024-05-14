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
public class Client {
    public static void main(String[] args) {
        try {
            //Kết nối đến server
            int port =99;
            Socket socket =new Socket("localhost", port);
            
              //Xử lí sau
            Thread.sleep(500);
            
            //đọc dữ liệu từ socket
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //ghi dữ liệu lên socket
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            
            
            
            Scanner sc =new Scanner(System.in);
            String message;

            //chat quài luôn
            while(true){
                 //gửi tin nhắn
                System.out.println("Client: ");
                message = sc.nextLine();
                writer.println(message);
                //vừa nhắn xong gửi đi liền 
                writer.flush();
                
                //nhận tin nhắn
                message=reader.readLine();
                System.out.println("Server: "+ message);  
                
               
            }
            
//            while (true) {
//                System.out.println("Đã kết nối thành công công đến server");
//                
//            }
            
        } catch (Exception e) {
        }
    }
    
}
