import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {
    public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите числа: ");
        int insertedCount = Integer.parseInt(reader.readLine());

        float result = 0;

        for(int i = 0; i < insertedCount; i++) {
            float insertedNum = Float.parseFloat(reader.readLine());
            result += insertedNum;
        }
        System.out.println(result/insertedCount);
    }
}
