package crypto1;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.Base64;
import java.io.*;

public class encode extends Crypto {
	
	public String encodeHexi(String hexx) {
		
		Hex hex = new Hex();

		byte[] bytes = hexx.getBytes();
		
		char[] encoder = hex.encodeHex(bytes);
		
		return String.valueOf(encoder);
	}
	
	public String encodeBase64(String base) {
		
		Base64 base64 = new Base64();
		
		byte[] bytes = base.getBytes();
		
		byte[] encoder = base64.encodeBase64(bytes);
		
		return String.valueOf(encoder);
		
	}
	
	public String decodeHexi(String hexx) {
		
		Hex hex = new Hex();

		byte[] decoder = hex.decodeHex(hexx);
		
		return String.valueOf(decoder);
	}
	
	public String decodeBase64(String base) {
		
		Base64 base64 = new Base64();
		
		byte[] decoder = base64.decodeBase64(base);
		
		return String.valueOf(decoder);
		
	}
	
}