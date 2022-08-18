// Leetcode Program Link: https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int minDistance = Integer.MAX_VALUE, minDistanceIndex = -1;
        
        for(int index = 0; index < points.length; index++){
            
            if( (x == points[index][0]) || (y == points[index][1]) ){
            
                int currDistance = Math.abs(x - points[index][0]) + Math.abs(y - points[index][1]);

                if(currDistance < minDistance){
                    minDistanceIndex = index;
                    minDistance = currDistance;
                }
                
            }
            
        }
        
        return minDistanceIndex;
        
    }
}