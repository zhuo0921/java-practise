package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String s : collectionA) {
            if (s.indexOf( '-' ) != -1) {
                int mid = s.indexOf( '-' );
                String key = s.substring( 0, mid );
                int value = Integer.valueOf( s.substring( mid + 1, s.length() ) );

                if (result.containsKey( key )) {
                    int v = result.get( key ) + value;
                    result.put( key, v );
                } else {
                    result.put( key, value );
                }
            } else {
                if (result.containsKey( s )) {
                    int v = result.get( s ) + 1;
                    result.put( s, v );
                } else {
                    result.put( s, 1 );
                }
            }
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
