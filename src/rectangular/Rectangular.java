package rectangular;
import java.util.Random;
/**
 *
 * @author Muhammad Huzaifa Alam Khan
 */
public class Rectangular {
    private int width;
    private int length;
    private static int amountOfSide = 4;
    
    /*
    default constructor
    constrctor with two param
    copy constructor
    equals (overload version)
    toString
    getter setter
    */
    /**
     * Default constructor, random width and length in range [1, 10]
     */
    public Rectangular() {
        int max = 10;
        int min = 1;
        Random rand = new Random();
        this.width = rand.nextInt(max - min + 1) + min;
        this.length = rand.nextInt(max - min + 1) + min;
//        OR
//        this.width = rand.nextInt(10) + 1;
//        this.lenght = rand.nextInt(10) + 1;
    }
    /**
     * Constructor with width and length
     * @param width the width of rectangular
     * @param lenght the length of rectangular
     */
    public Rectangular(int width, int lenght) {
        this.width = width;
        this.length = lenght;
    }
    /**
     * Copy constructor 
     * @param rectangular another constructor
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
    }
    /**
     * To calculate the area of rectangular
     * @return the area of rectangular
     */
    public int calcArea() {
        return width * length;
    }
    /**
     * To calculate the perimeter of rectangular
     * @return the perimeter of rectangular
     */
    public int calcPerimeter() {
        return (width + length);
    }
    /**
     * To compare two rectangular
     * @param rectangular another constructor
     * @return if the rectangular are the same
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width 
                && this.length == rectangular.length;
    }

    @Override
    /**
     * To generate a String to represent a rectangular
     * @return a string to represent a rectangular
     */
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Lenght", length);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        
        return str;
    }
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLentht() {
        return length;
    }

    public void setLength(int lenght) {
        this.length = lenght;
    }
    
}