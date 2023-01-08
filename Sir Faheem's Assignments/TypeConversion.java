public class TypeConversion{
    static int function(int a){ 
        if (a==1 || a==2)
        return 1;
    }
    else 
    {
        return function(a-1)+function(a-2);
    }

    public static void main(String arg[]){
        int n= 10;

    for (int h=0; h<n; h++)
    {
        System.out.print(function(h));
    }
        }
    
