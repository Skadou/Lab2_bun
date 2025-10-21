import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numebers = new int[]{4, 8, 3, 10, 17};
        System.out.println("Array:"+Arrays.toString(numebers));
        System.out.println("Maximal:"+ArrayBehandlung.findmaxim(numebers));
        System.out.println("Minimal:"+ArrayBehandlung.findminim(numebers));
        System.out.println("Summermax:"+ArrayBehandlung.findmaxsum(numebers));
        System.out.println("Summermax:"+ArrayBehandlung.finminsum(numebers));
    }

}