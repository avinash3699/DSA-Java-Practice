// Leetcode Program Link: https://leetcode.com/problems/design-parking-system/

class ParkingSystem {

    int bigSlot, mediumSlot, smallSlot;
    
    public ParkingSystem(int big, int medium, int small) {
        bigSlot = big;
        mediumSlot = medium;
        smallSlot = small;
    }
    
    public boolean addCar(int carType) {
        if( (carType == 1) && (bigSlot > 0) ){
            bigSlot--;
            return true;
        }
        else if( (carType == 2) && (mediumSlot > 0) ){
            mediumSlot--;
            return true;
        }
        else if( (carType == 3) && (smallSlot > 0) ){
            smallSlot--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */