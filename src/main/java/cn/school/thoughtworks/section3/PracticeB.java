package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> value = object.get("value");
        for (String key: value) {
            updateValue(collectionA, key);
        }
        return collectionA;
    }

    private void updateValue(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, calKey( collectionA.get(key) ));
    }

    private int calKey(int key){
        int count = key/3;
        return key-count;
    }


}
