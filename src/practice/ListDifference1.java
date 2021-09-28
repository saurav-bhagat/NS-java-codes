package practice;

import java.util.*;

public class ListDifference1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            list1.add(ele);
        }

        int j = sc.nextInt();

        for(int i=0;i<j;i++){
            int ele = sc.nextInt();
            list2.add(ele);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i < list1.size(); i++){

            if(map.containsKey(list1.get(i))){

            }else {
                map.put(list1.get(i), 1);
            }
        }


        for(int i=0; i<list2.size(); i++){

            if( map.containsKey(list2.get(i))){
                map.put(list2.get(i), 0);
            }
        }

        for(Map.Entry m : map.entrySet()){
           if((int)m.getValue() !=0 ){
               System.out.println(m.getKey());
           }
        }

    }
}
