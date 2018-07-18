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
public class UASPBO16122001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int roomType;
        
        System.out.println("Room Type");
        System.out.println("---------");
        System.out.println("(1) Room Only");
        System.out.println("(2) Room and Breakfast");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);  
	
        System.out.print("Room Type: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number!");
            sc.next(); // this is important!
        }
        
        roomType = sc.nextInt();
        
        if (roomType == 1){
            try{
                TestRoomOnly.main(args);
            }catch (Exception e){
                System.out.println("Error: "+e.toString());
            }
        }else if (roomType == 2){
            try{
                TestRoomAndBreakfast.main(args);
            }catch (Exception e){
                System.out.println("Error: "+e.toString());
            }
        }else{
            System.out.println("Room Only applied.");
            try{
                TestRoomOnly.main(args);
            }catch (Exception e){
                System.out.println("Error: "+e.toString());
            }
        }
    }
}
