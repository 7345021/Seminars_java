
// Список сотрудников некой фирмы хранится в виде, например, такой HashMap
// HashMap<Integer, ArrayList<String>> persons = new HashMap<>();
// где ключ - серия и номер паспорта сотрудника, а в списке хранятся его параметры
// 1) Написать метод, возвращающий всех однофамильцев (или тёзок)
// 2) Написать метод, возвращающий сотрудников, старше (младше) определенного 
// возраста
import java.util.*;
import java.util.stream.Collectors;


public class person {
    // HashMap<Integer, ArrayList<String>> data_persons = new HashMap<>();
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> data_persons = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Иванов");
        list.add("Иван");
        list.add("Иванович");
        list.add("59");
        data_persons.put(1014767895, list);
        // System.out.println(data_persons);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Петров");
        list1.add("Петр");
        list1.add("Петрович");
        list1.add("23");
        data_persons.put(230145555, list1);
        // System.out.println(data_persons);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Смирнов");
        list2.add("Виктор");
        list2.add("Сергеевич");
        list2.add("45");
        data_persons.put(341145673, list2);
        // // // System.out.println(data_persons);

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Иванов");
        list3.add("Юрий");
        list3.add("Олегович");
        list3.add("38");
        data_persons.put(230145678, list3);
        // System.out.println(data_persons);

        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("Костин");
        list4.add("Сергей");
        list4.add("Иванович");
        list4.add("89");
        data_persons.put(830145678, list4);
        System.out.println(data_persons);

        for (ArrayList<String> value : data_persons.values()) {
             System.out.println(value);
        }
    
    }
    
}
