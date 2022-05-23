package vistula.nikhil50291;



import java.io.*;

class DataManagement{
    String NikhilChoudhary50291;
    void ReadDataChoudhary50291() throws IOException {
        BufferedReader tv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Please Input Your Full Name");
        NikhilChoudhary50291 =tv.readLine();
    }
    void WriteDataToChoudhary50291File(){
        try(FileWriter ts = new FileWriter("task4.txt")) {
            ts.write(NikhilChoudhary50291);
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
    void readDataViaChoudhary50291File(){
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
        obj.readDataViaChoudhary50291File();
        obj.WriteDataToChoudhary50291File();
        System.out.println();
        obj.ReadDataChoudhary50291();
    }

}
