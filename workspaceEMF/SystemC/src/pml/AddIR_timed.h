	#ifndef AddIR_h
	#define  AddIR_h
	#include "systemc.h"
	
	SC_MODULE(AddIR){
	 	typedef enum ULAOPERATION_{
			ulaOperation_add,
		}
	    	sc_in< sc_int<32> >inputAddIRA;	    
	    	sc_in<inputAddIRB;	    
	    	sc_out< sc_int<32> >outAddIR;	    
	    	sc_in<selector;	    
        	void execute(); 
			/*
				
			*/
        
        
		SC_CTOR(AddIR) {
        
	        	SC_THREAD(execute); 
				      sensitive <<inputAddIRA;

				
				
        }       


	};
	#endif
	
