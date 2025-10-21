public class ArrayBehandlung {

    public static int maxim(int[] arr){
        if (arr != null && arr.length != 0){
            int max = arr[0];
            for (int i = 1; i<arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }

            return max;
        }else {
            throw new IllegalArgumentException("Array is null or empty");
        }

    }

}
