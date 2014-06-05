	#ifndef muxIR_h
	#define  muxIR_h
	#include "systemc.h"
	
	SC_MODULE(muxIR){
	    	sc_in< sc_int<6> > *inputsMuxIR;	    
	    	sc_out< sc_int<6> >outputMuxIR;	    
	    	sc_in< sc_int<32> >selMuxIR;	    
        	void execute();/*
			{
				if(selMuxIR.read().to_int() < num_inputs){
					outputMuxIR = inputsMuxIR[selMuxIR.read().to_int()] ;
				}else{
					outputMuxIR = inputsMuxIR[0] ;
				}
			    wait(1);

			}*/
        
		SC_CTOR(muxIR) {
        	
			
	        	SC_METHOD(execute); 
				   sensitive <<inputsMuxIR[0];
sensitive <<inputsMuxIR[1];

        }       
	};
	#endif
	
