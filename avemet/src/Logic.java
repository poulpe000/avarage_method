import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {
    public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите числа: ");

        float result = 0;
        if(!reader.equals("stop")) {
            do {
                float insertedNum = Float.parseFloat(reader.readLine());
                result += insertedNum;
            } while (!reader.equals("stop"));
        }
        else System.out.println(result);
    }
}
