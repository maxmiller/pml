	#ifndef registerFile_h
	#define  registerFile_h
	#include "systemc.h"
	
	SC_MODULE(registerFile){
	 	sc_int<WORD_SIZE> registerFile_0 ;
sc_int<WORD_SIZE> registerFile_1 ;
sc_int<WORD_SIZE> registerFile_2 ;
sc_int<WORD_SIZE> registerFile_3 ;
sc_int<WORD_SIZE> registerFile_4 ;
sc_int<WORD_SIZE> registerFile_5 ;
sc_int<WORD_SIZE> registerFile_6 ;
sc_int<WORD_SIZE> registerFile_7 ;
sc_int<WORD_SIZE> registerFile_8 ;
sc_int<WORD_SIZE> registerFile_9 ;
sc_int<WORD_SIZE> registerFile_10 ;
sc_int<WORD_SIZE> registerFile_11 ;
sc_int<WORD_SIZE> registerFile_12 ;
sc_int<WORD_SIZE> registerFile_13 ;
sc_int<WORD_SIZE> registerFile_14 ;
sc_int<WORD_SIZE> registerFile_15 ;
sc_int<WORD_SIZE> registerFile_16 ;
sc_int<WORD_SIZE> registerFile_17 ;
sc_int<WORD_SIZE> registerFile_18 ;
sc_int<WORD_SIZE> registerFile_19 ;
sc_int<WORD_SIZE> registerFile_20 ;
sc_int<WORD_SIZE> registerFile_21 ;
sc_int<WORD_SIZE> registerFile_22 ;
sc_int<WORD_SIZE> registerFile_23 ;
sc_int<WORD_SIZE> registerFile_24 ;
sc_int<WORD_SIZE> registerFile_25 ;
sc_int<WORD_SIZE> registerFile_26 ;
sc_int<WORD_SIZE> registerFile_27 ;
sc_int<WORD_SIZE> registerFile_28 ;
sc_int<WORD_SIZE> registerFile_29 ;
sc_int<WORD_SIZE> registerFile_30 ;
sc_int<WORD_SIZE> registerFile_31 ;


	     	nullsc_in< sc_int<32> >ra1RF_0;
sc_in< sc_int<32> >ra1RF_1;
	    
	     	nullsc_in< sc_int<32> >ra2RF_0;
sc_in< sc_int<32> >ra2RF_1;
	    
	     	sc_in< sc_bool >wdRF;	    
	     	sc_in< sc_int<0> >waRF;	    
	  	sc_out< sc_int<32> >rd1RF;	    
	  	sc_out< sc_int<32> >rd2RF;	    
        	void behaviorregister(); 
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
		SC_CTOR(registerFile) {
        
	        	SC_THREAD(behaviorregister); 
				       sensitive <<ra1RF_0;
sensitive <<ra1RF_1;

				       sensitive <<ra2RF_0;
sensitive <<ra2RF_1;

				       sensitive <<wdRF;

        }       
	};
	#endif
	
