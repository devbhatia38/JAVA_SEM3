package practical_3;

public class Driver {
    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            int result = Integer.hashCode(x);
            result = 31 * result + Integer.hashCode(y);
            return result;
        }
    }

    public static void main(String[] args) {
        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(5, 6),
            new Point(1, 2),
            new Point(3, 4)
        };

        int distinct = 0;

        for (int i = 0; i < points.length; i++) {
            boolean appeared = false;
            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    appeared = true;
                    break;
                }
            }
            if (!appeared) {
                distinct++;
            }
        }

        System.out.println("Distinct: " + distinct);
    }
}