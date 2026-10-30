class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int avgsum = sum/k;
        if(avgsum >= threshold){
            count++;
        }

        for(int i=k; i<arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            avgsum = sum/k;
            if(avgsum >= threshold){
                count++;
            }
        }
        return count;
    }
}