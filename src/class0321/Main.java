
package class0321;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Main {
    interface MyFunction{
        int call(int x, int y);
        
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int deohagi(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IntBinaryOperator func = Main::add;
        MyFunction deohagiFunction = Main::add;
        MyFunction deohagiFuncion2 = Main::deohagi;
        //lamda expression
        MyFunction addFunction2 = (int a, int b) -> {
            return a + b;
            };
        MyFunction gophagi = (int a, int b) -> {
            return a * b;
        };
        int result2 = deohagiFunction.call(10,20);
        int result = func.applyAsInt(10,5);
        result = gophagi.call(10, 20);
        
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        //filter 주어진 조건에 매치하는 애들만 남김
        nums.stream()
        .filter((num) -> num % 2 == 0) //거르기
        .map((num) -> num + "번") //변환 앞(int) 뒤(Stirng)
        .forEach((num) -> System.out.println(num + 1)); //무지성 뺑뺑이
        
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i) + 1);     // + 1
            }
        }
        List<String> names = new ArrayList<>();
        names.add("박경덕");
        names.add("박준하");
        names.add("이동학");
        names.add("박태현");
        
        List<String> parks = getParkList(names);
        System.out.println(parks);
        //System.out.println(names.stream().filter(name -> name.startsWith("박")).collect(null));
    }
    
    public static List<String> getParkList(List<String> names) {
        
        List<String> results = new ArrayList<>();
        for(String name : names) {
            if(name.startsWith("박")) {
                results.add(name);
            }
        }
        
        names.stream().filter(name -> name.startsWith("박"))
            .collect(Collectors.toList());
        
        return results;
    }
    
    

}
