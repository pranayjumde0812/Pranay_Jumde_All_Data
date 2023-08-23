class Pattern2{

  public static void main(String [] args){

	  int rows = 5 , column = 5;

	  for ( int i = 0 ; i <= rows ; i++){

		  for(int j = 0 ; j <= column ; j++){

			  char ch = (char) (j + 65);

			  System.out.print(ch+" ");
		  }
             System.out.println();
	  }
  }
}