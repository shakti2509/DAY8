package Ass5;
public class ColorPoint extends Point {
String color;
public int f=0;
public static String []colors;
  static {
	  colors=new String[3];
	  colors[0]="Green";
	  colors[1]="red";
	  colors[2]="blue";  
  }
  public ColorPoint() {
	super();
}
public ColorPoint(int x,int y,String col)
  {
     super(x,y);
     for(int i=0;i<3;i++)
     {
        if(col.equals(colors[i]))
         {
           color=col;
          f=1;
          break;
         }
        }
     }
       public String toString()
        {
        	if(f==1)
        	{
        		return "["+super.x+","+super.y+"]"+"color is : "+color;	
        	}
        	else
        		return "[" +super.x+","+super.y+"]"+"color is : "+"white";
        }
     }
	
	


