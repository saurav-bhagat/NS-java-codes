package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ListExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

//        ArrayList<Integer> list1 = new ArrayList<>();
//        LinkedList<Integer> list1 = new LinkedList<>();
        Vector<Integer> list1 = new Vector<>();

        for(int i=0; i<n; i++){

            int temp = scan.nextInt();
            list1.add(temp);
        }

        for(Integer element: list1){
            System.out.println(element);
        }

    }
}
