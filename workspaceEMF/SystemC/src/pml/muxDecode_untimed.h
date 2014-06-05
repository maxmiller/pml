	#ifndef muxDecode_h
	#define  muxDecode_h
	#include "systemc.h"
	
	SC_MODULE(muxDecode){
	    	sc_in< sc_int<6> > *inputsMuxDecode;	    
	    	sc_out< sc_int<6> >outputMuxDecode;	    
	    	sc_in< sc_int<32> >selMuxDecode;	    
        	void execute();/*
			{
				if(selMuxDecode.read().to_int() < num_inputs){
					outputMuxDecode = inputsMuxDecode[selMuxDecode.read().to_int()] ;
				}else{
					outputMuxDecode = inputsMuxDecode[0] ;
				}
			    wait(1);

			}*/
        
		SC_CTOR(muxDecode) {
        	
			
	        	SC_METHOD(execute); 
				   sensitive <<inputsMuxDecode[0];
sensitive <<inputsMuxDecode[1];

        }       
	};
	#endif
	
