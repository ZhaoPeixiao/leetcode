import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
public class Convert {
    public static String toPackage(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i ++){
            if (string.charAt(i) == ' ' || string.charAt(i) == '-'){
                continue;
            } else if (Character.isUpperCase(string.charAt(i))) {
                char c = Character.toLowerCase(string.charAt(i));
                stringBuilder.append(c);
            }else{
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String toClass(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i ++){
            if (string.charAt(i) == ' ' || string.charAt(i) == '-'){
                continue;
            } else{
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(toPackage(string));
        System.out.println(toClass(string));
    }
}
