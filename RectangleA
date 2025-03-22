/**
 * 
 * @author Eidelman Nikolay
 * @version 19.11.2021
 * 
 */

public class RectangleA
{
    //declaration
    
    private int _width;
    private int _height;
    private Point _pointSW;
    private final int NEGATIVE_WIDTH = 0; // if width value less than "0".
    private final int NEGATIVE_HEIGHT = 0; // if height value less than "0".
    private final int MIN_WIDTH = 1; // if entered wrong width value.
    private final int MIN_HEIGHT = 1; // if entered wrong height value.

    //constructors
    /**
     * First constructor for objects of class RectangleA Constructs a new rectangle with the specified Width, Height and it's South West corner is (0,0).
     * @param width The rectangle width.
     * @param height The rectangle height.
     */
    
    public RectangleA(int w, int h)
    {
        _width = w;
        _height = h;
        _pointSW = new Point(0,0);
        if (_width < NEGATIVE_WIDTH)
            _width = MIN_WIDTH;
        if (_height < NEGATIVE_HEIGHT )
            _height = MIN_HEIGHT;
    }

    /**
     * Second constructor for objects of class RectangleA Construct a new rectangle with the specified Width, Height and South West vertex.
     * @param p South Western vertex.
     * @param w The rectangle width.
     * @param h The rectangle width.
     */
    
    public RectangleA(Point p, int w, int h)
    {
        _width = w;
        _height = h;
        _pointSW = new Point(p) ;
        if (_width < NEGATIVE_WIDTH)
            _width = MIN_WIDTH;
        if (_height < NEGATIVE_HEIGHT )
            _height = MIN_HEIGHT;
    }

    /**
     * Third constructor for objects of class RectangleA Construct a new rectangle with the specified South West vertex and North East vertex.
     * @param sw South Western vertex.
     * @param ne North Eastern vertex.
     */
    
    public RectangleA(Point sw, Point ne) 
    {
        _pointSW = new Point(sw);
        Point _pointNE = new Point(ne);
        _width = _pointNE.getX() - _pointSW.getX(); // calculating the width of rectangle.
        _height = _pointNE.getY() - _pointSW.getY(); // calculating the height of rectangle.
    }

    /**
     * Copy constructor for objects of class RectangleA Constructs a rectangle using another rectangle.
     * @param r The rectangle from which to construct the new object.
     */
    
    public RectangleA(RectangleA r)
    {
        _width =  r._width;
        _height = r._height;
        _pointSW = new Point(r._pointSW);
    }

    // getters
    /**
     * Returns the width of the rectangle.
     * @return The width of the rectangle.
     */
    
    public int getWidth()
    {
        return _width;
    }
    
    /**
     * Returns the height of the rectangle.
     * @return The height of the rectangle.
     */
    
    public int getHeight() 
    {
        return _height;
    }

    /**
     * Returns the South-West point of the rectangle.
     * @return A copy of the SW point of the rectangle.
     */
    
    public Point getPointSW() 
    {
        return new Point(_pointSW);
    }

    //setters
    /**
     * Sets the width of the rectangle.
     * @param w The width of the rectangle to set to.
     */
    
    public void setWidth(int w) 
    {
        if ( w > NEGATIVE_WIDTH )
            _width = w;
    }

    /**
     * Sets the height of the rectangle.
     * @param h The height of the rectangle to set to.
     */
    
    public void setHeight(int h)
    {
        if ( h > NEGATIVE_HEIGHT )
            _height = h;
    }

    /**
     * Sets the South-West point of the rectangle.
     * @param p The SW point of the rectangle to set to.
     */
    
    public void setPointSW(Point p) 
    {
        _pointSW = new Point(p);
    }

    // String
    /**
     * Returns a string representation of the rectangle.
     * @return A string represent the rectangle For example: Width=4 Height=6 PointSW=(1,2).
     */
    
    public String toString() 
    {
        return "Width=" + _width + " Height="+ _height+ " PointSW=" +_pointSW;
    }

