package pl.comarch.szkolenia.funkcyjny.wartosc.opcjonalna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        /*List<Integer> result = new ArrayList<>();
        for(Integer i : list) {
            if(i > 3 && i < 7 && !result.contains(i)) {
                result.add(i);
            }
        }
        System.out.println(result);*/

        List<Integer> resutl = list.stream()
                .distinct()
                .filter(x -> x > 3 && x < 7)
                .toList();
        System.out.println(resutl);
    }
}
