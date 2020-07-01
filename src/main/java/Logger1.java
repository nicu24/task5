import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Logger1 {
    public static void main(String[] args) {
        //TEST LOGGER
        int a=0;
        int b=3;
        int c=0;

        Logger LOGGER = Logger.getLogger(Logger1.class);

        try{
            c=b/a;

        }catch (ArithmeticException e)
        {
            LOGGER.error(e);
        }


        /// Task
        int V1[] = {1,2,3};
        int V2[] = {1,2,10};
        int sum = 0;

        for (int i = 0; i < V2.length; i++) {
            sum=sum+V2[i];
        }


        Rand R = new Rand(V1,V2,sum);

        R.Return_Random();

    }
}
