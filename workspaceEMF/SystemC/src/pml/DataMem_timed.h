	#ifndef DataMem_h
	#define  DataMem_h
	#include "systemc.h"
	
	SC_MODULE(DataMem){
	    	sc_in< sc_int<32> >addressDataMem;	    
	    	sc_in< sc_bool >writeDataMem;	    
	    	sc_in< sc_int<32> >memWriteDataMem;	    
	  		sc_out< sc_int<32> >readDataMem;	    
        	void execute(); 
        
		SC_CTOR(DataMem) {
	        	SC_THREAD(execute); 
        }       
    	};
	#endif
	
