package pl.vistula;

import java.io.*;

class DataManagement{
    String BhavyaShah56255 ;
    void ReadDataShah56255() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        BhavyaShah56255=tv.readLine();
    }
    void WriteDataToShah56255File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(BhavyaShah56255);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    void readDataViaShah56255File(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataViaShah56255File();
        obj.WriteDataToShah56255File();
        System.out.println();
        obj.ReadDataShah56255();
    }

}
