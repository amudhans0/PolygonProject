public class Polygon {
    private int numSide;
    private double sideLength;
    private String shapeType;
    private double perimeter;
    private double area;

    public Polygon() {
        numSide = 3;
        sideLength = 1.0;
        perimeter = 3;
        shapeType = "Triangle";
    }

    public Polygon(int nSide, double sLength, String sType) {
        if (nSide <= 2 || sLength <= 0.0) {
            numSide = 3;
            sideLength = 1.0;
            perimeter = 3;
            shapeType = "Triangle";
        } else {
            numSide = nSide;
            sideLength = sLength;
            shapeType = sType;
            calculatePerimeter();
        }
    }


    public int getNumSides() {
        return numSide;
    }

    public double sideLength() {
        return sideLength;
    }

    public String getShapeType() {
        return shapeType;
    }

    public Polygon(int nSide,int sLength) {
        if (nSide >= 3) {
            numSide = nSide;
        } else {
            numSide = 3;
        }
        if (sLength > 0) {
            sideLength = sLength;
        } else {
            sideLength = 1;
        }
    }

    public void setSideLength(int newSideLength) {
        sideLength = newSideLength;
    }

    public void setnumSide(int newNumSide) {
        numSide = newNumSide;
    }

    public void setShapeName(String newShapeType) {
        shapeType = newShapeType;
    }

    public double calculatePerimeter() {
        perimeter = Math.round(numSide*sideLength*1000);
        perimeter/=1000.0;
        return perimeter;
    }
    public double getPerimeter() {
        return perimeter;
    }

    public double calculateArea() {
        getPerimeter();
        area = ((sideLength*sideLength) * numSide)/(4.0*Math.tan((Math.PI / numSide)));
        area = Math.round(area*1000.0)/1000.0;
        return area;
    }
    public String toString() {
        return "Your Polygon is a " + shapeType + " and has " + numSide + " sides. " + "/n"
                + "The perimeter of your Polygon is " + perimeter + ".";
    }
}