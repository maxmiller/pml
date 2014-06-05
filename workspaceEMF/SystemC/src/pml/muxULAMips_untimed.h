	#ifndef muxULAMips_h
	#define  muxULAMips_h
	#include "systemc.h"
	
	SC_MODULE(muxULAMips){
	    	sc_in< sc_int<32> > *inputsMuxULAMips;	    
	    	sc_out< sc_int<6> >outputMuxULAMips;	    
	    	sc_in< sc_int<32> >selMuxULAMips;	    
        	void execute();/*
			{
				if(selMuxULAMips.read().to_int() < num_inputs){
					outputMuxULAMips = inputsMuxULAMips[selMuxULAMips.read().to_int()] ;
				}else{
					outputMuxULAMips = inputsMuxULAMips[0] ;
				}
			    wait(1);

			}*/
        
		SC_CTOR(muxULAMips) {
        	
			
	        	SC_METHOD(execute); 
				   sensitive <<inputsMuxULAMips[0];
sensitive <<inputsMuxULAMips[1];

        }       
	};
	#endif
	
