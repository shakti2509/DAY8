package Ass1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[]=new Employee[5];
	          e[0]=new Admin("aa","avsd",5,45455.7,78);
              e[1]=new Salesmanager();
              e[2]=new Programmer();
              e[3]=new Admin();
              e[4]=new Salesmanager();
              for(int i=0;i<5;i++)
              {
            	System.out.println(e[i]); 
              }
              
             		  
              
	}

}
