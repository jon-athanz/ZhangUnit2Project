public class LinearEquation {

    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        double distance = Math.round((Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2))) / 100.0) * 100.0;
        return distance;
    }

    public double yIntercept() {
        double yIntercept = Math.round((y1 - (slope() * x1)) / 100.0) * 100.0;
        return yIntercept;
    }

    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return slope;
    }

    public String equation() {
        if (slope() == 0) {
            String equation = "y = " + yIntercept();
            return equation;
        } else {
            if (yIntercept() < 0) {
                String equation = "y = " + slope() + "x - " + Math.abs(yIntercept());
                return equation;
            } else {
                String equation = "y = " + slope() + "x + " + yIntercept();
                return equation;
            }
        }
    }

    public String coordinateForX(double xValue) {
        String xcoord = xValue + "";
        double yValue = (xValue * slope()) + yIntercept();
        String ycoord = yValue + "";
        String coordinate = "(" + xcoord + ", " + ycoord + ")";
        return coordinate;
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound);
    }

    public String lineInfo() {
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these two points is: " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of the line is: " + yIntercept();
        info += "\nThe distance between the two points is: " + distance();
        return info;
    }
}





