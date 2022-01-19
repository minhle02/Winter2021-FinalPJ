package utility;

public class Module {
    private static <E extends Comparable<E>> int partition(E[] list, int low, int high) {
        int mid = (low + high)/2;
        E pivot = list[mid];
        boolean done = false;
        while (!done) {
            while (list[low].compareTo(pivot) < 0) {
                low++;
            }
            while (pivot.compareTo(list[high]) < 0) {
                high--;
            }
            if (low >= high)
                done = true;
            else {
                swap(list, low, high);
                low++;
                high--;
            }
        }
        return high;
    }

    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list,0, list.length-1);
    }

    private static <E extends Comparable<E>> void quickSort(E[] list, int low, int high) {
        if (low < high) {
            int mid = partition(list, low, high);
            quickSort(list, low, mid);
            quickSort(list, mid + 1, high);
        }
    }

    private static <E> void swap(E[] list, int a, int b) {
        if (a != b) {
            E temp = list[a];
            list[a] = list[b];
            list[b] = temp;
        }
    }
}
