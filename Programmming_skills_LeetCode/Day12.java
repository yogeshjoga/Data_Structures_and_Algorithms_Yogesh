package Programmming_skills_LeetCode;

public class Day12 {
/*
 * 
 */


 //1603. Design Parking System
 class ParkingSystem {

    public ParkingSystem(int big, int medium, int small) {
        count = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
    private int[] count;
 } 

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */




//303. Range Sum Query - Immutable
// 2nd soluiton

    public static void main(String[] args) {
        
    }
    
}
