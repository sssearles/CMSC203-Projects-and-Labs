

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		// Check whether each character in the plainText string is in the range or not.
		// When the loop comes across any character out of range, it returns false.
		
		// throw new RuntimeException("method not implemented");
		
		// Declare variables for this method.
		
		int 	index;
		boolean	result = true;
		
		// Create a for loop that checks the characters of the string to see whether they are in bounds.
		
		for (index = 0; index < plainText.length(); index++) {
			if (plainText.charAt(index) < LOWER_BOUND || plainText.charAt(index) > UPPER_BOUND) {
				result = false;
			}
						
		}
		return result;
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		// throw new RuntimeException("method not implemented");
		
		String	crypt = "";
		int 	index;
		char	addedCharacter;
		
		// Check that the key is in bounds
		while (key > RANGE) {
			key = key - RANGE;
		}
		
		// Create a for loop that encrypts the plainText character by character.

		for (index = 0; index < plainText.length(); index++) {
			// Check and adjust bounds for any character that goes out of bounds.
			addedCharacter = plainText.charAt(index);
			int encryptChar = ((int)addedCharacter+key);
			if (encryptChar > UPPER_BOUND) {
				encryptChar = encryptChar - RANGE;
			}
				crypt = crypt + (char)(encryptChar);
		}
		return crypt;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		// throw new RuntimeException("method not implemented");
		
		String	key = "";
		String	crypt = "";
		
		// Make the key as long as the plainText message.
		 int	i = 0;
		 while (key.length() != plainText.length()) {
			 key = key + bellasoStr.charAt(i);
			 i++;
			 if (i == bellasoStr.length())
				 i = 0;
		 }
		 
		 // Encrypt each character in plainText according to the Bellaso key
		 
		 for (int j = 0; j < plainText.length(); j++) {
			 
			 // Adjust each character in the plainText string by the corresponding
			 // value in the Bellaso Key string. 
			 
			 int	adjCharacter = (int)plainText.charAt(j) + (int)key.charAt(j);

			 // Check the character to make sure it hasn't bumped up above the
			 // range. If it has, wrap it back around into the range.
			 
			 while (adjCharacter > UPPER_BOUND) {
				 adjCharacter -= RANGE;
			 }
			 // Add the adjusted character to the encrypted message. 
			 crypt = crypt + (char)adjCharacter;		 
		 
		 }
		 return crypt;
	}
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	
	public static String decryptCaesar(String encryptedText, int key) {
		// throw new RuntimeException("method not implemented");
			
			String	message = "";
			int 	index;
			// Check that the key is in bounds
			while (key > RANGE) {
				key -= RANGE;
			}
			
			// Create a for loop that decrypts the encryptedText according to the shift.
			for (index = 0; index < encryptedText.length(); index++) {
				int adjCharacter = ((int)encryptedText.charAt(index)- key);
				
				// Check and adjust bounds for any character that goes out of bounds.
				
				if (adjCharacter < LOWER_BOUND){
					adjCharacter += RANGE;
				}
				message = message + (char)adjCharacter;
			}
		return message;
	}
		
	/**
	 * Decrypts a string according to the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		// throw new RuntimeException("method not implemented");
		String	key = "";
		String	message = "";
		
		// Make the key as long as the plainText message.
		 int	i = 0;
		 while (key.length() != encryptedText.length()) {
			 key = key + bellasoStr.charAt(i);
			 i++;
			 if (i == bellasoStr.length())
				 i = 0;
		 }
		 
		 // Encrypt each character in plainText according to the Bellaso key
		 
		 for (int j = 0; j < encryptedText.length(); j++) {
			 
			 // Decrypt each character in the encryptedText string by the corresponding
			 // value in the Bellaso Key string. 
			 
			 int	adjCharacter = (int)encryptedText.charAt(j) - (int)key.charAt(j);

			 // Check the character to make sure it hasn't dropped below the
			 // range. If it has, wrap it back around into the range.
			 
			 while (adjCharacter < LOWER_BOUND) {
				 adjCharacter += RANGE;
			 }
			 // Add the adjusted character in the decrypted message. 
			 message = message + (char)adjCharacter;		 
		 
		 }
		 return message;
	}
}

