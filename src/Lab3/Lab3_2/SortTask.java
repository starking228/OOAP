package Lab3.Lab3_2;

class SortTask implements Runnable {
    private final int[] array;
    private final String sortType;

    public SortTask(int[] array, String sortType) {
        this.array = array.clone();
        this.sortType = sortType;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        switch (sortType) {
            case "Bubble Sort":
                bubbleSort(array);
                break;
            case "Shell Sort":
                shellSort(array);
                break;
            case "Quick Sort":
                quickSort(array, 0, array.length - 1);
                break;
        }
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;

        SortLogger.getInstance().log(sortType, timeTaken);

        System.out.println(sortType + " завершене за " + timeTaken + " мс");
    }

    private void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    private void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
