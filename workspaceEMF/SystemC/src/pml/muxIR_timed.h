	#ifndef muxIR_h
	#define  muxIR_h
	#include "systemc.h"
	
	SC_MODULE(muxIR){
	    	nullsc_in< sc_int<6> >inputsMuxIR_0;
sc_in< sc_int<6> >inputsMuxIR_1;
	    
	    	sc_out< sc_int<6> >outputMuxIR;	    
	    	sc_in< sc_int<32> >selMuxIR;	    
        	void execute(); /*
		{
				switch(selMuxIR.read.to_int()){
 case 0:
outputMuxIR=inputsMuxIR_0;
break;

 case 1:
outputMuxIR=inputsMuxIR_1;
break;
default:
outputMuxIR= 0 ; 
 break;
 } 
		}*/
		SC_CTOR(muxIR) {
	        	SC_THREAD(execute); 
				   sensitive <<inputsMuxIR_0;
sensitive <<inputsMuxIR_1;

				
        }       
	};
	#endif
	
