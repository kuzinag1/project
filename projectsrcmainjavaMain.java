import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Joe");
        list.add("bob");
        list.add("alice");
        list.add("dEN");

        System.out.println(numberOfRepeat(list));
    }

    public static String numberOfRepeat(ArrayList<String> list){
        TreeMap<String, Integer> namesList = new TreeMap<>();
        for (String element: list){
            int count = 1;
            String name = Character.toUpperCase(element.charAt(0)) + element.substring(1).toLowerCase();
            if (namesList.containsKey(name)){
                count = namesList.get(name)+1;
            }
            namesList.put(name,count);
        }

        String result = "";
        for (String key: namesList.keySet()){
            result += key + " : " + namesList.get(key) + "\n";
            //System.out.println(key + " : " + namesList.get(key));
        }
        return  result.trim();
    }

}
