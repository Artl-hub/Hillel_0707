package Lessons.lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapExmlp {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Alex", "24.07.1989");
        myHashMap.put("Sasha", "02.09.1999");
        myHashMap.put("Dima", "04.03.1979");

        System.out.println("Do we have 24.07.89 ? : " + myHashMap.containsValue("24.07.89"));
        System.out.println("Do we have 24.07.89 ? : " + myHashMap.containsValue("24.07.89"));

        System.out.println(myHashMap.size());

//        System.out.println("Do we have Alex? : " + myHashMap.containsKey("Alex"));

//        System.out.println("Valu for key Alex - " + myHashMap.get("Alex"));
//
//
//        System.out.println("Map before deleting :");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()){
//            System.out.println(i.getKey() + " - " + i.getValue());
//
//        }
//
//        myHashMap.remove("Dima")
//
//        System.out.println("Map after deleting :");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()){
//            System.out.println(i.getKey() + " - " + i.getValue());
//
//        }

    }
}
