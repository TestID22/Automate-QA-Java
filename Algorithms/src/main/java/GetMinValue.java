public class GetMinValue {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 23, 4, 4, 32, 54, 12, -12,};
        System.out.println(getMinValue(testArray));
    }

    public static int getMinValue(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if(minValue > array[i]){
                minValue = array[i];
            }
        }return minValue;
    }
}
