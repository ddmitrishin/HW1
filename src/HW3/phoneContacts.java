package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class phoneContacts {

    private static HashMap<String, String> pb = new HashMap<String, String>();
    private String name;
    private String phoneNumber;

    public static void addPB(String phoneNumber, String name) {
        pb.put(phoneNumber, name);
    }

    public static void printAllPhonebook() {
        for (Map.Entry<String, String> o : pb.entrySet()) {
            System.out.println(o.getValue() + ": " + o.getKey());
        }
    }

    public static String[] getPhoneNumber(String name) {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (name.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) result.add("Aбонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    public static void getContact(String name){
        System.out.println("2. " + name + " имеет номер(а) телефона(ов): " + Arrays.toString(getPhoneNumber(name)));
    }

    public phoneContacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
