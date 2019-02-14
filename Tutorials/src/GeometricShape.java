public class GeometricShape {

    private double side1, side2, side3; //These are the variables necessary to calculat the perimeter of a triangle
    private double radius; //Radius is needed to calculate the perimeter of a circle
    private double length, width; //Length and Width are needed to calculate the perimeter of a rectangle
    private boolean triangle = false;
    private boolean rectangle = false;
    private boolean circle = false;

    //Constructor for a triangle
    public GeometricShape(double aSide1, double aSide2, double aSide3)
    {
        side1 = aSide1;
        side2 = aSide2;
        side3 = aSide3;
        triangle = true;
    }

    //Constructor for a rectangle
    public GeometricShape(double aLength, double aWidth)
    {
        length = aLength;
        width = aWidth;
        rectangle = true;
    }

    //Constructor for a circle
    public GeometricShape(double aRadius)
    {
        radius = aRadius;
        circle = true;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setRadius(double aRadius)
    {
        radius = aRadius;
    }

    public void setSide1(double aSide1)
    {
        side1 = aSide1;
    }

    public void setSide2(double aSide2)
    {
        side2 = aSide2;
    }

    public void setSide3(double aSide3)
    {
        side3 = aSide3;
    }

    public void setLength(double aLength)
    {
        length = aLength;
    }

    public void setWidth(double aWidth)
    {
        width = aWidth;
    }

    public double getPerimeter()
    {
        double perimeter = 0;
        //Calculate the perimeter of the Geometric object depending on what the object is.
        //Remember the following formulas:
        //Perimeter of a Triangle = Side1 + Side2+ Side3
        //Perimeter of a Rectangle = (2 * length)  + (2 * width)
        //Perimeter of a Circle = 2 * Math.PI * radius

        if (triangle == true)
        {
            perimeter = side1 + side2 + side3;
        }
        else if (rectangle == true)
        {
            perimeter = (2 * length) + (2 * width);
        }
        else if (circle == true)
        {
            perimeter = Math.PI * radius;
        }
        //Continue with the rest of the else if logic here.

        //change return statement to match the perimeter of the shape
        return perimeter;

    }


    @Override
    public String toString() {
        return "GeometricShape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", radius=" + radius +
                ", length=" + length +
                ", width=" + width +
                ", triangle=" + triangle +
                ", rectangle=" + rectangle +
                ", circle=" + circle +
                '}';
    }
}

