public class ArrayMinMax {
    public static void main(String[] args) {

        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize with first element
        int smallest = numbers[0];
        int largest = numbers[0];

        // Enhanced for loop
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        // Output
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}