    // getting the perimeter and area of the rectangle.
    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    
    public int getPerimeter()
    {
        return 2*(_width+_height);
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle.
     */
    
    public int getArea() 
    {
        return _width*_height;
    }

    // moves the rectangle 
    /**
     * Move the rectangle by deltaX in X direction and deltaY in Y direction.
     * @param deltaX Translate the rectangle deltaX in the X direction.
     * @param deltaY Translate the rectangle deltaY in the Y direction.
     */
    
    public void move(int deltaX, int deltaY)
    {
        _pointSW.move(deltaX,deltaY);
    }

    /**
     * Returns true if the given rectangle is equal to other rectangle.
     * @param other the rectangle to check equality with.
     * @return True if other and this rectangle are equal.
     */
    
    public boolean equals(RectangleA other){
        return _width==other._width && _height==other._height && _pointSW.equals(other._pointSW);
    }

    /**
     * Returns the length of the rectangle diagonal.
     * @return The length of the diagonal of the Rectangle.
     */
    
    public double getDiagonalLength() 
    {
        Point _pointNE = new Point(_pointSW); // constructing new _pointNE by copiying _pointSW coordinates.
        _pointNE.move(_width,_height); // moves _pointNE to correct coordinates.
        double diagonal = _pointSW.distance(_pointNE); // diagonal calculation.
        return diagonal;
    }

    /**
     * Returns true if the current rectangle is larger than the parameter rectangle.
     * @param other Another Rectangle to compare with.
     * @return True if the current Rectangle's area is larger than the other Rectangle which recieved as parameter, false - otherwise.
     */
    
    public boolean isLarger(RectangleA other) 
    {
        return (this.getArea() > other.getArea()) ;
    }

    /**
     * Returns the North-East point of the rectangle.
     * @return A copy of the North-East point of the Rectangle.
     */
    
    public Point getPointNE() 
    {
        Point _pointNE = new Point(_pointSW); // constructing new _pointNE by copiying _pointSW coordinates.
        _pointNE.move(_width,_height); // moves _pointNE to correct coordinates.
        return _pointNE; 
    }

    /**
     * Changes the width to height and vice versa.
     */
    
    public void changeSides() 
    {
        int height = getHeight();
        int width = getWidth();
        _width = height;
        _height = width;
    }

    /**
     * Returns true if the current rectangle is in the parameter rectangle.
     * @param r Another Rectangle to check with.
     * @return True if the current Rectangle's completly in the other Rectangle which recieved as parameter, false - otherwise.
     */
    
    public boolean isIn(RectangleA r)
    {
        Point otherPointSW = new Point(r.getPointSW()); // constructing new _pointSW of the other Rectangle.
        int widthDifference = (r.getWidth() - _width); // width difference calculation of other and this Rectangles.
        int heightDifference = (r.getHeight() - _height); // height difference calculation of other and this Rectangles.
        int differenceX = Math.abs(otherPointSW.getX() - _pointSW.getX()); // X direction difference between that Rectanlge _pointSW and other Rectangle _pointSW.
        int differenceY = Math.abs(otherPointSW.getY() - _pointSW.getY()); // Y direction difference between that Rectanlge _pointSW and other Rectangle _pointSW.
        return (this.equals(r) || (( differenceX == widthDifference || differenceX < widthDifference )&&( differenceY == heightDifference || differenceY < heightDifference )));
    }

    /**
     * Returns true if the current rectangle overlaps with the parameter rectangle.
     * @param r Another Rectangle to check with.
     * @return True if the current Rectangle's overlaps with the other Rectangle which recieved as parameter even by a single point, false - otherwise.
     */
    
    public boolean overlap(RectangleA r)
    {
        Point otherPointSW = new Point(r.getPointSW()); // constructing new _pointSW of the other Rectangle.
        int widthDifference = (r.getWidth() - _width); // width difference calculation of other and this Rectangles.
        int heightDifference = (r.getHeight() - _height); // height difference calculation of other and this Rectangles.
        int differenceX = Math.abs(otherPointSW.getX() - _pointSW.getX()); // X direction difference between that Rectanlge _pointSW and other Rectangle _pointSW.
        int differenceY = Math.abs(otherPointSW.getY() - _pointSW.getY()); // Y direction difference between that Rectanlge _pointSW and other Rectangle _pointSW.
        if (differenceX > r.getWidth() || differenceY > r.getHeight()) // checks if that Rectangle totally out of other Rectangle. 
            return false;
        else
            return true; 
    }

}
