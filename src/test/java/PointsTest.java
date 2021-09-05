import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointsTest {
    private Points points;

    @BeforeEach
    private void init() {
        points = new Points();
    }

    private void addP1Score(int i) {
        for (int n = 0; n < i; n++) {
            points.intP1Score();
        }
    }

    private void addP2Score(int i) {
        for (int n = 0; n < i; n++) {
            points.intP2Score();
        }
    }

    @Test
    public void when_start_expect_love_all() {
        assertEquals("love all", points.calculateScore());
    }

    @Test
    public void when_1_to_1_expect_15_all() {
        points.intP1Score();
        points.intP2Score();

        assertEquals("15 all", points.calculateScore());
    }

    @Test
    public void when_2_to_2_expect_30_all() {
        addP2Score(2);
        addP1Score(2);

        assertEquals("30 all", points.calculateScore());
    }

    @Test
    public void when_3_to_3_expect_deuce() {
        addP2Score(3);
        addP1Score(3);

        assertEquals("deuce", points.calculateScore());
    }

    @Test
    public void when_1_to_0_expect_15_love() {
        points.intP1Score();

        assertEquals("15 love", points.calculateScore());
    }

    @Test
    public void when_2_to_0_expect_30_love() {
        addP1Score(2);

        assertEquals("30 love", points.calculateScore());
    }

    @Test
    public void when_2_to_3_expect_30_40() {
        addP1Score(2);
        addP2Score(3);

        assertEquals("30 40", points.calculateScore());
    }

    @Test
    public void when_4_to_4_expect_deuce() {
        addP1Score(3);
        addP2Score(3);
        points.intP1Score();
        points.intP2Score();

        assertEquals("deuce", points.calculateScore());
    }

    @Test
    public void when_5_to_5_expect_deuce() {
        addP1Score(3);
        addP2Score(3);
        points.intP1Score();
        points.intP2Score();
        points.intP1Score();
        points.intP2Score();

        assertEquals("deuce", points.calculateScore());
    }

}