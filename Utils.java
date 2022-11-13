public class Utils {
    /**
     * swap function to swap elements in a generic array
     * @param arr
     * @param a
     * @param b
     * @param <T>
     */
    public static <T> void swap(T arr[], int a, int b)
    {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * swap function to swap elements in array of integers
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * swap function to swap elements in array of doubles
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(double arr[], int a, int b)
    {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * swap function to swap elements in array of longs
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(long arr[], int a, int b)
    {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * swap function to swap elements in array of floats
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(float arr[], int a, int b)
    {
        float temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
