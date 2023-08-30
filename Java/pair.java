// Java program for the above approach
import java.lang.*;
import java.util.*;

class GFG{

//Function to find a pair in the given
// array whose sum is equal to z

static boolean findPair(int a[], int n, int z)
{
    //Iterate throught all the pairs
    for(int i=0; i<n; i++)
    for(int j=0; i<n; j++)
    if(i!=j && a[i]+a[j] == z)
    return true;
    
}

}