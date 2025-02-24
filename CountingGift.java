import java.util.Scanner;

public class CountingGift{
    public static void main(String args[]){
        int gift_Count = 0;

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //number of test

        for (int k = 0; k<t; k++){
             int n = sc.nextInt();     //number of employee
             int Rank[]= new int[n];  //rank input
            for (int i=0; i<n; i++){
                Rank[i] = sc.nextInt();
            }
            int gifts[] = new int[n];
            for(int i = 0; i<n; i++){
                gifts[i] = 1;   //defaultly assign the value of gifts as 1
            }
            for(int j=1; j<n; j++){
                if(Rank[j]>Rank[j-1]){
                    gifts[j] = gifts[j-1] + 1;               
                }
            }
        for(int j=n-2; j>=0; j--){
            if(Rank[j]>Rank[j+1]){
                gifts[j] = Math.max(gifts[j],gifts[j+1]+1);
            }
        }
        for(int gift : gifts){
            gift_Count += gift;
        }
        System.out.println(gift_Count);
        }
        sc.close();
    }
}