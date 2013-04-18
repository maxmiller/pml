package transcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeneratorInstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new FileReader("/Users/maxmiller/Desktop/alu_vliw.txt"));
			String str;
			File file = new File("/Users/maxmiller/Desktop/alu_vliw_1.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file,false);
			PrintWriter print = new PrintWriter(writer);
			while (in.ready()) {
				str = in.readLine();
				//String argsp[]=str.split("-);
				//System.out.println(str.split("-")[0]);
				print.append("<operationsULA name=\""+str.split("-")[0]+"\"/> \n");
				
			}
			print.close();
			in.close();
		} catch (IOException e) {
		}


	}

}
