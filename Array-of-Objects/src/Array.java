import java.util.Scanner;
public class Array{
    protected String name,id;
    static Scanner sc = new Scanner(System.in);
    public void setdata(String name, String id){
        this.name=name;
        this.id=id;
    }

    Array[] obj = new Array[5];

    public void getdata(){
        for(int i=0; i<5; i++){
            System.out.print(i+". Enter Name = ");
            String someName = sc.next();
            System.out.print("Enter ID = ");
            String someId = sc.next();
            System.out.println();
            obj[i] = new Array(); //initialize every objects in array
            obj[i].setdata(someName, someId);//Otherwise it will give you null pointer Exception
        }
    }

    public void print(){
        System.out.print("Name\tId");
        for(int i=0; i<obj.length; i++)
        {
            System.out.println(obj[i].name+"\t|"+obj[i].id+"\n");
        }
    }
    public static void main(String[] args) {

        Array array = new Array();

        int choice = 0;
        while(choice!=3){
        System.out.println("1.Getdata from user");
        System.out.println("2.Print data");
        System.out.println("Enter your choice (1/2)");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                array.getdata();
            break;
            case 2:
                array.print();
            break;
            default:
            case 3:
            System.out.println("Program got Exit");
            break;
        }
        }
        
    }
}
