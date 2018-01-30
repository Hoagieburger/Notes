/**
 * Well documented (atleast for me) notes on modifying arrays.
 *
 * @author Joshua Hergenroeder
 * @version 18 January 2018
 */
public class ModArrays
{
    int[] array = {1, 2, 3, 4, 5, 6};
    public ModArrays(){
        //We need a blank constructor to access the array
    }
    public void printArray(){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void changeNum(int num, int index){
        /**
         * If I call this method, it should change the array.
         * 
         * @param num The new number to be added.
         * @param index Where the new number is to be placed.
         */
        array[index] = num;
    }
    public void remove(int index){
        /**
         * If I call this method, it will move the values down (1 -> 0) beginning with the given index and add a zero at the end.
         * 
         * @param index The index that will be removed.
         */
        for (int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }
    public void addNum(int num, int index){
        /**
         * If I call this method, it will move the values after and including the index up (0 -> 1) and place the number in the index.
         * 
         * @param num The number to be placed.
         * @param index The index the number will be placed into.
         */
        for (int i = array.length - 1; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = num;
    }
}