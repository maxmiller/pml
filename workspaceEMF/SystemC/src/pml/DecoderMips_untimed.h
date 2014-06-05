	#ifndef DecoderMips_h
	#define  DecoderMips_h
	#include "systemc.h"
	
	SC_MODULE(DecoderMips){
	    	sc_in<inputDecoder;	    
	    	sc_out< sc_int<6> >Instruction31_26;	    
	    	sc_out< sc_int<5> >Instruction25_21;	    
	    	sc_out< sc_int<5> >Instruction20_16;	    
	    	sc_out< sc_int<16> >Instruction15_0;	    
	    	sc_out< sc_int<5> >Instruction15_11;	    
		SC_CTOR(DecoderMips) {
				   sensitive <<inputDecoder;

        }       
	};
	#endif
	
