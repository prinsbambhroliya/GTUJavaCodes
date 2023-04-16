class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}
public class C19_Custom_exception {

    public static void main(String[] args) {
        
        try{
        if(Integer.parseInt(args[0]) < 0){
            throw new MyCustomException("Negative number does not allow hear!");
        }
        else
        {
            System.out.println("Allowed: " + args[0]);
        }
    }
    catch(Exception e)
    {
        System.out.println("Error: " + e.getMessage());
    }
    }
}

// 1. Output:

// E:\Opps_Java\GTUJavaCodes>java C19_Custom_exception -4
// Error: Negative number does not allow hear!       

// 2. Output:
// E:\Opps_Java\GTUJavaCodes>java C19_Custom_exception 4
// Allowed: 4

// 3. Output:
// E:\Opps_Java\GTUJavaCodes>java C19_Custom_exception -4
// Allowed: 0

// 4. Output:
// E:\Opps_Java\GTUJavaCodes>java C19_Custom_exception -0
// Allowed: -0

// 5. Output:
// E:\Opps_Java\GTUJavaCodes>java C19_Custom_exception -1
// Error: Negative number does not allow hear! 