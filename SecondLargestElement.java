package SecondLargestElement;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 67, 32, 54, 67, 87, 77};

        int largest = arr1[0];
        int secondLargest = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largest) {
                secondLargest = largest;
                largest = arr1[i];
            } else if (arr1[i] > secondLargest && arr1[i] != largest) {
                secondLargest = arr1[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}

