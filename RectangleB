/**
 * 
 * @author Eidelman Nikolay
 * @version 19.11.2021
 * 
 */

public class RectangleB
{
    // declaration
    
    private Point _pointSW;
    private Point _pointNE;
    private final int NEGATIVE_WIDTH = 0; // if width value less than "0".
    private final int NEGATIVE_HEIGHT = 0; // if height value less than "0".
    private final int MIN_WIDTH = 1; // if entered wrong width value.
    private final int MIN_HEIGHT = 1; // if entered wrong height value.

    
    //constructors
    /**
     * First constructor for objects of class RectangleB Constructs a new rectangle with the specified Width, Height and it's South West corner is (0,0).
     * @param width The rectangle width.
     * @param height The rectangle height.
     */
    
    public RectangleB(int w, int h)
    {
        _pointSW = new Point(0,0);
        _pointNE = new Point(w,h);
        if( w < NEGATIVE_WIDTH )
            _pointNE.setX(MIN_WIDTH);
        if ( h < NEGATIVE_HEIGHT )
            _pointNE.setY(MIN_HEIGHT);
    }

    /**
     * Second constructor for objects of class RectangleB Construct a new rectangle with the specified Width, Height and South West vertex.
     * @param p South Western vertex.
     * @param w The rectangle width.
     * @param h The rectangle width.
     */
    
    public RectangleB(Point p, int w, int h)
    {
        _pointSW = new Point(p);
        _pointNE = new Point(_pointSW.getX() + w, _pointSW.getY() + h);
        if( w < NEGATIVE_WIDTH )
            _pointNE.setX(MIN_WIDTH);
        if ( h < NEGATIVE_HEIGHT )
            _pointNE.setY(MIN_HEIGHT);
    }

    /**
     * Third constructor for objects of class RectangleB Construct a new rectangle with the specified South West vertex and North East vertex.
     * @param sw South Western vertex.
     * @param ne North Eastern vertex.
     */
    
    public RectangleB(Point sw, Point ne) 
    {
        _pointSW = new Point(sw);
        _pointNE = new Point(ne);
    }

    /**
     * Copy constructor for objects of class RectangleB Constructs a rectangle using another rectangle.
     * @param r The rectangle from which to construct the new object.
     */
    
    public RectangleB(RectangleB r)
    {
        _pointSW = new Point(r._pointSW);
        _pointNE = new Point(r._pointNE);
    }

    /**
     * Returns the South-West point of the rectangle.
     * @return A copy of the SW point of the rectangle.
     */
    
    public Point getPointSW()
    {
        return new Point(_pointSW);
    }
    
    /**
     * Returns the North-East point of the rectangle.
     * @return A copy of the North-East point of the Rectangle.
     */
    
    public Point getPointNE() 
    {
        return new Point(_pointNE);
    }
    
    /**
     * Returns the width of the rectangle.
     * @return The width of the rectangle.
     */
    public int getWidth() 
    {
        return _pointNE.getX() - _pointSW.getX();
    }

    /**
     * Returns the height of the rectangle.
     * @return The height of the rectangle.
     */
    
    public int getHeight()
    {
        return _pointNE.getY() - _pointSW.getY();
    }

    /**
     * Sets the width of the rectangle.
     * @param w The width of the rectangle to set to.
     */
    
    public void setWidth(int w)
    {
        if ( w > NEGATIVE_WIDTH ){
            _pointNE.setX(_pointSW.getX() + w); //calculating correct X coordinate.
        }  
    }

    /**
     * Sets the height of the rectangle.
     * @param h The height of the rectangle to set to.
     */
    
    public void setHeight(int h)
    {
        if ( h > NEGATIVE_HEIGHT ){
            _pointNE.setY(_pointSW.getY() + h); //calculating correct Y coordinate.
        }  
    }

    /**
     * Sets the South-West point of the rectangle. This change affects also the NE Point since the width and height of the rectangle should NOT change
     * @param p The SW point of the rectangle to set to.
     */
    
