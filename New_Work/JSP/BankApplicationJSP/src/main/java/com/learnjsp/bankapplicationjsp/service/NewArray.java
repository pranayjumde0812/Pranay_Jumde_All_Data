//package com.learnjsp.bankapplicationjsp.service;
//
//import java.util.Scanner;
//
//public class NewArray {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the size of square array");
//        int size = sc.nextInt();
//
//        int[][] arr = new int[size][size];
//
//        // taking input
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j) {
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
