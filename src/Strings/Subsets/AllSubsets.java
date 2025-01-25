package Strings.Subsets;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
    public static void main(String[] args) {
//        subsets("", "garv");
//        System.out.println(subsets1("", "garv"));
        int[] arr = {1,2,3};
        List<List<Integer>> ans = IterativeSubset(arr);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }

    static void subsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsets(p+ch, up.substring(1));       // Take it
        subsets(p, up.substring(1));             // remove it
    }

    static ArrayList<String> subsets1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left =  subsets1(p+ch, up.substring(1));       // Take it
        ArrayList<String> right = subsets1(p, up.substring(1));      // remove it
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> IterativeSubset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int nums: arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal= new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }

}
