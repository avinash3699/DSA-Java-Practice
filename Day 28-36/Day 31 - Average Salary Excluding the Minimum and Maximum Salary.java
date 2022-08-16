// Leetcode Program Link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    public double average(int[] salary) {
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int index = 0; index < salary.length; index++){
            if(salary[index] < min) min = salary[index];
            if(salary[index] > max) max = salary[index];
        }
        
        int sum = 0;
        
        for(int index = 0; index < salary.length; index++)
            if( (salary[index] != min) && (salary[index] != max) )
                sum += salary[index];
        
        return (sum*1.0) / (salary.length-2);
    }
}