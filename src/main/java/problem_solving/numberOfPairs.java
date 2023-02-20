package problem_solving;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class numberOfPairs {
    public static long taskOfPairing(List<Long> freq) {
        long count = 0;
        long countleft = 0;
        int i = 0;
        while (i < freq.size()){
            if (freq.get(i) % Long.valueOf(2) == 0){
                count += freq.get(i) / Long.valueOf(2);
                countleft = 0;
            }else if (freq.get(i) % Long.valueOf(2) != 0) {
                long div = freq.get(i) + countleft;
                if (div % Long.valueOf(2) == 0) {
                    count += div / Long.valueOf(2);
                    countleft = 0;
                } else {
                    count += (div - Long.valueOf(1)) / Long.valueOf(2);
                    countleft = 1;
                }
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        List <Long> list = new ArrayList<>();
        list.add(Long.valueOf(3));
        list.add(Long.valueOf(5));
        list.add(Long.valueOf(4));
        list.add(Long.valueOf(3));

        System.out.println(taskOfPairing(list));
    }
}
