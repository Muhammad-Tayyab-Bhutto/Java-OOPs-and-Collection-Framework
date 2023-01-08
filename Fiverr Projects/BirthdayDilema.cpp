
// // C++ implementation to find the maximum number
// // of friends to be distribute.
// // k friends
// #include <bits/stdc++.h>
// using namespace std;

// // function to find the maximum number distribution

// int tofeesDistribution(int arr[], int n, int k)
// {
//     // unordered_map 'um' implemented as
//     // hash table
//     unordered_map<int, int> um;

//     // 'sum[]' to store cumulative sum, where
//     // sum[i] = sum(arr[0] +.. arr[i])
//     int sum[n], cur_remainder;

//     // to store sum of sub-array having maximum sum
//     int maxSum = 0;

//     // building up 'sum[]'
//     sum[0] = arr[0];
//     for (int i = 1; i < n; i++)
//         sum[i] = sum[i - 1] + arr[i];

//     // traversing 'sum[]'
//     for (int i = 0; i < n; i++)
//     {

//         // finding current remainder
//         cur_remainder = sum[i] % k;

//         // if true then sum(0..i) is divisible
//         // by k
//         if (cur_remainder == 0)
//         {
//             // update 'maxSum'
//             if (maxSum < sum[i])
//                 maxSum = sum[i];
//         }

//         // if value 'cur_remainder' not present in 'um'
//         // then store it in 'um' with index of its
//         // first occurrence
//         else if (um.find(cur_remainder) == um.end())
//             um[cur_remainder] = i;

//         else
//             // if true, then update 'max'
//             if (maxSum < (sum[i] - sum[um[cur_remainder]]))
//                 maxSum = sum[i] - sum[um[cur_remainder]];
//     }

//     // distributed 'k'
//     return (maxSum / k);
// }

// // Driver program to test above
// int main()
// {
//     int a;
//     int k;
//     cin >> a;
//     cin >> k;
//     int arr[a];
//     for (int i = 0; i < a; i++) {
//         cin >> arr[i];
//     }
//     cout << tofeesDistribution(arr, a, k);
//     return 0;
// }

// C++ implementation of simple method to find
// minimum difference between any pair
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    int a;
    int k;
    int count = 1;
    cout << "Please enter value of a. ";
    // cin.ignore();
    cin >> a;
    cin >> k;
    vector<int> arr;
    for (int i = 0; i < a; i++)
    {
        int var;
        cin >> var;
        arr.push_back(var);
        arr[i]++;
        k--;
    }
    sort(arr.begin(), arr.end());
    for (int i = 0; i < a; i++)
    {
        if (arr[i] == arr[i + 1])
        {
            count++;
        }
    }
}

cout << count;
}