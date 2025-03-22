/**
 * 
 * @author Eidelman Nikolay
 * @version 19.11.2021
 */
public class Point
{
    //declaration

    private int _x;
    private int _y;

    //constructors
    /**
     * Constructor for objects of class Point Constructs a new point with the specified X Y coordinates.
     * @param x The X coordinate.
     * @param y The Y coordinate.
     */

    public Point(int x, int y)
    {
        _x = x;
        _y = y;
    }

    /**
     * Copy constructor, constructs and initializes a point using another point.
     * @param other The point from which to construct the new object.
     */

    public Point(Point other)
    {
        _x = other._x;
        _y = other._y;
    }

    //getters.
    /**
     * Returns the X coordinate of the point.
     * @return The X coordinate of the point.
     */

    public int getX()
    {
        return _x;
    }

    /**
     * Returns the Y coordinate of the point.
     * @return The Y coordinate of the point.
     */

    public int getY()
    {
        return _y;
    }

    //setters
    /**
     * Sets the X coordinate of the point.
     * @param num A new value for the X coordinate.
     */

    public void setX(int num)
    {
        _x = num;
    }

    /**
     * Sets the Y coordinate of the point.
     * @param num A new value for the Y coordinate.
     */

    public void setY(int num)
    {
        _y = num;
    }

    //to string
    /**
     * Representation of the object in String.
     * @return The coordinates of a point as a string; for example : (1,2).
     */

    public String toString()
    {
        return "(" +_x+ ","+_y+ ")";
    }

    //boolean compares of two points.
    /**
     * Checks if two points are equal.
     * @param other The point to be compared with the current point.
     * @return True if the point to be compared is equal to the current point.
     */

    public boolean equals(Point other)
    {
        return _x==other._x && _y==other._y;
    }

    /**
     * Checks if the current point is above the point it is to be compared with.
     * @param other The point to be compared with the current point.
     * @return True if the current point is above the point it is to be compared with.
     */
    
    public boolean isAbove (Point other)
    {
        return _y > other._y;
    }

    /**
     * Checks if the current point is beneath the point it is to be compared with.
     * @param other The point to be compared with the current point.
     * @return True if the current point is beneath the point it is to be compared with.
     */
    
    public boolean isUnder (Point other)
    {
        return other.isAbove(this);
    }

    /**
     * Checks if the current point is left of the point it is to be compared with.
     * @param other The point to be compared with the current point.
     * @return True if the current point is left of the point it is to be compared with.
     */
    
    public boolean isLeft (Point other)
    {
        return _x < other._x;
    }

    /**
     * Checks if the current point is right of the point it is to be compared with.
     * @param other  The point to be compared with the current point.
     * @return True if the current point is right of the point it is to be compared with.
     */
    
    public boolean isRight (Point other)
    {
        return other.isLeft(this);
    }
    // distanse calculation
    /**
     * Calculates the distance between two points.
     * @param p The second point whose distance from the current point is to be calculated.
     * @return The distance between the current point and the point passed as a parameter.
     */
    
    public double distance(Point p)
    {
        return Math.sqrt((Math.pow((_x-p._x),2)) + Math.pow((_y-p._y),2));
    }
    
    //moves coordinates X and Y
    /**
     * Moves the current point , at location (x,y) to a new location. 
     * This new location is determined by deltaX which changes X's position along the X axis and deltaY which changes Y's position along the Y axis.
     * @param deltaX The distance to move the current point along the X axis.
     * @param deltaY The distance to move the current point along the Y axis.
     */
    
    public void move (int deltaX, int deltaY)
    {
        _x += deltaX;
        _y += deltaY;
    }

}
