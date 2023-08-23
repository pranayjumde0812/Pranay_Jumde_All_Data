
class ExceptionHandling1{

public static void main (String [] args) throws Throwable{

	try{
		System.out.println("1st line Try block");

		 int a = 99/0;

		System.out.println("2nd line Try block");
	}

	catch(ArithmeticException ae){

        ae.getMessage();
        ae.getCause();
        ae.toString();
        ae.printStackTrace();
        ae.getStackTrace();
		System.out.println("1st catch block Arithmetic exception");

	}
	catch(Exception e){

				System.out.println("2nd catch block Total exception");
	}


	finally{

		System.out.println("Finally block");

	}

 }
}