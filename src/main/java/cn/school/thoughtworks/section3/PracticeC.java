package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Set<String> collection = new HashSet<>( collectionA );
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection) {
            Integer count = Collections.frequency( collectionA, s );
            result.put( s, count );
        }
        List<String> value = object.get("value");
        for (String key: value) {
            updateValue(result, key);
        }
        return result;
    }

    private void updateValue(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, calKey( collectionA.get(key) ));
    }

    private int calKey(int key){
        int count = key/3;
        return key-count;
    }
}
