	#ifndef PC_h
	#define  PC_h
	#include "systemc.h"
	
	SC_MODULE(PC){
	 	

	     	sc_in< sc_int<32> >inPC;	    
	  	sc_out< sc_int<32> >outPC;	    
        	void behavior(); 
/* example code implementation 
while(true){
if(writeReg){
	registers[  address2.read().to_int() ] = dataIn;
	}
	dataOut = registers[address.read().to_int()] ;
}
wait(1);
}
*/
		SC_CTOR(PC) {
        
	        	SC_THREAD(behavior); 
				       sensitive <<inPC;

        }       
	};
	#endif
	
