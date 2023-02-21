class Feb_16_Q1

// Calulate Area and Perimeter of rectangle
{
 public static void main(String [] args)
 {
   int height=7;
   int width=5;

   int perimeter,area;

   perimeter=height+width+height+width;

   area= 2*height*width;

   System.out.println("Perimeter of rectangle = "+perimeter+" inch");
   System.out.println("Area of rectangle = "+area +" inch2");
 }
}