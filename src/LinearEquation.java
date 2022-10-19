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
        double slope = Math.round((y2 - y1) / (x2 - x1) / 100.0) * 100.0;
        return slope;
    }

}





