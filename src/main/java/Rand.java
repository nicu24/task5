import java.util.Random;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Rand {
    int[] Vector1;
    int[] Vector2;
    int sum = 0;
    Logger LOGGER = Logger.getLogger(Rand.class);

    Rand(int V1[], int V2[], int sum) {
        Vector1 = V1;
        Vector2 = V2;
        this.sum = sum;
    }

    public int Return_Random() {
        int V3[] = new int[sum];
        Random random = new Random();
        int c = 0;
        int s=0;

        for (int i = 0; i < Vector1.length; i++) {
            for (int j = 0; j < Vector2[i]; j++) {
                V3[c] = Vector1[i];
                c++;
            }
        }

        for (int i = 0; i < sum; i++) {

            LOGGER.log(Level.INFO," " + V3[i]);
        }


        int r = random.nextInt(this.sum);

        LOGGER.log(Level.INFO," Selected number from vector: " + V3[r]);
        return V3[r];
    }



}