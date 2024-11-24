package codingChallenge;

public class MyDailyCodingChallenges {
    public static void quickSort(int[] numbers, int start, int end) {
        if(start < end) {
            int partitionIndex = partition(numbers, start, end);
            quickSort(numbers, start, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, end);

        }
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int currentIndex = start;
        for(int index = start; index < end; index++){
            if(numbers[index] < pivot) {
                swap(numbers, currentIndex, index);
                currentIndex++;
            }
        }
            swap(numbers, currentIndex, end);
            return currentIndex;
    }

    private static void swap(int[] numbers, int currentIndex, int index) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[index];
        numbers[index] = temp;
    }

    public static int[] findMaximumProduct(int[] numbers) {
        quickSort(numbers, 0, numbers.length-1);
        int firstElement = numbers[0];
        int secondElement = numbers[1];
        int secondToLastElements = numbers[numbers.length - 2];
        int lastElement = numbers[numbers.length -1 ];
        if((secondElement * firstElement) > (secondToLastElements * lastElement)){
            return new int[]{firstElement, secondElement};
        }
        return new int[]{secondToLastElements, lastElement};


    }
}
