<?xml version="1.0" encoding="UTF-8"?>
<pml:Processor xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pml="http://pml/0.1" name="CORTEX M3">
  <ulas name="ulaCortex">
    <behavirosULA name="execution"/>
    <outputsULA name="Result" length="1" bit="32"/>
    <outputsULA name="status" type="Boolean" length="1" bit="32"/>
    <inputsULA name="opA" length="1" bit="32"/>
    <inputsULA name="opB" length="1" bit="32"/>
    <inputsULA name="cond" length="1" bit="6"/>
    <operationsULA name="add"/>
    <operationsULA name="adc"/>
    <operationsULA name="sub"/>
    <operationsULA name="suc"/>
    <operationsULA name="rsb"/>
    <operationsULA name="rsc"/>
    <operationsULA name="cmp"/>
    <operationsULA name="cmn"/>
    <operationsULA name="tst"/>
    <operationsULA name="teq"/>
    <operationsULA name="and"/>
    <operationsULA name="orr"/>
    <operationsULA name="eor"/>
    <operationsULA name="bic"/>
    <operationsULA name="mov"/>
    <operationsULA name="mvn"/>
    <seletorULA name="op" lengh="1" bit="6"/>
    
  </ulas>
  <registers name="registerFile" length="32">
    <outputRegister name="dataOut" length="1" bit="32"/>
    <inputRegister name="clock" type="Boolean" length="1" sensitive="true"/>
    <inputRegister name="writeMem" type="Boolean" length="1" bit="32"/>
    <inputRegister name="address" length="1" bit="32"/>
    <inputRegister name="dataIn" length="1" bit="32"/>
  </registers>
  <memories name="DataMem" length="32">
    <inputMemory name="address" length="1" bit="32"/>
    <inputMemory name="write" type="Boolean" length="1" bit="32"/>
    <inputMemory name="we" length="1" bit="32"/>
    <outputMemory name="dataOut" length="1" bit="32"/>
  </memories>
  <memories name="InstructionMemory" length="32">
    <inputMemory name="address" length="1" bit="32"/>
    <outputMemory name="dataMem" length="1" bit="32"/>
  </memories>
  <mux name="mux">
    <outmux name="out" type="Int" length="1" bit="32"/>
    <inmux name="inputs" type="Int" length="4" bit="32"/>
    <seletormux name="sel" type="Int" lengh="1" bit="32"/>
  </mux>
  <controlUnits name="unitcontrol">
    <inputsControlUnit name="opcode" length="1" sensitive="true" bit="6"/>
    <inputsControlUnit name="funct" length="1" sensitive="true" bit="6"/>
    <outputsControlUnit name="MemRead" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="Branch" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="RegDst" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="MemtoReg" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="MemWrite" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="RegWrite" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="AluSrc" type="Boolean" length="1" bit="32"/>
    <outputsControlUnit name="ALUOp" length="1" bit="3"/>
  </controlUnits>
  <decoders name="decoder">
    <outDecoder name="cod" length="1" bit="4"/>
    <outDecoder name="data" length="1" bit="3"/>
    <outDecoder name="rs" length="1" bit="4"/>
    <outDecoder name="rt" length="1" bit="4"/>
    <outDecoder name="rd" length="1" bit="4"/>
    <outDecoder name="data" length="1" bit="28"/>
    <inDecoder name="instruction" length="1" bit="32"/>
    <inDecoder name="clock" type="Boolean" length="1" sensitive="true" bit="1"/>
    <inDecoder name="condition" type="Boolean" length="1" bit="1"/>
    <inDecoder name="data" type="Boolean" length="1" bit="1"/>
    <inDecoder name="multiplication" type="Boolean" length="1" bit="1"/>
    <inDecoder name="coprocessor" type="Boolean" length="1" bit="1"/>
    <inDecoder name="coprocessorlt" type="Boolean" length="1" bit="1"/>
  </decoders>
</pml:Processor>
