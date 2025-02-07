import static com.edataconsulting.refactoring.Trip.calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void t() {
        double d1 = 120;
        double d2 = 80;
        double s1 = 60;
        double s2 = 40;
        double[] dis = {d1, d2};
        double[] s = {s1, s2};
        double[] p = {10};
        int night = 1;

        double r = calculate(dis, s, p, night);

        assertEquals(15, r);
    }

}
