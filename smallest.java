public class SmallestElement {

    // Method to find the smallest element in an array
    public static int findSmallest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int smallest = arr[0]; // Assume the first element is the smallest

        // Iterate through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is smaller
            }
        }

        return smallest; // Return the smallest element
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array

        try {
            int smallest = findSmallest(arr);
            System.out.println("The smallest element in the array is: " + smallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
