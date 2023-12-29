
public class Algo {
    public static void main(String[] args) {
        int[] array = {3, 2, 10, 5, 1};

        quickSort(array, 0, array.length-1);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = array[mid];

            if (value < target) low = mid + 1;
            else if (value > target) high = mid - 1;
            else return mid;
        }

        return -1;
    }

    public static void bubbleSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int min = i;
            for (int j=i+1; j<array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }

                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i=1; i<array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j>=0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static void HeapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    // To heapify a subtree rooted with node i which is an index in arr
    // n is size of heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i; // left = 2*i
        int r = 2 * i + 1; // right = 2*i + 1

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
    

    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int mid = (int)(length / 2);
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];

        int i = 0; // left array
        int j = 0; // right array

        for (;i<length;i++) {
            if (i<mid) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = (int)(array.length / 2);
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r <rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
        
    }
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j=start; j<=end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
