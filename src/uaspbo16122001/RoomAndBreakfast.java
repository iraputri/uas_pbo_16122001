/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uaspbo16122001;

/**
 *
 * @author 247
 */
public class RoomAndBreakfast extends Room{
    int breakfastRate;
    
    public int getBreakfastRate() {
        return breakfastRate;
    }

    public void setBreakfastRate(int breakfastRate) {
        this.breakfastRate = breakfastRate;
    }
    
    public RoomAndBreakfast(int roomRate, int nights){
        this.roomRate = roomRate;
        this.nights = nights;
    }
    
    @Override
    public int getTotal(){
        return (roomRate + 50000) * nights;
    }
    
    public int getTotal(int breakfastRate){
        return (roomRate + breakfastRate) * nights;
    }
}
