package com.tnif.dayseven.overriden;

class Bank{  
int getRateOfInterest(){return 0;}  
}  
 
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class HDFC extends Bank{  
int getRateOfInterest(){return 9;}  
}  