import java.util.*;

public class Main {
    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        String first = new_id.toLowerCase();
        System.out.println(first);

        String[] fs = ("" + first).split("");
        System.out.println(Arrays.toString(fs));

        ArrayList<String> second = new ArrayList<>();
        Collections.addAll(second, fs);
        System.out.println(second);
        second.removeAll(Arrays.asList("~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "{", "]", "}", ":", "?", ",", "<", ">", "/"));
        System.out.println(second);

        System.out.println(second.get(0));
        System.out.println(second.get(1));
        System.out.println(second.get(2));

        for (int j = 0; j < second.size() - 1; j++) {
            while (second.get(j).equals(".") && second.get(j).equals(second.get(j + 1))) {
                second.remove(j);
            }
        } // 여기서 while을 안 넣어주면 중복 발생 가능성 있음.

        System.out.println(second);

        if (second.get(0).equals(".")) {
            second.remove(0);
        }

        if (second.get(second.size()-1).equals(".")) {
            second.remove(second.size()-1);
        }

        System.out.println(second);

        if (second.size() == 0) {
            second.add("a");
        }

        System.out.println(second);

        if (second.size() >= 15) {
            while (second.size() > 15) {
                for (int k = 15; k <= second.size() - 1; k++) {
                    second.remove(k);
                }
            }
        }

        System.out.println(second);

        if (second.get(second.size()-1).equals(".")) {
            second.remove(second.size()-1);
        }

        System.out.println(second);

        while (second.size() <= 2) {
            second.add(second.get(second.size()-1));
        }

        System.out.println(second);

        String new_id_final = String.join("", second);
        System.out.println(new_id_final);

    }

}
