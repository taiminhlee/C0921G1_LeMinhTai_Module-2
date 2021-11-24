package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
      String str1="C0318G";
      String str2="M0318G";
        Pattern pattern=Pattern.compile("^([C|A|P])(\\d){4}(G|H|J|K|L){1}$");
        System.out.println(str1 +":"+pattern.matcher(str1).matches());
        System.out.println(str2 +":"+pattern.matcher(str2).matches());
    }
}
