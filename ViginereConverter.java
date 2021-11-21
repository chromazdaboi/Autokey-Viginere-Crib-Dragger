
public class ViginereConverter {

	public ViginereConverter() {
	}

	public static String stringToBreak = "KTVQCDFYHIXTOEXTGNLNGAOYTPQYWAHIPCTULCNOEPLTSRWTVEFLYJTIGBBKGLRHKYHVQJRAXXZKSVYHHUSLASHEZKLCXWTNVBAWPEGFSHGPNDNAHWAMBRFJQXUXKKVEKPGTZNHEJFTELWLVBBSIFEGHMSMTTVIMVBZZADDVQHUJYPMRBTECTLPGUEBIXMRIASZZOIDGHIMOOWQECGKLVCWXMTZAQDEBKKTFJWXAORWGERAPOLECIVCPIWEVMEYLAUFWMUSKJKKZSBJDPBONRZIHVXFFXNGAKFFBWTHYWZTFFMZLMGGYPRRGJOGXKYEYEKEEFQCOZWCUGEKPDBIZLPGWTHZBUPTVKFHELZVMEFTZLPSMVDHHVPIEMIOVXIHONNMKROJCTZBMKHIYHLAMXKLZVMRUZCXITYUAOURERGOYBREVBXCDKHNFTBKNDOTXRAJHYPRNQNWMISSKYIJPMNVYHTMKVBBYLUMYVLZHPBWUKHGPPMLMDCMCMRHVUPELDAZSBLTRWMUBHWNMYPAGTFLYJNWMVQTLRGVKOLYYANLWGOUDGVAJCSGEEZVRBNJARAEIZXXIGWFOINSMTQFBYBSXPPHHYSNZQHVFIESZWUBWQDOGVUURSKWAPQDLVVUKEYXWGAWBASOWQLMLKNVAVARLCFHSJWVRBRKUKPCIEOIWGWARARWYTFRALCPDFVOPIQWSRUMUASRAGYKZIIEOBCIKVFGZTJWMWYWZJHYIZESTCBDIUXBRATPSWHSTYPFKGLVRVCLZFDREMYYMYKVJXGRQCAYAGHPRIFHVAYAPDBOMUSHAFUZPHVFZDEFVLGEUWMNUTKTZXHWEFKTBABZILSTXWEHYOISOWEIRAEXRLEHDTHOLCNEMTULJMSAYAWDRIUOSXGXEK";
	
	public static char retrieveChar(int num) {
		/**
		 * @REQUIRES: that int num represent some form of int between 0-25 representing a
		 * char in a string. 
		 * @ENSURES: the numerical value entered shall be return a char
		 * relating to the index of the int num in the alphabet. (if num = 0, it will
		 * return 'A', if num = 25, then 'Z')
		 */
		num += 1;
		switch (num) {
		case 1:
			num = 0;
			return 'A';
		case 2:
			num = 1;
			return 'B';
		case 3:
			num = 2;
			return 'C';
		case 4:
			num = 3;
			return 'D';
		case 5:
			num = 4;
			return 'E';
		case 6:
			num = 5;
			return 'F';
		case 7:
			num = 6;
			return 'G';
		case 8:
			num = 7;
			return 'H';
		case 9:
			num = 8;
			return 'I';
		case 10:
			num = 9;
			return 'J';
		case 11:
			num = 10;
			return 'K';
		case 12:
			num = 11;
			return 'L';
		case 13:
			num = 12;
			return 'M';
		case 14:
			num = 13;
			return 'N';
		case 15:
			num = 14;
			return 'O';
		case 16:
			num = 15;
			return 'P';
		case 17:
			num = 16;
			return 'Q';
		case 18:
			num = 17;
			return 'R';
		case 19:
			num = 18;
			return 'S';
		case 20:
			num = 19;
			return 'T';
		case 21:
			num = 20;
			return 'U';
		case 22:
			num = 21;
			return 'V';
		case 23:
			num = 22;
			return 'W';
		case 24:
			num = 23;
			return 'X';
		case 25:
			num = 24;
			return 'Y';
		default:
			num = 25;
			return 'Z';
		}
	}

	public static int generateCTABasedOnCTandPT(int CT, int PT) {
		/**
		 * @ENSURES: Will return the demonstrative int value of a potential
		 * Ciphertext character in int.
		 */
		int evaluation = CT - PT;
		if (evaluation < 0) {
			evaluation += 26;
		}
		return evaluation;
	}

	public static int generatePTbasedOnCTandCTA(int CT, int CTA) {
		/**
		 * @ENSURES: Will return the demonstrative int value of a potential
		 * Plaintext character in int.
		 */
		int PT = CT - CTA;
		if (PT < 0) {
			PT += 26;
		}
		return PT;
	}

