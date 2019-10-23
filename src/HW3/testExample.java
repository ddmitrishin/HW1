package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class testExample {

    private static final String[] charArray = new String[]
            {"a", "b", "c", "a", "g", "d", "c", "b", "t", "y", "g", "d", "k", "a"};

    public static void main(String[] args) {

        // 1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.

        toShowUniqChar();

        //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи.
        // С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        // Добавляем контакты в телефонный справочник

        phoneContacts.addPB("89121234567", "Ivanov");
        phoneContacts.addPB("89122132455", "Petrov");
        phoneContacts.addPB("89127834234", "Sydorov");
        phoneContacts.addPB("89124356723","Klimov" );
        phoneContacts.addPB("89124359787","Ivanov" );
        phoneContacts.addPB("89121987456","Semenov" );
        phoneContacts.addPB("891276954623","Ivanov" );
        phoneContacts.addPB("891298054343","Prutov" );
        phoneContacts.addPB("891233333333","Vishnev" );
        phoneContacts.addPB("891255555555","Titov" );
        phoneContacts.addPB("891254353454","Titov" );

        // Ищем номер телефона по фамилии
        phoneContacts.getContact("Ivanov");

        // phoneContacts.printAllPhonebook(); - метод для вывода всей телефонной книги



    }

    private static void toShowUniqChar() {
        ArrayList<String> charList = new ArrayList<String>(Arrays.asList(charArray));
        HashMap<Object, Integer> findUniqCharlist = new HashMap<>();
        toFindUniq(charList, findUniqCharlist);

    }

    private static void toFindUniq(ArrayList charList, HashMap<Object, Integer> findUniqCharlist) {
        Integer i;
        for (Object let : charList){
            i = findUniqCharlist.get(let);
            if(i == null) findUniqCharlist.put(let, 1);
            else findUniqCharlist.put(let, i + 1);
        }
        System.out.println("1. Вывод символов и их колличества повторений: " + findUniqCharlist);
    }

}
