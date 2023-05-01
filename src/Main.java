import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1:");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) System.out.print(nums.get(i) + " ");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2:");
        Set<Integer> numbers = new HashSet<>();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (!numbers.contains(i)) {
                if(nums.get(i) % 2 == 0) {
                    numbers.add(nums.get(i));
                }
            }
        }
        System.out.println(numbers);
    }
    public static void task3() {
        System.out.println("Задача 3:");
        List<String> words = new ArrayList<>(List.of("I","He","She","It","I","It"));
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void task4() {
        System.out.println("Задача 4:");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s + " встречается " + map.get(s) + " раз");
        }
    }
}