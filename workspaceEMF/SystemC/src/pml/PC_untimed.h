	#ifndef PC_h
	#define  PC_h
	#include "systemc.h"
	
	SC_MODULE(PC){

		sc_int<WORD_SIZE> *PC;

		
	     	sc_in< sc_int<32> >inPC;	    
	  	sc_out< sc_int<32> >outPC;	    
        	void behavior(); 
/* example code implementation 
if(writeReg){
	registers[  address2.read().to_int() ] = dataIn;
	}
	dataOut = registers[address.read().to_int()] ;
}
*/
		SC_CTOR(PC) {
        
	        	SC_METHOD(behavior); 
				      sensitive <<inPC;

        }       
	};
	#endif
	
