package Mentor.lesson6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // как проверить email на валидность


        public static void main(String[] args) {

            final String string = "kjhkjh@sdfdsf.sdf";
            Pattern pattern = Pattern.compile("^[A-Z0-9%&*_(-).]+@[A-Z0-9._(-)]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(string);

            if (matcher.matches()){
                System.out.println("email is valid");
            } else {
                System.out.println("email not valid");
            }



            }
        }

