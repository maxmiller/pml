package PMLGen.wrapper;

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

	public String forIn(String name, String type, Integer bits, Integer length) {
		System.out.println("name:" + name);
		System.out.println("type:" + type);
		System.out.println("bits:" + bits);
		System.out.println("length:" + length);

		String text = "sc_in<";
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

}
