	#ifndef InstructionMemory_h
	#define  InstructionMemory_h
	#include "systemc.h"
	
	SC_MODULE(InstructionMemory){
	    	sc_in< sc_int<32> >RA_InstructionMemory;	    
	  		sc_out< sc_int<32> >Instruction_IntructionMemory;	    
        	void execute(); 
        
		SC_CTOR(InstructionMemory) {
	        	SC_THREAD(execute); 
				      sensitive <<RA_InstructionMemory;

        }       
    	};
	#endif
	
