	#ifndef registerFile_h
	#define  registerFile_h
	#include "systemc.h"
	
	SC_MODULE(registerFile){

		sc_int<WORD_SIZE> *registerFile;

		
	     	sc_in< sc_int<32> > *ra1RF;	    
	     	sc_in< sc_int<32> > *ra2RF;	    
	     	sc_in< sc_bool >wdRF;	    
	     	sc_in< sc_int<0> >waRF;	    
	  	sc_out< sc_int<32> >rd1RF;	    
	  	sc_out< sc_int<32> >rd2RF;	    
        	void behaviorregister(); 
/* example code implementation 
if(writeReg){
	registers[  address2.read().to_int() ] = dataIn;
	}
	dataOut = registers[address.read().to_int()] ;
}
*/
		SC_CTOR(registerFile) {
        
	        	SC_METHOD(behaviorregister); 
				      sensitive <<ra1RF[0];
sensitive <<ra1RF[1];

				      sensitive <<ra2RF[0];
sensitive <<ra2RF[1];

				      sensitive <<wdRF;

        }       
	};
	#endif
	
