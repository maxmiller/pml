	#ifndef muxULAMips_h
	#define  muxULAMips_h
	#include "systemc.h"
	
	SC_MODULE(muxULAMips){
	    	nullsc_in< sc_int<32> >inputsMuxULAMips_0;
sc_in< sc_int<32> >inputsMuxULAMips_1;
	    
	    	sc_out< sc_int<6> >outputMuxULAMips;	    
	    	sc_in< sc_int<32> >selMuxULAMips;	    
        	void execute(); /*
		{
				switch(selMuxULAMips.read.to_int()){
 case 0:
outputMuxULAMips=inputsMuxULAMips_0;
break;

 case 1:
outputMuxULAMips=inputsMuxULAMips_1;
break;
default:
outputMuxULAMips= 0 ; 
 break;
 } 
		}*/
		SC_CTOR(muxULAMips) {
	        	SC_THREAD(execute); 
				   sensitive <<inputsMuxULAMips_0;
sensitive <<inputsMuxULAMips_1;

				
        }       
	};
	#endif
	
