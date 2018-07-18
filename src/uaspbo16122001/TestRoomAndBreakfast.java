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
public class TestRoomAndBreakfast {
    public static void main(String[] args){
        int roomRate, breakfastRate, nights;
        String customBreakfastRate;
        Scanner sc = new Scanner(System.in);  
	
        System.out.print("Room Rate : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number!");
            sc.next(); // this is important!
        }
        roomRate = sc.nextInt();
        
        System.out.print("Custom Breakfast Rate (y/n): ");
        customBreakfastRate = sc.next();
        
        if (customBreakfastRate.equals("y")){
            System.out.print("Breakfast Rate: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid number!");
                sc.next(); // this is important!
            }
            breakfastRate = sc.nextInt();
        }else{
            System.out.println("Standart Rate applied.");
            breakfastRate = 50000;
        }
        
        System.out.print("Nights    : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number!");
            sc.next(); // this is important!
        }
        nights = sc.nextInt();
        
        System.out.println("");
        
        RoomAndBreakfast x = new RoomAndBreakfast(roomRate, nights);
        x.setBreakfastRate(breakfastRate);
        System.out.println("--------------------------");
        System.out.println("Invoice Room and Breakfast");
        System.out.println("--------------------------");
        System.out.println("Room Rate       = " + x.getRoomRate());
        System.out.println("Breakfast Rate  = " + x.getBreakfastRate());
        System.out.println("Nights          = " + x.getNights());
        if (customBreakfastRate.equals("n")){
            System.out.println("Total           = " + x.getTotal());
        }else{
            System.out.println("Total           = " + x.getTotal(breakfastRate));
        }
        
    }
}
