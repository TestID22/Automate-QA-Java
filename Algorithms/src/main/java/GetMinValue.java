public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{123, 2, 45, 23};
        System.out.println(GetMinValue(testArray));
    }

    public static int GetMinValue(int[] arrayOfNumbers){
        int minValue = arrayOfNumbers[0];
        int minIndex = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++){
            if(arrayOfNumbers[i] < minValue){
                minValue = arrayOfNumbers[i];
                minIndex = i;
            }
        }
        return minValue;
    }
}
