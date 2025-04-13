package BinarySearch;

public class Sum of Manhattan distances {

    // brute force
    // static int distancesum(int x[], int y[], int n)
    // {
    //     int sum = 0;

    //     for each point, finding distance to
    //     rest of the point
    //     for (int i = 0; i < n; i++)
    //         for (int j = i + 1; j < n; j++)
    //             sum += (Math.abs(x[i] - x[j])
    //                     + Math.abs(y[i] - y[j]));
    //     return sum;
    // }

    // public static void main(String[] args)
    // {
    //     int x[] = { -1, 1, 3, 2 };
    //     int y[] = { 5, 6, 5, 3 };
    //     int n = x.length;

    //     System.out.println(distancesum(x, y, n));
    // }

    //
    // optimal
    static int distancesum(int arr[], int n)
    {
        
        // sorting the array.
        Arrays.sort(arr);

        // for each point, finding the distance.
        int res = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            res += (arr[i] * i - sum);
            sum += arr[i];
        }

        return res;
    }

    static int totaldistancesum(int x[], int y[], int n)
    {
        // Adding the distances along x and y axis. 
        return distancesum(x, n) + distancesum(y, n);
    }

    // Driven Program
    public static void main(String[] args)
    {

        int x[] = { -1, 1, 3, 2 };
        int y[] = { 5, 6, 5, 3 };
        int n = x.length;
        System.out.println(totaldistancesum(x,y, n));
    }

}



