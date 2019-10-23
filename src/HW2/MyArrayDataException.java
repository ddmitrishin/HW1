package HW2;

public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException(int i, int j){
        super("Суммирование невозможно! В массиве содержится символ. Замените символ под индексом " + "[" + i + "]" + "[" + j + "]");
    }

}
