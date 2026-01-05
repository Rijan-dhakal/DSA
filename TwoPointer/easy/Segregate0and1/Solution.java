class Solution {
    void segregate0and1(int[] arr) {
        
        int pointer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                
                pointer++;
            }
        }
    }
}