	public static int generateValueOfChar(char myChar) {
		/**
		 * @REQURIES: That myChar be an uppercase char of the Latin Alphabet.
		 * @ENSURES: Will return the relative index value of the char in the alphabet.
		 */
		int valOfChar = -1;
		if (myChar == 'A') {
			valOfChar = 0;
		} else if (myChar == 'B') {
			valOfChar = 1;
		} else if (myChar == 'C') {
			valOfChar = 2;
		} else if (myChar == 'D') {
			valOfChar = 3;
		} else if (myChar == 'E') {
			valOfChar = 4;
		} else if (myChar == 'F') {
			valOfChar = 5;
		} else if (myChar == 'G') {
			valOfChar = 6;
		} else if (myChar == 'H') {
			valOfChar = 7;
		} else if (myChar == 'I') {
			valOfChar = 8;
		} else if (myChar == 'J') {
			valOfChar = 9;
		} else if (myChar == 'K') {
			valOfChar = 10;
		} else if (myChar == 'L') {
			valOfChar = 11;
		} else if (myChar == 'M') {
			valOfChar = 12;
		} else if (myChar == 'N') {
			valOfChar = 13;
		} else if (myChar == 'O') {
			valOfChar = 14;
		} else if (myChar == 'P') {
			valOfChar = 15;
		} else if (myChar == 'Q') {
			valOfChar = 16;
		} else if (myChar == 'R') {
			valOfChar = 17;
		} else if (myChar == 'S') {
			valOfChar = 18;
		} else if (myChar == 'T') {
			valOfChar = 19;
		} else if (myChar == 'U') {
			valOfChar = 20;
		} else if (myChar == 'V') {
			valOfChar = 21;
		} else if (myChar == 'W') {
			valOfChar = 22;
		} else if (myChar == 'X') {
			valOfChar = 23;
		} else if (myChar == 'Y') {
			valOfChar = 24;
		} else if (myChar == 'Z') {
			valOfChar = 25;
		}
		// System.out.print("The valOfChar is : " + valOfChar + " ");
		// char retreivedChar = retreiveChar(valOfChar); // THIS IS THE VALUE OF THE PT
		// System.out.println(" with Char of: " + retreivedChar); //this just outprints
		// the PT chars
		return valOfChar;
	} // end for loop

	public static String generateCTAchar(String plainText, String cipherText) {
		/**
		 * @REQUIRES: String plainText and String cipherText != null
		 * @ENSURES: Will generate a potential Ciphertext Alphabet String (CTA)
		 * based on the char sequence of plainText and cipherText.
		 */
		String potentialPT = "";
		for (int i = 0; i < plainText.length() - 1; i++) {
			int valueOfPlaintext = generateValueOfChar(plainText.charAt(i)); // this is just the PT
			int valueOfCiphertext = generateValueOfChar(cipherText.charAt(i));
			int valueOfCTA = generateCTABasedOnCTandPT(valueOfCiphertext, valueOfPlaintext);
			char quickTest = retrieveChar(valueOfCTA);
			potentialPT += quickTest;
		}
		return potentialPT;
		/*
		 * At this point, we have the plaintext crib equated with it's numerical value.
		 * Now mathmatically, the values of the CipherTextChars = CTA + PT (where if
		 * CTAchar + PTchar is greater than 25, we subtract 26) and then we can retrieve
		 * the char.
		 */
	} // end method


	public static int counterOfLetter(char letter, String string) {
		/**
		 * @ENSURES: Will return the number of occurances of char letter in
		 * String stirng.
		 */
		int numOfOccurances = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == letter) {
				numOfOccurances += 1;
			}
		}
		return numOfOccurances;
	}

	public static void main(String[] args) {
		int startingCharPosition = 0; // this represents an interating Index of where we are crib dragging
		int keyLength = 14; // represents the appendage of the keys 2, 3 ,4
		String crib = "AVALANCHE"; // length is 9
		String[] allPTs = new String[905];
		String CTstring = "";
		String CTAstring = "";
		char letterE = 'E';
		int maxNumOfLetter = 0;
		int rememberIterationNum = 0;
		while ((startingCharPosition + (keyLength - 1) + (crib.length() - 1)) < stringToBreak.length()) {
			int leftBound = (startingCharPosition + keyLength - 1);
			int rightBound = (startingCharPosition + (keyLength - 1) + (crib.length() - 1));
			System.out.print("L = " + leftBound + " " + "R = " + rightBound + " ");
			CTstring = stringToBreak.substring(leftBound, rightBound);
			CTAstring = generateCTAchar(crib, CTstring);
			System.out.println("I = " + startingCharPosition + " " + CTAstring); 	
			int numOfEinIteration = counterOfLetter(letterE, CTAstring);
			if (numOfEinIteration == maxNumOfLetter) {
				rememberIterationNum = startingCharPosition;
				System.out.println("Potential at: Iteration " + rememberIterationNum + " where the crib begins at spot " + leftBound);
			}
			if (numOfEinIteration > maxNumOfLetter) {
				maxNumOfLetter = numOfEinIteration;
				rememberIterationNum = startingCharPosition;
			}
			startingCharPosition += 1;
			allPTs[startingCharPosition] = CTAstring;

		} // end while
		System.out.println("Most E in: " + rememberIterationNum + " with " + maxNumOfLetter);
		System.out.println("Therefore it's most likely that the crib begins at index: " + rememberIterationNum);
		System.out.println("However, the generated output will advise potential crib positions as well.");

	}// end main

}// end class
