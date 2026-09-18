import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void mostFrequent() {
        int[] arr = {1, 3, 3, 2, 3, 4, 3, 2};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
int maxFrequent=0;
        int mostFrequent=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
            if (entry.getValue() > maxFrequent) {
                maxFrequent = entry.getValue()
                ;
                mostFrequent = entry.getKey();

            }
        }
            System.out.println("Most Frequent Element: " + mostFrequent);
            System.out.println("Frequency: " + maxFrequent);
            }
        }
