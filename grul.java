import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class grul {
    public static final  String  URL= "^(http?:\\/\\/[a-z]+@[a-z].{6}\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})$";
    private static final Pattern URL_PATTERN = Pattern.compile(URL);
    public static boolean urlValidator(String url)
    {
        if (url == null) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args){
        String url = "http://rosales@rosales/www.palcam.pa.com";
        if (urlValidator(url))
            System.out.print("La url dada " + url + " es válida");
        else
            System.out.print("La url dada " + url + " no es válida");

   }
}
