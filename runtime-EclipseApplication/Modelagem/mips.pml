<?xml version="1.0" encoding="UTF-8"?>
<pml:Processor xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pml="http://pml/0.1" name="MIPS32">
  <demux name="demux">
    <behaviorsDemux name="execute" typeBehavior="Void"/>
    <indemux name="input" type="Int" sensitive="true" bit="32"/>
    <outdemux name="output" sensitive="true" length="4" bit="32"/>
    <seletordemux name="selector" type="Int" bit="32"/>
  </demux>
</pml:Processor>
