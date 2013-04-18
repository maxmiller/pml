	#ifndef demux_h
	#define  demux_h
	#include "systemc.h"
	
	SC_MODULE(demux){
	    	sc_in< sc_int<32> >input;	    
	    	sc_out< *output;	    
	    	sc_in< sc_int<32> >selector;	    
        	void execute(); 
		SC_CTOR(demux) {
	        	SC_METHOD(execute); 
				    sensitive <<input;

        }       
	};
	#endif
	
