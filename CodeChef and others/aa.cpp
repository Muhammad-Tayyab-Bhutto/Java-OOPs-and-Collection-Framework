#include <bits/std++.h>
using namespace std;
int removeDuplicates(vector<int>& nums) {
        sort(nums.begin(), nums.end()); 
        nums.erase( unique( nums.begin(), nums.end() ), nums.end() );
        int numbers[nums.size()];
        for (int i = 0; i < nums.size(); i++){
            numbers[i] = nums[i]; 
        }
        return numbers;
}
int main()
{
    // int tNumbers
    // cin >>tNumbers;
    // while (tNumbers--)
    // {
    //     long long int B, C;
    //     cin >> B >> C;
    //     cout << c / __gcd(B, C) << endl;
    // }
    // return 0;
    
}