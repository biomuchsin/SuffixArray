package executables;

import muchsin.NaiveSuffixArrayBuilder;
import muchsin.SuffixArrayBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunSuffixArray {

	public static void main(String[] args) throws IOException {
//		boolean debug = false;
//		int o = 0;
//		if (args.length>0 && args[0].equals("-debug")) {
//			debug = true;
//			o++;
//		}
//
//		if (args.length!=o+1 || !new File(args[o]).exists()) {
//			System.err.println("algobio.sa.Main [-debug] <fasta>");
//			System.exit(1);
//		}
//
//		// read fasta file
//		StringBuilder sb = new StringBuilder();
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[o])))) {
//
//			String line;
//			while ((line=br.readLine())!=null) {
//				if (line.startsWith(">")) {
//					if (sb.length()>0) {
//						System.err.println("WARNING: More than one sequence in fasta file, ignoring all but the first!");
//						break;
//					}
//				}
//				else
//					sb.append(line);
//			}
//
//		}
//		sb.append('$');
//		SuffixArrayBuilder sab = new NaiveSuffixArrayBuilder();
//		int[] sa = sab.build(sb.toString());
//
//		if (debug) {
//			sab.check(sb.toString(), sa);
//			sab.output(System.out, sb.toString(), sa, 0, sa.length,80);
//		}
//		else
//			sab.output(System.out, sb.toString(), sa, 0, sa.length);
		
	}
	
}
