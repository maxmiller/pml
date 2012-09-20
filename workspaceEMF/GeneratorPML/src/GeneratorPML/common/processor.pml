<?xml version="1.0" encoding="UTF-8"?>
<pml:Processor xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pml="/PML/model/pml.ecore">
  <demux name="demux">
    <behaviorsDemux name="DemultiplexerBehaviour" typeBehavior="Void"/>
    <behaviorsDemux name="numOutputs"/>
    <indemux name="in" length="1"/>
    <outdemux name="out" length="4"/>
  </demux>
  <ulas name="ula">
    <behavirosULA/>
    <outputsULA/>
    <inputsULA/>
    <operationsULA/>
  </ulas>
  <registers name="registerfile">
    <outputs name="out" length="1"/>
    <inputsRegister name="in" length="1"/>
    <inputsRegister name="rwBit" length="1"/>
    <inputsRegister name="sel" length="1"/>
  </registers>
  <registers name="registerassyncreset">
    <behaviorRegister name="RegisterBehaviour" typeBehavior="Void"/>
    <outputs name="dataOut" length="1"/>
    <inputsRegister name="dataIn" length="1"/>
    <inputsRegister name="load" length="1"/>
  </registers>
  <mux name="mux">
    <behaviormux name="multiplexerBehavior" typeBehavior="Void"/>
    <behaviormux name="numInputs"/>
    <outmux name="out" length="1"/>
    <inmux name="in" length="4"/>
    <inmux name="sel" length="1"/>
  </mux>
  <controlUnits name="controlunit"/>
</pml:Processor>
