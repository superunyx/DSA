class Solution {
    static void bitManipulation(int num, int i) {
        if((num&(1<<(i-1)))!=0){
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
        num=num|(1<<(i-1));
        System.out.print(num+" ");
        num=num&(~(1<<(i-1)));
        System.out.print(num+" ");
    }
}
