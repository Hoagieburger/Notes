/**
 * Well documented (for me) notes on ArrayLists.
 *
 * @author Joshua Hergenroeder
 * @version 18 January 2018
 */
import java.util.ArrayList;
import java.util.List; // This is an interface and not a class
import java.util.Scanner;
import java.lang.Integer;
public class ArrList
{
    ArrayList<Object> list;
    public ArrList(){
        list = new ArrayList();
        list.add("Hot pocketss");
        list.add("Cookies");
        list.add("Salt...Wait, it's called ramen");
        list.add(new Scanner(System.in));
        list.add(new Integer(2));
        System.out.println(list.size());
    }
    
    public void printList(){
        System.out.println("Your shopping list contains:");
        System.out.println();
        for(Object i : list){
            System.out.println(i);
        }
    }
}