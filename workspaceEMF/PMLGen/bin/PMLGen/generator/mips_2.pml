<?xml version="1.0" encoding="UTF-8"?>
<pml:Processor xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pml="http://pml/0.1" name="MIPS">
  <ulas name="ulaMIPS">
    <behavirosULA name="execution"/>
    <outputsULA name="Result" type="Int" length="1" bit="32"/>
    <outputsULA name="status" type="Boolean" length="1"/>
    <inputsULA name="opA" type="Int" length="1" bit="32"/>
    <inputsULA name="opB" type="Int" length="1" bit="32"/>
    <operationsULA name="add"/>
    <operationsULA name="sub"/>
    <operationsULA name="and"/>
    <operationsULA name="or"/>
    <operationsULA name="slt"/>
    <operationsULA name="lw"/>
    <operationsULA name="sw"/>
    <operationsULA name="beq"/>
    <operationsULA name="j"/>
    <seletorULA name="op" type="Int" lengh="1" bit="6"/>
  </ulas>
  <registers name="registerFile" length="32">
    <outputRegister name="dataOut" type="Int" length="1" bit="32"/>
    <inputRegister name="clock" type="Boolean" length="1" sensitive="true"/>
    <inputRegister name="writeMem" type="Boolean" length="1"/>
    <inputRegister name="address" type="Int" length="1" bit="32"/>
    <inputRegister name="dataIn" type="Int" length="1" bit="32"/>
  </registers>
  <memories name="DataMem" length="32">
    <inputMemory name="address" type="Int" length="1" bit="32"/>
    <inputMemory name="write" type="Boolean" length="1"/>
    <inputMemory name="we" type="Int" length="1" bit="32"/>
    <outputMemory name="dataOut" type="Int" length="1" bit="32"/>
  </memories>
  <memories name="InstructionMemory" length="32">
    <inputMemory name="address" type="Int" length="1" bit="32"/>
    <outputMemory name="dataMem" type="Int" length="1" bit="32"/>
  </memories>
  <mux name="mux">
    <behaviormux name="multiplexerBehavior" typeBehavior="Int"/>
    <outmux name="out" type="Int" length="1" bit="32"/>
    <inmux name="inputs" type="Int" length="4" sensitive="true" bit="32"/>
    <seletormux name="sel" type="Int" lengh="1" bit="32"/>
  </mux>
  <controlUnits name="unitcontrol">
    <inputsControlUnit name="opcode" type="Int" length="1" sensitive="true" bit="6"/>
    <inputsControlUnit name="funct" type="Int" length="1" sensitive="true" bit="6"/>
    <outputsControlUnit name="MemRead" type="Boolean" length="1" bit="1"/>
    <outputsControlUnit name="Branch" type="Int" length="1" bit="32"/>
    <outputsControlUnit name="RegDst" type="Int" length="1" bit="32"/>
    <outputsControlUnit name="MemtoReg" type="Int" length="1" bit="32"/>
    <outputsControlUnit name="MemWrite" type="Boolean" length="1" bit="1"/>
    <outputsControlUnit name="RegWrite" type="Boolean" length="1" bit="1"/>
    <outputsControlUnit name="AluSrc" type="Int" length="1" bit="32"/>
    <outputsControlUnit name="ALUOp" type="Int" length="1" bit="3"/>
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
    <outDecoder name="op" type="Int" length="1" bit="6"/>
    <outDecoder name="rs" type="Int" length="1" bit="5"/>
    <outDecoder name="rt" type="Int" length="1" bit="5"/>
    <outDecoder name="rd" type="Int" length="1" bit="5"/>
    <outDecoder name="shamt" type="Int" length="1" bit="5"/>
    <outDecoder name="func" type="Int" length="1" bit="6"/>
    <outDecoder name="immediate" type="Int" length="1" bit="16"/>
    <outDecoder name="addrres" type="Int" length="1" bit="26"/>
    <inDecoder name="instruction" type="Int" length="1" bit="32"/>
    <inDecoder name="clock" type="Boolean" length="1" sensitive="true" bit="1"/>
    <inDecoder name="typeR" type="Boolean" length="1" bit="1"/>
    <inDecoder name="typeI" type="Boolean" length="1" bit="1"/>
    <inDecoder name="typeJ" type="Boolean" length="1" bit="1"/>
  </decoders>
</pml:Processor>
