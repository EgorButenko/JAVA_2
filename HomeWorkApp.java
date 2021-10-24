/**
Java 2 Home Work 2
@author Egor Butenko
@version 24.10.2021
*/

public class HomeWorkApp{
    
    public static void main(String[] args){
        
        
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                                    {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arr1 = new String[][]{{"1", "2", "3", "4"},{"5", "6", "7", "8"},
                                    {"9", "10", "11", "12"}};
        String[][] arr2 = new String[][]{{"1", "2", "3", "Q"}, {"5", "6", "7", "8"},
                                    {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try{
            System.out.println(method(arr));
        }catch(MyArraySizeException e){
            System.out.println("Размер массива задан неправильно. Задайте массив размером 4 х 4.");
        }catch(MyArrayDataException e){
            System.out.println("Невозможно произвести сложение. Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        
        try{
            System.out.println(method(arr1));
        }catch(MyArraySizeException e){
            System.out.println("Размер массива задан неправильно. Задайте массив размером 4 х 4.");
        }catch(MyArrayDataException e){
            System.out.println("Невозможно произвести сложение. Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        
        try{
            System.out.println(method(arr2));
        }catch(MyArraySizeException e){
            System.out.println("Размер массива задан неправильно. Задайте массив размером 4 х 4.");
        }catch(MyArrayDataException e){
            System.out.println("Невозможно произвести сложение. Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int summ = 0;
        
        if(arr.length != 4){
            throw new MyArraySizeException();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length != 4){
            throw new MyArraySizeException();
            }
            for(int j = 0; j < arr.length; j++){
                try{
                    summ += Integer.parseInt(arr[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
                
            }
        }
        return summ;
    }
}