    public void setPointSW(Point p)
    {
        int deltaX = Math.abs(_pointSW.getX() - p.getX()); // calculating the the X coordinate difference of current _pointSW and other _pointSW. 
        int deltaY = Math.abs(_pointSW.getY() - p.getY()); // calculating the the X coordinate difference of current _pointSW and other _pointSW. 
        _pointNE = new Point(_pointNE);
        if (_pointSW.isRight(p)) // checks if other _pointSW moved to negative X direction.
        deltaX *=-1;
        if (_pointSW.isAbove(p)) // checks if other _pointSW moved to negative X direction.
        deltaY*=-1;
        _pointSW = new Point(p);
        _pointNE = new Point(_pointNE);
        _pointNE.move(deltaX,deltaY); // moves _pointNE same deltaX and deltaY as _pointSW
    }

    /**
     * Returns a string representation of the rectangle.
     * @return A string represent the rectangle For example: Width=4 Height=6 PointSW=(1,2).
     */
    
    public String toString()
    {
        return "Width=" + this.getWidth() + " Height="+ this.getHeight() + " PointSW=" +_pointSW;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    
    public int getPerimeter() 
    {
        return 2*( this.getWidth() + this.getHeight());
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle.
     */
    
    public int getArea()
    {
        return this.getWidth() * this.getHeight();
    }

    /**
     * Move the rectangle by deltaX in X direction and deltaY in Y direction.
     * @param deltaX Translate the rectangle deltaX in the X direction.
     * @param deltaY Translate the rectangle deltaY in the Y direction.
     */
    
    public void move(int deltaX, int deltaY)
    {
        _pointSW.move(deltaX,deltaY);
        _pointNE.move(deltaX,deltaY);
    }

    /**
     * Returns true if the given rectangle is equal to other rectangle.
     * @param other the rectangle to check equality with.
     * @return True if other and this rectangle are equal.
     */
    
    public boolean equals(RectangleB other) 
    {
        return _pointSW.equals(other._pointSW) && _pointNE.equals(other._pointNE) ;
    }

    /**
     * Returns the length of the rectangle diagonal.
     * @return The length of the diagonal of the Rectangle.
     */
    
    public double getDiagonalLength() 
    {
        return _pointSW.distance(_pointNE);
    }

    /**
     * Returns true if the current rectangle is larger than the parameter rectangle.
     * @param other Another Rectangle to compare with.
     * @return True if the current Rectangle's area is larger than the other Rectangle which recieved as parameter, false - otherwise.
     */
    
    public boolean isLarger(RectangleB other) 
    {
        return this.getArea() > (other.getArea());
    }

    /**
     * Changes the width to height and vice versa.
     */
    
    public void changeSides() 
    {
       int w = this.getWidth();
       int h = this.getHeight();
       this.setWidth(h);
       this.setHeight(w);
    }
    
    /**
     * Returns true if the current rectangle is in the parameter rectangle.
     * @param r Another Rectangle to check with.
     * @return True if the current Rectangle's completly in the other Rectangle which recieved as parameter, false - otherwise.
     */
    
    public boolean isIn (RectangleB r) 
    {
       return (r._pointSW.equals(_pointSW) || r._pointSW.isLeft(_pointSW)|| r._pointSW.isUnder(_pointSW))&&
       (r._pointNE.equals(_pointNE) || r._pointNE.isRight(_pointNE) || r._pointNE.isAbove(_pointNE));
    }
    
    /**
     * Returns true if the current rectangle overlaps with the parameter rectangle.
     * @param r Another Rectangle to check with.
     * @return True if the current Rectangle's overlaps with the other Rectangle which recieved as parameter even by a single point, false - otherwise.
     */
    
    public boolean overlap(RectangleB r)
    {
       if( _pointSW.isRight(r._pointNE)|| _pointSW.isAbove(r._pointNE)|| _pointNE.isLeft(r._pointSW)|| _pointNE.isUnder(r._pointSW)) // checks if that Rectangle totally out of other Rectangle. 
         return false;
       else
         return true;
    }

}
