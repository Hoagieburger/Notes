/**
 * Methods for sorting including bubble sort, insertion sort, and selection sort.
 *
 * @author Joshua Hergenroeder
 * @version 25 January 2018
 */
public class Sorting
{
    int[] list = {5,4,2,3,0,7,9,8,6,1};
    int holder, pos;
    public void bubbleSort(){
        for (int i = list.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (list[j] > list[j + 1]){
                    int holder = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = holder;
                }
                printList();
            }
        }
    }
    public void insertionSort(){
        for (int i = 1; i < list.length; i++){
            pos = i;
            holder = list[i];
            while (pos > 0 && holder < list[pos - 1]){
                pos--;
            }
            for (int j = i; j > pos; j--){
                list[j] = list[j - 1];
            }
            list[pos] = holder;
            printList();
        }
    }
    public void selectionSort(){
        for (int i = 0; i < list.length - 1; i++){
            holder = list[i];
            pos = i;
            for (int j = i + 1; j < list.length; j++){
                if (holder > list[j]){
                    holder = list[j];
                    pos = j;
                }
            }
            for (int k = pos; k > i; k--){
                list[k] = list[k - 1];
            }
            list[i] = holder;
            printList();
        }
    }
    public void printList(){
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }
    public void scramble(){
        list[0] = 5;
        list[1] = 4;
        list[2] = 2;
        list[3] = 3;
        list[4] = 0;
        list[5] = 7;
        list[6] = 9;
        list[7] = 8;
        list[8] = 6;
        list[9] = 1;
        printList();
    }
}