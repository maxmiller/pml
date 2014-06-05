package PMLGen.wrapper;

import br.ufrn.lasic.pml.ControlUnit;
import br.ufrn.lasic.pml.Decoder;
import br.ufrn.lasic.pml.Demultiplexor;
import br.ufrn.lasic.pml.Input;
import br.ufrn.lasic.pml.Memory;
import br.ufrn.lasic.pml.Multiplexor;
import br.ufrn.lasic.pml.Output;
import br.ufrn.lasic.pml.Processor;
import br.ufrn.lasic.pml.Register;
import br.ufrn.lasic.pml.SignalEvent;
import br.ufrn.lasic.pml.ULA;


public class ForSensitive {

	public String forSensitive(String name, Integer tamanho) {
		String text = "";
		if (tamanho > 1) {
			for (int i = 0; i < tamanho; i++) {
				text += "sensitive <<" + name + "[" + i + "]" + ";\n";
			}
		} else {
			text += "sensitive <<" + name + ";\n";
		}
		return text;
	}

	public String forSensitiveTimed(String name, Integer tamanho) {
		String text = "";
		if (tamanho > 1) {
			for (int i = 0; i < tamanho; i++) {
				text += "sensitive <<" + name + "_" + i + ";\n";
			}
		} else {
			text += "sensitive <<" + name + ";\n";
		}
		return text;
	}

	public String forIn(String name, String type, Integer bits, Integer length) {
		System.out.println("name:" + name);
		System.out.println("type:" + type);
		System.out.println("bits:" + bits);
		System.out.println("length:" + length);

		String text = "";
		if (type.equalsIgnoreCase("Int") || type.isEmpty() || type == null
				|| type.equals("binary")) {
			text += " sc_int<" + bits + "> ";
		} else if (type.equalsIgnoreCase("Boolean")) {
			text += " sc_bool ";
		}
		if (length > 1) {
			text += " *";
		}
		text += name + ";";
		return text;

	}

	public String forInTimed(String name, String type, Integer bits, Integer length) {
		System.out.println("name:" + name);
		System.out.println("type:" + type);
		System.out.println("bits:" + bits);
		System.out.println("length:" + length);
		String text=null;
		if(length>1){
			for(int i=0;i<length;i++){
				text += "sc_in<";
				if (type.equalsIgnoreCase("Int") || type.isEmpty() || type == null
						|| type.equals("binary")) {
					text += " sc_int<" + bits + "> >";
				} else if (type.equalsIgnoreCase("Boolean")) {
					text += " sc_bool >";
				}
				if (length > 1) {
					text += name + "_"+i+";\n";
				}
			}
		}else{
			text = "sc_in<";
			if (type.equalsIgnoreCase("Int") || type.isEmpty() || type == null
					|| type.equals("binary")) {
				text += " sc_int<" + bits + "> >";
			} else if (type.equalsIgnoreCase("Boolean")) {
				text += " sc_bool >";
			}

			text += name + ";";
		}
		return text;

	}

	public String switchIn(String nameInput, String nameSelector,String nameOut, Integer length){
		String text = null;
		text = "switch("+nameSelector+".read.to_int()){";
		for(int i = 0;i<length;i++){
			text+="\n case "+i+":\n";
			text+=nameOut+"="+nameInput+"_"+i+";\n" ;
			text+="break;\n";
		}
		text+="default:\n"+nameOut+"= 0 ; \n break;\n } ";
		return text;
	}




	public String forOut(String name, String type, Integer bits, Integer length) {
		String text = "sc_out<";
		if (type.equalsIgnoreCase("Int") || type.isEmpty() || type == null
				|| type.equals("binary")) {
			text += " sc_int<" + bits + "> >";
		} else if (type.equalsIgnoreCase("Boolean")) {
			text += " sc_bool >";
		}
		if (length > 1) {
			text += " *";
		}
		text += name + ";";
		return text;

	}

	public String forSel(String name, String type, Integer bits) {
		String text = "sc_in<";
		if (type.equalsIgnoreCase("Int") || type.isEmpty() || type == null
				|| type.equals("binary")) {
			text += " sc_int<" + bits + "> >";
		} else if (type.equalsIgnoreCase("Boolean")) {
			text += " sc_bool >";
		}

		text += name + ";";
		return text;

	}

	public String processSignal(Processor p){
		StringBuilder str = new StringBuilder();
		for(SignalEvent s:p.getProcessorSignalEvents()){
			str.append("sc_signal< type >");
			str.append(s.getName());
			str.append("; \n");
			for(Input i : s.getSignalIn()){
				System.out.println("inputs");
				str.append(processInput(p, i, s));
			}
			for(Output i : s.getSignalOut()){
				System.out.println("outputs");
				str.append(processOutput(p, i, s));
			}
		}
		return str.toString();
	}

	private String processInput(Processor p, Input i, SignalEvent s){
		System.out.println(p);
		System.out.println(i);
		System.out.println(s);

		StringBuilder str = new StringBuilder();
		if(str.length()==0){
			for(ULA u:p.getUlas()){

				if(u.getInputsULA().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Multiplexor u:p.getMux()){
				if(u.getInmux().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Demultiplexor u:p.getDemux()){
				if(u.getIndemux().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Decoder u:p.getDecoders()){
				if(u.getInDecoder().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Register u:p.getRegisters()){
				if(u.getInputRegister().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Memory u:p.getMemories()){
				if(u.getInputMemory().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(ControlUnit u:p.getControlUnits()){
				if(u.getInputsControlUnit().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}

		return str.toString();
	}

	private String processOutput(Processor p, Output i, SignalEvent s){
		System.out.println(p);
		System.out.println(i);
		System.out.println(s);

		StringBuilder str = new StringBuilder();
		if(str.length()==0){
			for(ULA u:p.getUlas()){

				if(u.getOutputsULA().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Multiplexor u:p.getMux()){
				if(u.getOutmux().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Demultiplexor u:p.getDemux()){
				if(u.getOutdemux().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Decoder u:p.getDecoders()){
				if(u.getOutDecoder().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Register u:p.getRegisters()){
				if(u.getOutputRegister().equals(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(Memory u:p.getMemories()){
				if(u.getOutputMemory().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}else if (str.length()==0){
			for(ControlUnit u:p.getControlUnits()){
				if(u.getOutputsControlUnit().contains(i)){
					str.append(u.getName());
					str.append("->");
					str.append(i.getName());
					str.append("(");
					str.append(s.getName());
					str.append(");\n");
				}
			}
		}

		return str.toString();
	}

	public String registerUntimed(Register r ){
		StringBuilder str = new StringBuilder();
		str.append("sc_int<WORD_SIZE> *");
		str.append(r.getName());
		str.append(";\n");
		return str.toString();
	}

	public String registerTimed(Register r ){
		StringBuilder str = new StringBuilder();
		for(int i=0;i<r.getLength();i++){
			str.append("sc_int<WORD_SIZE> ");
			str.append(r.getName());
			str.append("_");
			str.append(i);
			str.append(" ;\n");
		}
		return str.toString();
	}
	
	public String processMux(Processor p){
		StringBuilder str = new StringBuilder();
		for(Multiplexor c : p.getMux()){
			
				
			
		}
		return str.toString();
	}
}
