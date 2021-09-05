public class Points {
    private int p1;
    private int p2;

    public Points() {
        p1 = 0;
        p2 = 0;
    }

    public void intP1Score() {
        p1++;
    }

    public void intP2Score() {
        p2++;
    }

    public String calculateScore() {
        if (p1 == p2) {
            if (p1 >= 3) {
                return Constants.DEUCE;
            } else {
                return Constants.pointsMap.get(p1) + " " + Constants.ALL;
            }
        } else {
            if (p1 <= 3 && p2 <= 3) {
                return Constants.pointsMap.get(p1) + " " + Constants.pointsMap.get(p2);
            } else {
                if (p1 > p2) {
                    return Constants.ADVANTAGE + " " + Constants.PLAYER1NAME;
                } else {
                    return Constants.ADVANTAGE + " " + Constants.PLAYER2NAME;
                }
            }
        }
    }
}
