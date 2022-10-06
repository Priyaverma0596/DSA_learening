class Solution {
    public void rotate(int[] nums, int k) {
        
        // approach rotating one by one approach
        // Question--anticlcokwise rotation
        // Step-1 Holding last element of array in temp(left swap)
        // Step 2 move  before last element to  right direction
        //time complexity--O(n*k) times bcoz k time loop is running for rotaion and another loop is running n-1 times
        
        for(int i=0;i<k;i++)
        {  
          
            rightswapofelement(nums); 
        }
        
    }
    public static void  rightswapofelement(int[] nums)
    { 
        int n= nums.length;
       int temp=nums[n-1];
       for(int i=n-1; i>0;i--)
       {
           nums[i]=nums[i-1];
       }
        nums[0]=temp;
    }
 }