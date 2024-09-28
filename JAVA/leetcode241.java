import java.util.*;

public class leetcode241 {
    public List<Integer> diffWays(String exp){
        Map<String, List<Integer>> memo = new HashMap<>();
        return compute(exp,memo);
    }

    private List<Integer> compute(String exp, Map<String, List<Integer>> memo){
        if(memo.containsKey(exp)){
            return memo.get(exp);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                List<Integer> leftResults = compute(exp.substring(0, i), memo);
                List<Integer> rightResults = compute(exp.substring(i+1), memo);

                for(int left : leftResults){
                    for(int right : rightResults){
                        if(c == '+'){
                            result.add(left+right);
                        }if(c == '-'){
                            result.add(left-right);
                        }if(c == '*'){
                            result.add(left*right);
                        }
                    }
                }
            }
        }

        if(result.isEmpty()){
            result.add(Integer.parseInt(exp));
        }

        memo.put(exp, result);
        return result;
    }
}

