package lesson_06;

public class ArrayHelper {

    public int getMaxNumber(int[] arr) {
        return -1;
    }

    public int getMinNumber(int[] arr) {
        return -1;
    }

    public int[] sort(int[] arr) {
        sortAsc(arr);
        return arr;
    }

    /**
     * @param sortType asc, dsc
     **/
    public int[] sort(int[] arr, String sortType) {
        if (sortType.equals("dsc")) {

        } else if (sortType.equals("asc")) {
            sortAsc(arr);
        }
        return arr;
    }

    private void sortAsc(int[] arr) {

    }
}
