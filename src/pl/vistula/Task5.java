package pl.vistula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String []args) throws IOException {
        System.out.println("Please input the first three digits of your bank account:");
        BufferedReader tf = new BufferedReader(new InputStreamReader(System.in));
        String digits= tf.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("Searching ...");
            while((line= br.readLine())!=null){
//                System.out.println(line);
                // Putting Data into an array
                String[] words=line.split("\\t+");
                String bankNumberBhavyaShah56255=words[0].trim();
                String bankNameBhavyaShah56255=words[1].trim();
                if(bankNumberBhavyaShah56255.equals(digits)){
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " +bankNumberBhavyaShah56255 + "\nBank Name : " +bankNameBhavyaShah56255);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Information Loading Failed");
        }

    }
}

