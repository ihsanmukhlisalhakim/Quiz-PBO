/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizPBO;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */

public class Login {
    public boolean doLogin(){
        boolean isLogin=true;
        String ID="admin123";
        String idInput="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");
        idInput = sc.nextLine();
        if(!idInput.equalsIgnoreCase(ID)){
            System.out.println("ID Anda Salah -> "+idInput);
            isLogin=false;
        }

        return isLogin;
    }
}