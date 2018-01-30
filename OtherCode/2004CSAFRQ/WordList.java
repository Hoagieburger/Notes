/**
 * 2004 AP CSA FRQ
 *
 * @author Joshua Hergenroeder
 * @version 22 January 2018
 */
import java.util.ArrayList;
import java.util.List;
public class WordList
{
    private ArrayList<String> myList;
    public WordList(){
        myList = new ArrayList();
    }
    public WordList(int x){
        myList = new ArrayList();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
    }
    public int numWordsOfLength(int len){
        int count = 0;
        for (String i : myList){
            if (i.length() == len){
                count++;
            }
        }
        return count;
    }
    public void removeWordsOfLength(int len){
        for (int i = myList.size() - 1; i >= 0; i--){
            if (myList.get(i).length() == len){
                myList.remove(i);
            }
        }
    }
}