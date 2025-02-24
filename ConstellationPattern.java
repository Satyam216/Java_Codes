/*Constellation Problem
Three characters {#, *, .} represents a constellation of stars and galaxies in space. Each galaxy is demarcated 
by # characters. There can be one or many stars in a given galaxy. Stars can only be in the shape of 
vowels {A,E,I,O,U}.
A collection of * in the shape of the vowels is a star. A star is contained in a 3×3 block. 
Stars cannot be overlapping. The dot(.) character denotes empty space.

Given 
3×N
3×N matrix comprising of { #, *, . } character, find the galaxy and stars within them.

Note: Please pay attention to how vowel A is denoted in a 
3×3
3×3 block in the examples section below.

Input Format
Input consists of a single integer 
N
N denoting the number of columns.
Output Format
The output contains vowels (stars) in order of their occurrence within the given galaxy. The galaxy itself is represented by the # character.

Constraints
3 ≤ N ≤ 105
 
Sample 1:
Input
Output
18
* . * # * * * # * * * # * * * . * .
* . * # * . * # . * . # * * * * * *
* * * # * * * # * * * # * * * * . *
U#O#I#EA  */

import java.util.Scanner;

public class ConstellationPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char galaxy[][] = new char[3][n];  //array for printing the 3 rows and n columns of the pattern

        for (int i = 0 ; i < 3 ; i++){
            String row = sc.nextLine();
            for(int j = 0 ; j < n ; j++){
                galaxy[i][j] = row.charAt(j);
            }
        }
        //for iteration the multiple petterns
        for(int i = 0 ; i < n ;){
            
            if(galaxy[0][i]=='#'){
                System.out.print('#');
                i++;
                continue;
            }
        
            if( galaxy[0][i] == '-'  && galaxy[0][i+2]=='-' && galaxy[2][i+1]=='-'){
                System.out.print("A");
                i += 3;
                continue;
            }
            if( galaxy[1][i+2] == '-'  && galaxy[1][i]=='*' && galaxy[1][i+1]=='*'){
                System.out.print("E");
                i += 3;
                continue;
            }
            if( galaxy[1][i] == '-'  && galaxy[1][i+2]=='-'){
                System.out.print("I");
                i += 3;
                continue;
            }
            if( galaxy[1][i] == '*'  && galaxy[1][i+1]=='-' && galaxy[1][i+2]=='-'){
                System.out.print("0");
                i += 3;
                continue;
            }
            if( galaxy[0][i+1] == '-'  && galaxy[1][i+1]=='-' && galaxy[2][i+1]=='*'){
                System.out.print("U");
                i += 3;
                continue;
            }
        } 
        sc.close();
    }
    
}
