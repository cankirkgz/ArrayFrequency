public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 5, 20};
        int[] sort = new int[array.length];
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]){
                    sort[i]++;
                }
            }
        }
        int frequency = array[0];
        System.out.println(array[0] + " sayısı " + sort[0] + " kere tekrar edildi.");
        for (int i = 1; i < sort.length; i++) {
            if (frequency != array[i]) {
                System.out.println(array[i] + " sayısı " + sort[i] + " kere tekrar edildi.");
                frequency = array[i];
            }

        }
    }
}