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
    } // Initializing Instance Variables

    public double distance() {
        double distance = (Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2)));
        return roundedToHundredth(distance);
    } // returns the distance between the two points

    public double yIntercept() {
        double yIntercept = y1 - (slope() * x1);
        return roundedToHundredth(yIntercept);
    } // returns the yIntercept of the equation of the line formed from the two points

    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    } // returns the slope of the equation of the line formed from the two points

    public String equation() { // Creates a linear equation based on the two points
        if (slope() == 0) { // Equation of the line if the slope is 0 (Horizontal Line)
            String equation = "y = " + (int) yIntercept();
            return equation;
        } else {
            if (yIntercept() < 0) { // Checks if the yIntercept is less than 0
                if ((y2 - y1) % (x2 - x1) == 0) { // Checks if the slope is a whole number
                    if ((y2 - y1) / (x2 - x1) == 1) { // Formats the equation if slope equals 1
                        String equation = "y = " + "x - " + Math.abs(yIntercept());
                        return equation;
                    } else if ((y2 - y1) / (x2 - x1) == -1) { // Formats the equation if slope equals -1
                        String equation = "y = " + "-x - " + Math.abs(yIntercept());
                        return equation;
                    } else { // Formats the equation if slope equals anything else
                        String equation = "y = " + (y2 - y1) / (x2 - x1) + "x - " + Math.abs(yIntercept());
                        return equation;
                    }
                } else if (y2 - y1 < 0 && x2 - x1 < 0) { // Formats the fractional slope if both the denominator AND numerator is negative
                    String equation = "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(yIntercept());
                    return equation;
                } else if (y2 - y1 < 0 || x2 - x1 < 0) { // Formats the fractional slope if the denominator OR numerator is negative
                    String equation = "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(yIntercept());
                    return equation;
                } else { // Formats the fractional slope if both the denominator AND numerator are positive
                    String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) +"x - " + Math.abs(yIntercept());
                    return equation;
                }
            } else if (yIntercept() == 0) { // Checks if the yIntercept is equal to 0
                if ((y2 - y1) % (x2 - x1) == 0) { // Checks if the slope is a whole number
                    if ((y2 - y1) / (x2 - x1) == 1) { // Formats equation if slope equals 1
                        String equation = "y = " + "x";
                        return equation;
                    } else if ((y2 - y1) / (x2 - x1) == -1) { // Formats equation if slope equals -1
                        String equation = "y = " + "-x";
                        return equation;
                    } else { // Formats equation if slope equals anything else
                        String equation = "y = " + (y2 - y1) / (x2 - x1) + "x";
                        return equation;
                    }
                } else if (y2 - y1 < 0 && x2 - x1 < 0) { // Formats the slope if both the numerator AND denominator are negative
                    String equation = "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
                    return equation;
                } else if (y2 - y1 < 0 || x2 - x1 < 0) { // Formats the slope if the numerator OR denominator are negative
                    String equation = "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
                    return equation;
                } else { // Formats the slope if both the numerator AND denominator are positive
                    String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x";
                    return equation;
                }
            } else { // Checks if the yIntercept is greater than 0
                if ((y2 - y1) % (x2 - x1) == 0) { // Checks if the slope is a whole number
                    if ((y2 - y1) / (x2 - x1) == 1) { // Formats equation if slope equals 1
                        String equation = "y = " + "x + " + Math.abs(yIntercept());
                        return equation;
                    } else if ((y2 - y1) / (x2 - x1) == -1) { // Formats equation if slope equals -1
                        String equation = "y = " + "-x + " + Math.abs(yIntercept());
                        return equation;
                    } else { // Formats equation if slope equals anything else
                        String equation = "y = " + (y2 - y1) / (x2 - x1) + "x + " + Math.abs(yIntercept());
                        return equation;
                    }
                } else if (y2 - y1 < 0 && x2 - x1 < 0) { // Formats the slope if both the numerator AND denominator are negative
                    String equation = "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
                    return equation;
                } else if (y2 - y1 < 0 || x2 - x1 < 0) { // Formats the slope if the numerator OR denominator are negative
                    String equation = "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
                    return equation;
                } else { // Formats the slope if both the numerator AND denominator are positive
                    String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) +"x + " + yIntercept();
                    return equation;
                }
            }
        }
    }

    public String coordinateForX(double xValue) {
        String xcoord = xValue + "";
        double yValue = (xValue * slope()) + yIntercept();
        String ycoord = yValue + "";
        String coordinate = "(" + xcoord + ", " + ycoord + ")";
        return coordinate;
    } // Returns the coordinate point that corresponds to the xValue inputted by the user

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    } // Method to round values to the nearest hundredth place

    public String lineInfo() {
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these two points is: " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of the line is: " + yIntercept();
        info += "\nThe distance between the two points is: " + distance();
        return info;
    } // Returns all the information about the LinearEquation object
}





