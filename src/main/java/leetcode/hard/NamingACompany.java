package leetcode.hard;

public class NamingACompany {
    public static long distinctNames(String[] ideas) {
        long count = ideas.length * (ideas.length-1);
        for (int i = 0 ; i < ideas.length ; i++){
            for (int j = i+1 ; j < ideas.length ; j++){
                if(ideas[i].charAt(0) == ideas[j].charAt(0)){
                    count = count - 2;
                }else if (ideas[i].substring(1,ideas[i].length()).equals(ideas[j].substring(1,ideas[j].length()))){
                    count = count - 2;
                }else {
                    String str1 = ideas[i].substring(0,1).concat(ideas[j].substring(1,ideas[j].length()));
                    String str2 = ideas[j].substring(0,1).concat(ideas[i].substring(1,ideas[i].length()));
                    for (int k = 0 ; k < ideas.length ; k++){
                        if (k != i && k != j && (str1.equals(ideas[k]) || str2.equals(ideas[k]))){
                            count = count - 2;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String [] a = {"aaa","baa","caa","bbb","cbb","dbb"};
        System.out.println(distinctNames(a));
    }
}
