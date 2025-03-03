/*Charlie and Dave each submitted a project for evaluation. A panel of judges rates the projects based on three criteria: innovation,
 execution, and impact, assigning scores from 1 to 10.
Charlie's project received scores represented by the triplet c = (c[0], c[1], c[2]),.....
while Dave's project was scored with the triplet d = (d[0], d[1], d[2])........
The task is to calculate the comparison points by comparing c[0] with d[0], c[1] with d[1], and c[2] with
 d[2].........
When c[i] is greater than d[i], Charlie earns 1 point, When c[i] is less than d[i], Dave earns 1 point 
and When c[i] is equal to d[i], neither person receives any points.
The comparison points represent the total points earned by each person.
Given the scores of Charlie's project (c) and Dave's project (d), determine their respective comparison points.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting
 your answer.

Exercise-1
input:
5 6 7 8 5
3 6 10 10 3
output:
2 2

5 6 7 8 5 is Charlie score
3 6 10 10 3 is Dave score
2 2 is leading count for charlie and Dave

Exercise-2
input:
6 5 10 9
6 6 8 7
output:
2 1  */

//code

import java.util.Scanner;

public class Lab9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int charlie[] = new int[n];
        int dave[] = new int[n];

        for(int i = 0; i < n; i++){
            charlie[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++ ){
            dave[i] = sc.nextInt();
        }

        int charlie_points = 0;
        int dave_points = 0;

        for(int i = 0; i < n; i++ ){
            if(charlie[i] > dave[i] ){
                charlie_points++;
            }else if (charlie[i] < dave[i]){
                dave_points++;
                }
            }

            System.out.println(charlie_points+" "+dave_points);

        sc.close();
        }

    }