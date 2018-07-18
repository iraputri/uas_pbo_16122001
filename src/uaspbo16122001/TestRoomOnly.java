/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uaspbo16122001;

import java.util.Scanner;

/**
 *
 * @author 247
 */
public class TestRoomOnly {
    public static void main(String[] args){
        int roomRate, nights;
        
        Scanner sc = new Scanner(System.in);  
	
        System.out.print("Room Rate : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number!");
            sc.next(); // this is important!
        }
        roomRate = sc.nextInt();
        
        System.out.print("Nights    : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number!");
            sc.next(); // this is important!
        }
        nights = sc.nextInt();
        
        System.out.println("");
        
        RoomOnly x = new RoomOnly(roomRate, nights);
        System.out.println("-----------------");
        System.out.println("Invoice Room Only");
        System.out.println("-----------------");
        System.out.println("Room Rate   = " + x.getRoomRate());
        System.out.println("Nights      = " + x.getNights());
        System.out.println("Total       = " + x.getTotal());
    }
}
