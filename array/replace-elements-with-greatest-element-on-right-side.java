
class Solution {
    public int[] replaceElements(int[] arr) {
        int right = -1;
        for(int i=arr.length-1; i>=0; i--){
            int newmax = Math.max(right, arr[i]);
            arr[i] = right;
            right = newmax;
        }
        return arr;
    }
}