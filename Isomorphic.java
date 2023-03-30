import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean findIsomorphicStrings(String s1, String s2) {
        HashMap s1Hash = new HashMap();
        HashMap s2Hash = new HashMap();
        String[] s1Arr = s1.split("");
        String[] s2Arr = s2.split("");
        boolean b = true;
        for (int i = 0; i < s1.length(); i++) {
            if ((s1Hash.get(s1Arr[i]) != null && !(s1Hash.get(s1Arr[i]).equals(s2Arr[i]))) || (s2Hash.get(s2Arr[i]) != null && !(s2Hash.get(s2Arr[i]).equals(s1Arr[i])))) {
                b = false;
                break;
            }
            s1Hash.put(s1Arr[i], s2Arr[i]);
            s2Hash.put(s2Arr[i], s1Arr[i]);
        }
        if (!b) {
            return b;
        } else {
            for (String x : s2Arr) {
                boolean c = x.equals(s1Hash.get(s2Hash.get(x)));
                b = b && c;
            }
            return b;
        }
    }

        public static void main (String[]args){
        System.out.println(findIsomorphicStrings("foo", "bar"));

        }
   }

