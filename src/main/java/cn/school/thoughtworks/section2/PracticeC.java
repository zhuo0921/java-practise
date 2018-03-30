package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String,Integer>();
        for(String s : collection1){
            if(s.indexOf('-') != -1){
                int mid = s.indexOf('-');
                String key = s.substring(0, mid);
                int value = Integer.valueOf(s.substring(mid+1, s.length()));
                if(result.containsKey(key)){
                    int v = result.get(key) + value;
                    result.put(key, v);
                }else{
                    result.put(key, value);
                }

            }else if(s.indexOf(':') != -1){

                int mid = s.indexOf(':');
                String key = s.substring(0, mid);
                int value = Integer.valueOf(s.substring(mid+1, s.length()));
                if(result.containsKey(key)){
                    int v = result.get(key) + value;
                    result.put(key, v);
                }else{
                    result.put(key, value);
                }

            }else if(s.indexOf('[')!=-1){

                int start = s.indexOf('[');
                int end = s.indexOf(']');
                String key = s.substring(0, start);
                int value = Integer.valueOf(s.substring(start+1, end));
                if(result.containsKey(key)){
                    int v = result.get(key) + value;
                    result.put(key, v);
                }else{
                    result.put(key, value);
                }

            }
            else{
                if(result.containsKey(s)){
                    int v = result.get(s) + 1;
                    result.put(s, v);
                }else{
                    result.put(s, 1);
                }
            }
        }
        return result;
    }
}
