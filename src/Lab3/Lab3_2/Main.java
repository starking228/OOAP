package Lab3.Lab3_2;

// одинак
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //int[] array = {34, 7, 23, 32, 5, 62, 32, 21, 23, 67, 91, 2, 16};
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // Заповнюємо масив випадковими числами
        }


        // Створюємо потоки для виконання різних алгоритмів сортування
        Thread bubbleSortThread = new Thread(new SortTask(array, "Bubble Sort"));
        Thread shellSortThread = new Thread(new SortTask(array, "Shell Sort"));
        Thread quickSortThread = new Thread(new SortTask(array, "Quick Sort"));

        // Запускаємо потоки
        bubbleSortThread.start();
        shellSortThread.start();
        quickSortThread.start();

        // Очікуємо завершення всіх потоків
        bubbleSortThread.join();
        shellSortThread.join();
        quickSortThread.join();

        System.out.println("Усі алгоритми завершені.");
    }
}

