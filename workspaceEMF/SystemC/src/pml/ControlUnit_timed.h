	#ifndef ControlUnit_h
	#define  ControlUnit_h
	#include "systemc.h"
	
	SC_MODULE(ControlUnit){
	     	sc_in< sc_int<6> >operation;	    
	     	sc_in< sc_bool >clock;	    
	  	sc_out< sc_bool >MemWrite;	    
	  	sc_out< sc_bool >IorD;	    
	  	sc_out< sc_bool >MemRead;	    
	  	sc_out< sc_bool >MemtoReg;	    
	  	sc_out< sc_bool >IRWrite;	    
	  	sc_out< sc_bool >PCWriteCond;	    
	  	sc_out< sc_bool >PCWrite;	    
	  	sc_out< sc_int<32> >PCSource;	    
	  	sc_out< sc_int<32> >AluOP;	    
	  	sc_out< sc_int<32> >AluScrA;	    
	  	sc_out< sc_int<32> >AluScrB;	    
	  	sc_out< sc_int<32> >RegWrite;	    
	  	sc_out< sc_int<32> >RegDest;	    
        	void execute(); 
		SC_CTOR(ControlUnit) {
	        	SC_THREAD(execute); 
				  sensitive <<operation;

				  sensitive <<clock;

        }       
	};
	#endif
	
