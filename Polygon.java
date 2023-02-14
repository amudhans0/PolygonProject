public class Polygon {
    private int numSide;
    private double sideLength;
    private String shapeType;
    private double perimeter;
    private double area;

    public Polygon(){
        numSide = 3;
        sideLength = 1.0;
        shapeType = "Triangle";
    }

    public Polygon(int nSide, double sLength, String sType){
        numSide = nSide;
        sideLength = sLength;
        shapeType = sType;
    }

    public int getNumSides(){
        return numSide;
    }

    public double sideLength(){
        return sideLength;
    }

    public String  getShapeType(){
        return shapeType;
    }

    public Polygon (int nSide){
        if (nSide == 3) {
            numSide = nSide;
        }
            else{
                nSide = 3;
            }
        }

        public Polygon(int sLength){
            if (sLength > 0) {
                sideLength = sLength;
            }
            else{
                    sLength = 0;
                }
            }
    public void setSideLength(int newSideLength) {
        sideLength = newSideLength;
    }

    public void setnumSide(int newNumSides) {
        numSide = newNumSide;
    }

    public void setShapeName(String newShapeType) {
        shapeType = newShapeType;
    }

    public double calculatePerimeter() {
        perimeter = Math.round(numSides*sideLength*1000);
        perimeter/=1000.0;
        return perimeter;
    }
    public double getPerimeter() {
        return perimeter;
    }

    public double calculateArea() {
        getPerimeter();
        area = ((sideLength*sideLength) * numSides)/(4.0*Math.tan((Math.PI / numSides)));
        area = math.round(area*1000.0)/1000.0;
        return area;
    }
    public String toString() {
        return "Your Polygon is a " + shapeType + " and has " + numSide + " sides. " + "/n"
                + "The perimeter of your Polygon is " + perimeter + ".";
    }

    }
    }
