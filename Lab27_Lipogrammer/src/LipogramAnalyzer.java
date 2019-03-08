/*
 * Author: Bryan Huang
 * Date: 03/01/19
 * Description: A lipogram program
 */

import java.util.ArrayList;

public class LipogramAnalyzer {
	String in;

	public LipogramAnalyzer(String in) {
		this.in = in;
	}

	public String mark(char letter) {
		return this.in.replaceAll(letter + "", "#");
	}

	public String allWordsWith(char letter) {
		ArrayList<String> words = new ArrayList<>();

		String extracted = "";
		for (String word : in.replaceAll("\n", "").replaceAll("\t", "").split("\\s")) {
			if (word.toLowerCase().contains(letter + "")) {
				// Extract just the word
				for (char c : word.toCharArray()) {
					if (Character.isLetter(c)) {
						extracted += "" + c;
					}
				}

				if (!words.contains(extracted.toLowerCase())) {
					words.add(extracted.toLowerCase());
				}

				extracted = "";
			}
		}

		String results = "";
		for (int i = 0; i < words.size(); i++) {
			if (i == words.size() - 1) {
				results += words.get(i);
			} else {
				results += words.get(i) + "\n";
			}
		}

		return results;
	}
}