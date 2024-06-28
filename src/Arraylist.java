import java.util.*;
public class Arraylist {
    public static void main(String args[]) {
        ArrayList x= new ArrayList();
        x.add(10);
        x.add(20);

        x.add(1,"satyam");


        x.add(true);
        x.add(4.37);
        System.out.println(x);

        System.out.println(x.get(2));

        x.remove(1);

        System.out.println( x.size());

        System.out.println(x);

        Iterator  itr = x.iterator();

        // Using the Iterator to traverse the list
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        // i want to store only integer values then i can use generics

        ArrayList<Integer> y= new ArrayList <Integer>();
        y.add(10);
        y.add(20);
        //  y.add(4.37); - this will give error
        System.out.println(y);
        y.addAll(2,x);
        System.out.println(y);

        if(x.contains(10)){
            System.out.println("yes present");
        }else{
            System.out.println("not present" );
        }



    }
}
