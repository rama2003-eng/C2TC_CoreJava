package com.tnsif.daysix.usingfinal;

 class FinalMethod {
	 final void run()
	 {
		 System.out.println("running");
	 }

}
 class Method extends FinalMethod{
	 void eat()
	 {
		 System.out.println("eating"); 
	 }
	 
 }
