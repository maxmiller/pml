	#ifndef muxDecode_h
	#define  muxDecode_h
	#include "systemc.h"
	
	SC_MODULE(muxDecode){
	    	nullsc_in< sc_int<6> >inputsMuxDecode_0;
sc_in< sc_int<6> >inputsMuxDecode_1;
	    
	    	sc_out< sc_int<6> >outputMuxDecode;	    
	    	sc_in< sc_int<32> >selMuxDecode;	    
        	void execute(); /*
		{
				switch(selMuxDecode.read.to_int()){
 case 0:
outputMuxDecode=inputsMuxDecode_0;
break;

 case 1:
outputMuxDecode=inputsMuxDecode_1;
break;
default:
outputMuxDecode= 0 ; 
 break;
 } 
		}*/
		SC_CTOR(muxDecode) {
	        	SC_THREAD(execute); 
				   sensitive <<inputsMuxDecode_0;
sensitive <<inputsMuxDecode_1;

				
        }       
	};
	#endif
	
