// CPP program to minimize number of
// unique characters in a string.

#include <bits/stdc++.h>
using namespace std;

// Utility function to find minimum
// number of unique characters in string.
void minCountUtil(string A, string B,
				unordered_map<char, int>& ele,
				int& ans, int ind)
{

	// If entire string is traversed, then
	// compare current number of distinct
	// characters in A with overall minimum.
	if (ind == A.length()) {
		ans = min(ans, (int)ele.size());
		return;
	}

	// swap A[i] with B[i], increase count of
	// corresponding character in map and call
	// recursively for next index.
	swap(A[ind], B[ind]);
	ele[A[ind]]++;
	minCountUtil(A, B, ele, ans, ind + 1);

	// Backtrack (Undo the changes done)
	ele[A[ind]]--;

	// If count of character is reduced to zero,
	// then that character is not present in A.
	// So remove that character from map.
	if (ele[A[ind]] == 0)
		ele.erase(A[ind]);
	

	// Restore A to original form.
	// (Backtracking step)
	swap(A[ind], B[ind]);

	// Increase count of A[i] in map and
	// call recursively for next index.
	ele[A[ind]]++;
	minCountUtil(A, B, ele, ans, ind + 1);

	// Restore the changes done
	// (Backtracking step)
	ele[A[ind]]--;
	if (ele[A[ind]] == 0)
		ele.erase(A[ind]);	
}

// Function to find minimum number of
// distinct characters in string.
int minCount(string A, string B)
{
	// Variable to store minimum number
	// of distinct character.
	// Initialize it with length of A
	// as maximum possible value is
	// length of A.
	int ans = A.length();

	// Map to store count of distinct
	// characters in A. To keep
	// complexity of insert operation
	// constant unordered_map is used.
	unordered_map<char, int> ele;

	// Call utility function to find
	// minimum number of unique
	// characters.
	minCountUtil(A, B, ele, ans, 0);

	return ans;
}

int main()
{
	string A;
	string B;
    int limit;
    cin >> limit;
    while (limit--)
    {
        cin >> A;
        cin >> B;
    }
	cout << minCount(A, B);
	return 0;
}

if (sumOfX != -sumOfX)
            {
                sumOfX = (sumOfX);
            }
            else{
                sumOfX = -(sumOfX);
            }
            if (sumOfY != -sumOfY)
            {
                sumOfY = (sumOfY);
            }
            else{
                sumOfY = -(sumOfY);
            }
            System.out.println(Math.max(sumOfX, sumOfY));