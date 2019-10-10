package HW2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super("В массиве содержится символ. Суммирование невозможно!");

    }

}
