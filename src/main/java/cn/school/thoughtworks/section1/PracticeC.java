package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> mapValue = collection2.get("value");
        List<String> result = new LinkedList<String>();
        for(String s : collection1){
            if(mapValue.contains(s)){
                result.add(s);
                System.out.println(s);
            }
        }
        return result;
    }
}
