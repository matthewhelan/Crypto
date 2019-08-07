package crypto1;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import java.util.Scanner;
 
public class Crypto {
	
	
	public static void main(String[] args) {
		
		encode a = new encode();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String that you want to be encoded");
		String message = sc.nextLine();
		
		String encodedHexi = a.encodeHexi(message);
		System.out.println("Hex:" + encodedHexi);
		String encodedBase64 = a.encodeBase64(message);
		System.out.println("Base64:" + encodedBase64);
		
		
		
		System.out.println("Decode in Base64 or Hex?");

		
		String output = sc.nextLine();
		
		System.out.println("Enter the String that you want to be decoded in Hex");
				String decoding = sc.nextLine();
				String decodedHex = a.decodeHexi(decoding);
				System.out.println(decodedHex);
	
			
		
				System.out.println("Enter the String that you want to be decoded in Base64");
				String decodings = sc.nextLine();
				String decodedBase = a.decodeBase64(decodings);
				System.out.println(decodedBase);
			
		
		}
}
