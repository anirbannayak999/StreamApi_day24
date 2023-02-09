package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class Collections {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size: ");
            int n = sc.nextInt();
            System.out.println("enter ids: ");
            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int i = 0; i < n; i++ ){
                arrayList.add(i);
            }
            System.out.println(arrayList);
        }
    }


