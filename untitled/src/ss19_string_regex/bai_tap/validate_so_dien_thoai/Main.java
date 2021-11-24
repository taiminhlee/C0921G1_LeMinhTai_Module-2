package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1="(84)-(0978489648)";
        String str2="(a8)-(22222222)";
        Pattern pattern=Pattern.compile("^\\(\\d{2}\\)\\-\\((0)\\d{9}\\)$");
        System.out.println(str1 +":"+pattern.matcher(str1).matches());
        System.out.println(str2 +":"+pattern.matcher(str2).matches());
    }
}
