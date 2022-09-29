https://regex101.com/
// как проверить email на валидность
public class task1 {
public static void main(String[] args) {
String text = "kjhkjh@sdfdsf.sdf";
Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
if (matcher.matches()){
System.out.println("email is valid");
} else {
System.out.println("email not valid");
}
