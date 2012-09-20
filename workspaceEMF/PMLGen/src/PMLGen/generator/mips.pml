<?xml version="1.0" encoding="UTF-8"?>
<pml:Processor xmi:version="2.0" 
  xmlns:xmi="http://www.omg.org/XMI" 
  xmlns:pml="http://pml/0.1" name="MIPS">
  <ulas name="ulaMIPS">
    <behavirosULA name="execution"/>
    <outputsULA name="Result" length="32"/>
    <outputsULA name="status" type="Boolean"/>
    <inputsULA name="opA" length="32"/>
    <inputsULA name="opB" length="32"/>
    <operationsULA name="add"/>
    <operationsULA name="sub"/>
    <operationsULA name="and"/>
    <operationsULA name="or"/>
    <operationsULA name="slt"/>
    <operationsULA name="lw"/>
    <operationsULA name="sw"/>
    <operationsULA name="beq"/>
    <operationsULA name="j"/>
    <seletorULA name="op" lengh="6"/>
  </ulas>
  <registers name="registerFile" length="32">
    <outputRegister name="dataOut" length="32"/>
    <inputRegister name="clock" type="Boolean" sensitive="true"/>
    <inputRegister name="writeMem" type="Boolean"/>
    <inputRegister name="address" length="32"/>
    <inputRegister name="dataIn" length="32"/>
  </registers>
  <memories name="DataMem" length="32">
    <inputMemory name="address" length="32"/>
    <inputMemory name="write" type="Boolean"/>
    <inputMemory name="we" length="32"/>
    <outputMemory name="dataOut" length="32"/>
  </memories>
  <memories name="InstructionMemory" length="32">
    <inputMemory name="address" length="32"/>
    <outputMemory name="dataMem" length="32"/>
  </memories>
  <mux name="multiplexor">
    <outmux name="out" type="Int"/>
    <inmux name="inputs" type="Int" length="4"/>
    <seletormux name="sel" type="Int"/>
  </mux>
  <controlUnits>
    <inputsControlUnit name="opcode" length="6" sensitive="true"/>
    <inputsControlUnit name="funct" length="6" sensitive="true"/>
    <outputsControlUnit name="MemRead" type="Boolean"/>
    <outputsControlUnit name="Branch" type="Boolean"/>
    <outputsControlUnit name="RegDst" type="Boolean"/>
    <outputsControlUnit name="MemtoReg" type="Boolean"/>
    <outputsControlUnit name="MemWrite" type="Boolean"/>
    <outputsControlUnit name="RegWrite" type="Boolean"/>
    <outputsControlUnit name="AluSrc" type="Boolean"/>
    <outputsControlUnit name="ALUOp" length="3"/>
    <intructions type="R" name="ADD">
      <initial name="decode">
        <next name="execution">
          <final name="completation"/>
        </next>
      </initial>
    </intructions>
    <intructions type="R" name="SUB">
      <initial name="decode">
        <next name="execution">
          <final name="completation"/>
        </next>
      </initial>
    </intructions>
    <intructions type="R" name="OR">
      <initial name="decode">
        <next name="execution">
          <final name="completation"/>
        </next>
      </initial>
    </intructions>
    <intructions type="R" name="SLT">
      <initial name="decode">
        <next name="execution">
          <final name="completation"/>
        </next>
      </initial>
    </intructions>
    <intructions type="R" name="AND">
      <initial name="decode">
        <next name="execution">
          <final name="completation"/>
        </next>
      </initial>
    </intructions>
    <intructions type="I" name="SW">
      <initial name="decode">
        <next name="MemAddressComputation">
          <final name="MemoryAcessWrite"/>
        </next>
      </initial>
    </intructions>
    <intructions type="I" name="LW">
      <initial name="decode">
        <next name="MemAddressComputation">
          <nextMicroinstruction name="MemAcessRead">
            <final name="WriteBackStep"/>
          </nextMicroinstruction>
        </next>
      </initial>
    </intructions>
    <intructions type="I" name="BEQ">
      <initial name="decode">
        <directFinalMicroInstruction name="branchcompletation"/>
      </initial>
    </intructions>
        <intructions type="J" name="Jump">
      <initial name="decode">
        <directFinalMicroInstruction name="jumpcompletation"/>
      </initial>
    </intructions>
  </controlUnits>
  <decoders name="decoder">
    <outDecoder name="op" length="6"/>
    <outDecoder name="rs" length="5"/>
    <outDecoder name="rt" length="5"/>
    <outDecoder name="rd" length="5"/>
    <outDecoder name="shamt" length="5"/>
    <outDecoder name="func" length="6"/>
    <outDecoder name="immediate" length="16"/>
    <outDecoder name="addrres" length="26"/>
    <inDecoder name="instruction" length="32"/>
    <inDecoder name="clock" type="Boolean" sensitive="true"/>
    <inDecoder name="typeR" type="Boolean"/>
    <inDecoder name="typeI" type="Boolean"/>
    <inDecoder name="typeJ" type="Boolean"/>
  </decoders>
</pml:Processor>