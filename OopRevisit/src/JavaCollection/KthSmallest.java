package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class KthSmallest {
    public static int findKth(ArrayList<Integer>li, int k){
        if(k<=0 || k > li.size()){
            throw new IllegalArgumentException("Invalid value of k");
        }
        Collections.sort(li);
        return li.get(k-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>li = new ArrayList<>(n);
        int k = sc.nextInt();
        for(int i= 0; i<n; i++){
            li.add(sc.nextInt());
        }
        try{
            int kth = findKth(li, k);
            System.out.println(k+"-th smallest element is: "+kth);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
