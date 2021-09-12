public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayForBubbleSorting = new int[]{ 1, 33, 44, 123, 99 , 31, 15, 2, 5};
        int[] sorted = bubbleSore(arrayForBubbleSorting);
        printArray(sorted);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] bubbleSore(int[] array){
       int temp;
       boolean isSorted = false;
       while (!isSorted) {
           isSorted = true;
           for (int i = 1; i < array.length; i++) {
               if (array[i] < array[i - 1]) {
                   temp = array[i - 1];
                   array[i - 1] = array[i];
                   array[i] = temp;
                   isSorted = false;
               }
           }
       }
       return array;
    }
}
