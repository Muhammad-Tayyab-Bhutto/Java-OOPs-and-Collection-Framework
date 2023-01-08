public class LeetCodeOddNumbersCount {
    public int countOdds(int low, int high) {
        int count = high - low + 1;
        // if count is even so it will return  count / 2 
        if (count % 2 == 0){
            return count/2;
        }
        // if count is odd then this will check high and low values either both are even 
        else if (high % 2 == 0 && low % 2 == 0){
            return (high - low )/ 2;
        }
        // if count is odd then this line will execute
        else {
            return ((high - low) / 2) + 1;
        }
    }
}
