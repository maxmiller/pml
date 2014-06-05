	#ifndef DLX_h
	#define  DLX_h
	#include "systemc.h"
	
	SC_MODULE(DLX){

		sc_in_clk clock;
			
	       unitcontrol *unitcontrol_;
	       ulaDLX *uladlx_;
	       mux01 *mux01_;
	       mux02 *mux02_;
	       mux03 *mux03_;
	       mux04 *mux04_;
	       DataMem *datamem_;
	       InstructionMemory *instructionmemory_;
	       registerFile *registerfile_;
	       PC *pc_;
		SC_CTOR(DLX) {
	       unitcontrol_ = new  unitcontrol();
	        uladlx_ = new  ulaDLX();
	        mux01_ = new  mux01();
	        mux02_ = new  mux02();
	        mux03_ = new  mux03();
	        mux04_ = new  mux04();
	        datamem_ = new  DataMem();
	        instructionmemory_ = new  InstructionMemory();
	        registerfile_ = new  registerFile();
	        pc_ = new  PC();
        }       
	};
	#endif
