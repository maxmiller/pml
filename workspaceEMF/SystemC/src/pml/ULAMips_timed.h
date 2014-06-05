	#ifndef ULAMips_h
	#define  ULAMips_h
	#include "systemc.h"
	
	SC_MODULE(ULAMips){
	 	typedef enum ULAOPERATION_{
			ulaOperation_add,
			ulaOperation_sub,
		}
	    	sc_in< sc_int<32> >inputULAMips;	    
	    	sc_in< sc_int<32> >inputULAMipsB;	    
	    	sc_out< sc_int<32> >resultULAMips;	    
	    	sc_out<zeroULAMips;	    
	    	sc_in< sc_int<5> >operationULAMips;	    
        	void execute(); 
			/*
				
			*/
        
        
		SC_CTOR(ULAMips) {
        
	        	SC_THREAD(execute); 
				      sensitive <<inputULAMips;

				
				      sensitive <<inputULAMipsB;

				
        }       


	};
	#endif
	
