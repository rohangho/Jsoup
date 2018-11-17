import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Scanner;

public class CountTimes {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Enter the url"+" Example : https://en.wikipedia.org/wiki/Google");
        String b=sc.nextLine();
        System.out.println();
        int c = 0;
        Document document;
        System.out.println("loading..");
        try {
            //Get Document object after parsing the html from given url.
            document = Jsoup.connect(b).get();
            String text = document.text();//Convert the content of url to a String
            String[] split = text.split("\\s+");//Use of regex to split using space
            //System.out.println(text);

            for (int i = 0; i < split.length; i++) {

                if (split[i].equals(a))
                    c = c + 1;//counter
            }
            System.out.println(c);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
