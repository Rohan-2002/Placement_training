/* Definition : Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
   First method named as 'setDim' takes length and breadth of rectangle as parameters and 
   the second method named as 'getArea' returns the area of the rectangle.
 * Author : Rohan Singh M Gurkha
 * Date : 20th MAY 2024
 */

package day2;

public class AreaOfRectangle {
	
	private int length,breadth,area;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getArea(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length * breadth;
		return area;
	}


	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "AreaOfRectangle [length=" + length + " x " + " breadth=" + breadth + " = " + getArea(length,breadth) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AreaOfRectangle ar = new AreaOfRectangle();
        ar.setLength(10);
        ar.setBreadth(10);
        System.out.println(ar);
	}

}
