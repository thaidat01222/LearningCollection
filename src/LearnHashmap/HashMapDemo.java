package LearnHashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

// phan biet ham hashCode
// phan biet ham equals
// phan biet ham toString
//
public class HashMapDemo  {
    public static void main(String[] args) {
        //<> goi la generics
        // class
        // hocsinhA -> 9.8
        // hocsinhB -> 5.5
        HashMap<String, Float> scoreMap = new HashMap<>();
        /*scoreMap.remove("hocsinhA");
        float hsA = scoreMap.get("hocsinhA");
        scoreMap.replace("hocsinhA",9.7f);
        scoreMap.values() => "collection : 9.8 , 5.5";
        scoreMap.keySet(); // (hocsinhA,hocsinhB)
        Float f = scoreMap.getOrDefault("hocsinhC",0.0f);
        if (!scoreMap.containsKey("hocsinhA")){
            scoreMap.put("hocsinhA",10.0f);
        }
        scoreMap.putIfAbsent("hocsinhA",10f);*/
        scoreMap.put("A", 10f);
        scoreMap.put("B", 7f);
        scoreMap.put("C", 5f);
        scoreMap.remove("B");
//        scoreMap.replace("A", 9.8f);
        scoreMap.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("key = " + s + ", value = " + scoreMap.get(s));
            }
        });

        List<Score> scoreList = new ArrayList<>();
        Score scoreA = new Score("A", 10f);
        Score scoreB = new Score("B", 7f);
        Score scoreC = new Score("C", 5f);
        scoreList.add(scoreA);
        scoreList.add(scoreB);
        scoreList.add(scoreC);
        for (int i = 0 ; i < scoreList.size(); i++){
            Score score = scoreList.get(i);
            if (score.name.equals("A")){
                System.out.println(score.score);
            }
        }
        float diemCuaA = scoreMap.get("A");
        System.out.println(diemCuaA);
    }
}

class Score {
    String name;
    float score;

    Score() {
        //default constructor
        System.out.println("goi vao ham khoi tao rong!!!");
    }

    Score(String name, float score){
        this.name = name;
        this.score = score;
        System.out.println("goi vao ham khoi tao co value!!!");
    }
    //signature tham so dau vao

}
