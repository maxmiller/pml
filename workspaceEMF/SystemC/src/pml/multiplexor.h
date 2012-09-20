	#ifndef multiplexor_h
	#define  multiplexor_h
	#include "systemc.h"
	

	SC_MODULE (multiplexor) {
	        sc_in<sc_int<  0 > >    * inputs;  
 	        
       
	        sc_in<sc_int<  0 > >   out;  

	        sc_in<sc_int<  0 > >   sel;  

        
		SC_CTOR(multiplexor) {
        
				
        }       


	};
	#endif
	
