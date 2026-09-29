import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void countFreq(){
        String input="aabbcc";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);

        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
