// You are given an array 
//  consisting of 
//  positive integers. Your task is to find an array 
//  of length 
//  satisfying the following conditions:


// Input format

// The first line contains a single integer 
//  denoting the number of test cases.
// The first line of each test case contains a single integer 
//  denoting the length of the array.
// The second line of each test case contains 
//  space-separated integers denoting the integer array 
// .
// Output format

// For each test case (in a separate line), print 
//  space-separated integers denoting 
// .If there are multiple answers, you can print any of them. It is guaranteed that under the given constraints at least 1 
//  exists.

// Constraints


// Sample Input
// 2
// 3
// 2 1 3
// 2
// 5 1
// Sample Output
// 2 2 3
// 5 5
// Time Limit: 1
// Memory Limit: 256
// Source Limit:


import java.util.*;

public class NonDecArray {
    public static void func(long[] in) {
        for (int i = 1; i < in.length; i++) {
            if (in[i] < in[i - 1]) {
                long q = in[i - 1] / in[i];
                in[i] = q * in[i];
                if (in[i] < in[i - 1]) {
                    in[i] += in[i] / q;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<long[]> results = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] res = new long[n];
            for (int j = 0; j < n; j++) {
                res[j] = sc.nextLong();
            }
            func(res);
            results.add(res);
        }

        for (int i = 0; i < t; i++) {
            for (long num : results.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}