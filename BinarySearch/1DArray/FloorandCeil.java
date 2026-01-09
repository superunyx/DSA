// Floor is Largest no <=x
// Ceil is Smallest no >=x 



public int[] getFloorandCeil(int[] nums,int x){
   int low=0;
   int high=nums.length-1;
   int floor=-1, ceil=-1;
   while(low<=high){
       int mid=(low+high)/2;
       if(nums[mid]>=x){
           ceil=nums[mid];
           high=mid-1;
       }
       else{
           floor=nums[mid];
           low=mid+1;
       } 
   }
}
