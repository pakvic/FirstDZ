import java.util.Random;

public class MathClass {

    void randomMass() {

        int[] random = new int[20];
        Random r = new Random();
        double middle = 0;
        int maxNumber = 0;


        for (int i = 0; i < random.length; i++) {
//            random[i] = ((int) (Math.random() * 10));
              random[i] = r.nextInt();

            middle = middle + random[i];
        }
        int minNumber = random[0];

        for (int i = 0; i < random.length; i++) {
            if (maxNumber <= random[i]) {
                maxNumber = random[i];
            }

//           minNumber=Math.min(minNumber, random[i]);

           if (minNumber >= random[i]) {
               minNumber = random[i];
           }
        }

            middle = middle / random.length;
            System.out.println("Middle value  " + middle);
            System.out.println("Max value   " + maxNumber);
            System.out.println("Min value  " + minNumber);

    }
}