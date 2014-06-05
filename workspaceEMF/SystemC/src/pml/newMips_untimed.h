	#ifndef newMips_h
	#define  newMips_h
	#include "systemc.h"
	
	SC_MODULE(newMips){

		sc_in_clk clock;
		sc_signal< type >control_unit_1; 
sc_signal< type >control_unit_2; 
sc_signal< type >control_unit_3; 
sc_signal< type >control_unit_4; 
sc_signal< type >control_unit_5; 
sc_signal< type >ir_mux_ula; 
sc_signal< type >fetchInstruction_pc; 
AddIR->inputAddIRA(fetchInstruction_pc);
sc_signal< type >fetchInstruction_decode; 
sc_signal< type >decode2521; 
sc_signal< type >decode2016; 
sc_signal< type >decode1511; 
sc_signal< type >muxDecode; 
sc_signal< type >ir_ula; 
ULAMips->inputULAMips(ir_ula);
sc_signal< type >mux_ula; 
ULAMips->inputULAMips(mux_ula);
sc_signal< type >dataMemUla; 
ULAMips->resultULAMips(dataMemUla);
sc_signal< type >irdatamem; 
sc_signal< type >ula_mux; 
ULAMips->resultULAMips(ula_mux);
sc_signal< type >dataMemMux; 
	
			sc_signal< sc_ > > control_unit_1;
				
			
			sc_signal< sc_ > > control_unit_2;
				
			
			sc_signal< sc_ > > control_unit_3;
				
			
			sc_signal< sc_ > > control_unit_4;
				
			
			sc_signal< sc_ > > control_unit_5;
				
			
			sc_signal< sc_ > > ir_mux_ula;
				
			
			sc_signal< sc_ > > fetchInstruction_pc;
				
			
			sc_signal< sc_ > > fetchInstruction_decode;
				
			
			sc_signal< sc_ > > decode2521;
				
			
			sc_signal< sc_ > > decode2016;
				
			
			sc_signal< sc_ > > decode1511;
				
			
			sc_signal< sc_ > > muxDecode;
				
			
			sc_signal< sc_ > > ir_ula;
				
			
			sc_signal< sc_ > > mux_ula;
				
			
			sc_signal< sc_ > > dataMemUla;
				
			
			sc_signal< sc_ > > irdatamem;
				
			
			sc_signal< sc_ > > ula_mux;
				
			
			sc_signal< sc_ > > dataMemMux;
				
			
	       ControlUnit *controlunit_;
	       AddIR *addir_;
	       ULAMips *ulamips_;
	       DecoderMips *decodermips_;
	       muxDecode *muxdecode_;
	       muxIR *muxir_;
	       muxULAMips *muxulamips_;
	       InstructionMemory *instructionmemory_;
	       DataMem *datamem_;
	       PC *pc_;
	       registerFile *registerfile_;
		SC_CTOR(newMips) {
	       controlunit_ = new  ControlUnit();
	        addir_ = new  AddIR();
	        ulamips_ = new  ULAMips();
	        decodermips_ = new  DecoderMips();
	        muxdecode_ = new  muxDecode();
	        muxir_ = new  muxIR();
	        muxulamips_ = new  muxULAMips();
	        instructionmemory_ = new  InstructionMemory();
	        datamem_ = new  DataMem();
	        pc_ = new  PC();
	        registerfile_ = new  registerFile();
        }       
	};
	#endif
