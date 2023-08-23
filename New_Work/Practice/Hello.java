class Hello{
   
   public static void main(String[] args){
	   
	   One one1 = new One();
	   One one2 = new One();
	   
	   one1.remainder();
	   one1.add(8);
	   
	   
	   one2.remainder();
	   one2.add(8);
	   double dd = one2.sub(11.54);
	   System.out.println(dd);  
	   
	   
   }
}