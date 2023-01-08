#include <stdio.h>
#include <limits.h>
#include <stdlib.h>
#include <math.h>

// Returns minimum difference between any pair
// int findMinDiff(int arr[], int n)
// {
//     // Initialize difference as infinite
//     int diff = INT_MAX;

//     for (int i = 0; i < n - 1; i++)
//     {
//         for (int j = i + 1; j < n; j++)
//         {
//             if (abs(arr[i] - arr[j]) < diff)
//             {
//                 diff = abs(arr[i] - arr[j]);
//             }
//         }
//     }
//     return diff;
// }

int findMinDiff(int arr[], int n)
{
    // Initialize difference as infinite
    int diff = 0;

    // Find the min diff by comparing difference
    // of all possible pairs in given array
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] < arr[i + 1])
        {
            diff = arr[i + 1] - arr[i];
        }
    }

    // Return min diff
    return diff;
}

int main()
{
    int a;
    int k;
    int minDifference = 0;
    int count = 1;
    int temp;
    scanf("%d", &a);
    scanf("%d", &k);
    int arr[a];

    for (int i = 0; i < a; i++)
    {
        scanf("%d", &arr[i]);
        arr[i]++;
    }
    for (int i = 0; i < a; i++)
    {
        for (int j = i + 1; j < a; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    minDifference = findMinDiff(arr, a);
    if (k != 0)
    {
        for (int i = 0; i < a; i++)
        {
            if (arr[i] < arr[i + 1] && arr[i + 1] - arr[i] == minDifference && k != 0)
            {
                arr[i] = arr[i] + minDifference;
                k - minDifference;
            }
        }
    }
    for (int i = 0; i < a; i++)
    {
        if (arr[i] == arr[i + 1])
        {
            count++;
        }
    }
    printf("%d", count);

    return 0;
}
