import java.util.Scanner;

public class PracticeCode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of menu
        int m = sc.nextInt(); //number of items in each menu
         int menu[][] = new int[n][m];
        
         //making the menu
         for (int i=0 ;i<n; i++){
            for(int j=0;j<m;j++){
                menu[i][j] = sc.nextInt();
            }
        }

        //find the max price from the menus for each item
        int maxprice[] = new int[m];
        for(int i=0; i<m; i++){
            int max = 0;
            for(int j=0; j<n; j++){
                if(menu[j][i] > max){
                    max = menu[j][i];
                }
            }
            maxprice[i] = max;
        }

        //find the number of max price in each menu

        int MaxPriceInEachMenu[] = new int[n];
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<m; j++){
                if (menu[i][j] == maxprice[j]) {
                    count++;     
                }
            }
            MaxPriceInEachMenu[i] = count;
        }       
        
        //find the menu with the maximum good prices
        //ham isme find kr rhe h ki agr kisi menu me good price repeat hue to sabse jyada repeat hone ka
        // count kya h taki baad me us count se ham compare kre average nikal ske
        
        int maxgood = 0;
            for(int count : MaxPriceInEachMenu){
                if(count > maxgood){
                    maxgood = count;
                }
            }

            //now finding the average if menu has the same maxgood price
            double maxaverage = -1;
            int result = 0;
            for(int i=0; i<n ; i++){
                if(MaxPriceInEachMenu[i] == maxgood){
                    double sum = 0;
                    for(int j=0; j<m;j++ ){
                        sum += menu[i][j];    
                    }
                    double average = sum/m;
                    if(average > maxaverage){
                        maxaverage = average;
                        result = i+1;
                    }

                }
            }
            System.out.println(result);
    }
    
}
