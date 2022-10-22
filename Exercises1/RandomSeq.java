import java.util.Random;

class RandomSeqAB {
    // generate num number of natural number between st and end
    public void generate(int st, int end, int num) {
        while (num > 0) {

            int r = (int) (Math.random() * (end - st + 1) + st);
            System.out.print(r + " ");
            num--;
        }

    }
}

class RandomSeqLotto {

    public void generate() {

        int i = 0;
        Random rnd = new Random();
        while (i < 6) {

            int r = rnd.nextInt(49);
            System.out.print(r + " ");
            i++;
        }
    }
}

public class RandomSeq {

    public static void main(String[] args) {
        int i = 0;
        Random rnd = new Random();
        // generate 5 random real number from 0 to 10
        while (i < 5) {

            Double d = rnd.nextDouble();
            System.out.printf("%.2f\n", d * 10);
            i++;
        }
        // RandomSeqAB rndsq = new RandomSeqAB();
        // rndsq.generate(Integer.valueOf(args[0]), Integer.valueOf(args[1]),
        // Integer.valueOf(args[2]));
        RandomSeqLotto rl = new RandomSeqLotto();
        rl.generate();

    }
}
