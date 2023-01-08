#include <bits/stdc++.h>
using namespace std;

// Returns minimum difference between any pair
int findMinDiff(vector<int> arr, int n)
{
    // Initialize difference as infinite
    int diff = 0;

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (abs(arr[i] - arr[j]) < diff)
            {
                diff = abs(arr[i] - arr[j]);
            }
        }
    }
    return diff;
}

int main()
{
    int a;
    int k;
    int minDifference = 0;
    int count = 1;
    cin >> a;
    cin >> k;
    vector<int> arr;

    for (int i = 0; i < a; i++)
    {
        int var;
        cin >> var;
        arr.push_back(var);
        arr[i]++;
    }
    sort(arr.begin(), arr.end());
    minDifference = findMinDiff(arr, a);
    cout << minDifference <<endl;
    if (k != 0)
    {
        for (int i = 0; i < a; i++)
        {
            if (arr[i] < arr[i + 1] && arr[i+1] - arr[i] == minDifference && k != 0)
            {
                arr[i] = arr[i] + minDifference;
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
    cout << count;

    return 0;
}
int findMinDifference(int arr[], int n, int x, int y)
{
    // base case
    if (n <= 1) {
        return 0;
    }
 
    int x_index = n, y_index = n;
    int min_diff = INT_MAX;
 
    // traverse the given array
    for (int i = 0; i < n; i++)
    {
        // if the current element is `x`
        if (arr[i] == x)
        {
            // set `x_index` to the current index
            x_index = i;
 
            // if `y` is seen before, update the result if required
            if (y_index != n) {
                min_diff = fmin(min_diff, abs(x_index - y_index));
            }
        }
 
        // if the current element is `y`
        if (arr[i] == y)
        {
            // set `y_index` to the current index
            y_index = i;
 
            // if `x` is seen before, update the result if required
            if (x_index != n) {
                min_diff = fmin(min_diff, abs(x_index - y_index));
            }
        }
    }
 
    return min_diff;
}
