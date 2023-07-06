class SumClosest {
    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 0, 3, 6, 7, 9};
        int[] SumClose = SumClosest(arr);
        System.out.println("The closest pair is: " + SumClose[0]+ " " +SumClose[1]);
    }

    public static int[] SumClosest(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closest = Integer.MAX_VALUE;
        int[] closestPair = new int[2];
        
        while (left < right) {
          int sum = arr[left] + arr[right];
           if (Math.abs(sum) < Math.abs(closest)) {
               closest = sum;
               closestPair[0] = arr[left];
               closestPair[1] = arr[right];
           }
           
           if(sum<0){
               left++;
           } else if(sum>0) {
               right--;
           } else{
               break;
           }
        }
        return closestPair;
}
}
 
