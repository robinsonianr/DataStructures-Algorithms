package sortingAndSearching;

public class SearchAlgs {

    public int linearSearch(int[] arr, int target){
        int arrLength = arr.length;
        // Iterate through entire array until target is found
        for(int i = 0; i < arrLength; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


    public String verify(int index){
        if(index != -1){
            return "Target value was found at index: " + index;
        }else {
            return "Target value was not found in array";
        }
    }


    public int binarySearch(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            // if midpoint is equal to target return mid
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target ){ // if mid
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }

        return -1;
    }

    public int recursiveBinarySearch(int[] arr, int left, int right, int target){

        if(right >= left && left <= arr.length - 1) {
            int midpoint = left + (right - left) / 2;

            //if target is present at midpoint
            if(arr[midpoint] == target){
                return midpoint;
            }// if midpoint is greater than target
            // target is located in left sub array
            else if(arr[midpoint] > target){
                return recursiveBinarySearch(arr, left, midpoint -1, target);
            }// if midpoint is less than target
            // target is located in right sub array
            else
                return recursiveBinarySearch(arr, midpoint + 1, right, target);
        }
        // If target is not found in array
        return -1;
    }
}
