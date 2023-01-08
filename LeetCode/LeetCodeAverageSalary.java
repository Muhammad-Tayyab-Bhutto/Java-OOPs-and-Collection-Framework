import java.util.*;
class LeetCodeAverageSalary{
    // public double average(int[] salary) {
    //     Arrays.sort(salary);
    //     int arrayLength = salary.length;
    //     double sum = Arrays.stream(salary).sum();
    //     sum = sum - salary[0]-salary[arrayLength-1];
    //     double average = sum/(arrayLength-2);
    //     return average;
    // }
    // OR
    public double average(int[] salary) {
        // first sorting array so that max and minimum will be at the first and last place 
        Arrays.sort(salary);
        double sum = 0;
        // start loop from index 1 and end length -1 because of min and max 
        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];
        }
        // arrayLength - 2 because of we don't have to include max and min numbers.
        double average = sum/(salary.length-2);
        return average;
    }
}