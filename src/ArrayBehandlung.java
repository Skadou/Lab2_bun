public class ArrayBehandlung {

    public static int findmaxim(int[] arr) {
        if (arr != null && arr.length != 0) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        } else {
            throw new IllegalArgumentException("Array is null or empty");
        }

    }

    public static int findminim(int[] arr) {
        if (arr != null && arr.length != 0) {
            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            return min;
        } else {
            throw new IllegalArgumentException("Array is null or empty");
        }
    }

    public static long findmaxsum(int[] arr){
        if (arr ==null || arr.length == 0)
            throw new IllegalArgumentException("Array is null or empty");
        if (arr.length ==1)
            return 0;
        long summe =0;
        int min = arr[0];
        for (int i: arr){
            summe += i;
            if (i < min)
                min = i;
        }
        return summe - min;
    }

    public static long finminsum(int[] arr){
        if (arr ==null || arr.length == 0)
            throw new IllegalArgumentException("Array is null or empty");
        if (arr.length ==1)
            return 0;
        long summe =0;
        int max = arr[0];
        for (int i: arr){
            summe += i;
            if (i > max)
                max = i;
        }
        return summe - max;
    }


}
