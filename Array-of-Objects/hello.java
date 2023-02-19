import java.util.Scanner;
public class hello{
	
	String name,id;
	static Scanner sc = new Scanner(System.in);
	
	// This function sets values of name, id for each object when called
	public void setdata(String name, String id) {
		this.name = name;	// assigning passed name argument to the name property of the object
		this.id = id;		// assigning passed id argument to the id property of the object
	}
    
    hello[] obj = new hello[5];
    
    public void getdata()
    {
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter name = ");
            String someName = sc.next();	// Just temporary string for taking input we will pass this to the setdata() function
            System.out.println("\nEnter Id = ");
            String someId = sc.next();		// Just temporary string for taking input we will pass this to the setdata() function
            
            /*
             * This line was missing
             * We need to initialize each object in the array of objects
             * Because each object was 'null' in the array of objects we got NullPointerException 
             */
            obj[i] = new hello();			
            
            // We are setting name and id properties by setdata() function
            obj[i].setdata(someName, someId);
        }
    }
    
    public void print()
    {
        System.out.println("Name        ID");
        for(int i=0; i<obj.length; i++)
        {
            System.out.println("\n"+obj[i].name+"\t|"+obj[i].id+"\n");
        }
    }
    
    public static void main(String[] args) {
    	
        hello h = new hello();
        
        int choice = 0;
        while(choice!=3){
        System.out.println("1.Getdata from user");
        System.out.println("2.Print data");
        System.out.println("Enter your choice (1/2)");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                h.getdata();
            break;
            case 2:
                h.print();
            break;
            default:
            case 3:
            System.out.println("Program got Exit");
            break;
        }
        }
    }
}


