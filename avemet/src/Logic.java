import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {
    public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double num = 0;
        double summ = 0;
        int i = 0;
        try {
            do {
                 num = Double.parseDouble(reader.readLine());
                summ += num;
                i++;
            } while (!reader.readLine().equals("stop"));
            if(reader.readLine().equals("stop")){
                System.out.println(summ/i);
            }
        }catch (Exception e){
            System.out.println(summ);
        }
    }
}
