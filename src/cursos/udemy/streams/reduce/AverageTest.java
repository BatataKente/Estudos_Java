package curso.streams.reduce;

import javax.print.attribute.standard.Media;

public class AverageTest {
    public static void main(String[] args) {
        Average average = new Average();
        average
                .add(8.3)
                .add(6.7)        ;
        System.out.println(average);
    }
}
