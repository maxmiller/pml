	#ifndef MIPS32_h
	#define  MIPS32_h
	#include "systemc.h"
	
	SC_MODULE(MIPS32){

		sc_in_clk clock;
		
	       demux *demux_;
		SC_CTOR(MIPS32) {
	        demux_ = new  demux();
        }       
	};
	#endif
