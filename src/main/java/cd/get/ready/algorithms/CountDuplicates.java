package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        Map<String, Integer> duplicates = new HashMap<String, Integer>();
        for (String i : input) {
            if (duplicates.containsKey(i)) {
                duplicates.put(i, duplicates.get(i) + 1);
            } else
                duplicates.put(i, 1);
        }
        return duplicateLetters(duplicates);
    }
    private Integer duplicateLetters(Map <String, Integer> map) {
        int result = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result++;
            }
        }

        return result;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        Map<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
        for (Integer i : input) {
            if (duplicates.containsKey(i)) {
                duplicates.put(i, duplicates.get(i) + 1);
            } else
                duplicates.put(i, 1);
        }
        return duplicateNumbers(duplicates);
    }
    private Integer duplicateNumbers(Map <Integer, Integer> map){
        int result = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                result++;
            }
        }

        return result;
    }
}
