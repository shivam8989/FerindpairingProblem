package Recursion;

public class PairingfriendsProblem {
    public static int noWays(int n){
        if(n==1 || n==2) {

            return n;
        }
        // single
        int single = noWays(n-1);
        //pairs
        int pair = noWays(n-2);
        int pairsways= pair * (n-1);
         // total Ways
        int totalways = single + pairsways;


        return totalways;

        }
    public static void main (String [] args){
        System.out.println(noWays(3));
    }
}
