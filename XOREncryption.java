import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 

class XOREncryption 
{ 
  
    static String encryptDecrypt(String inputString) 
    { 
      
        char xorKey = 'P'; 
  
        String outputString = ""; 
  
        int len = inputString.length(); 
  
        
        for (int i = 0; i < len; i++)  
        { 
            outputString = outputString +  
            Character.toString((char) (inputString.charAt(i) ^ xorKey)); 
        } 
  
        System.out.println(outputString); 
        return outputString; 
    } 
    
    public static String decodeHexi(String hexx) {
		
		Hex hex = new Hex();
		byte[] decoder;
		try {
		
		decoder = hex.decodeHex(hexx);
		}
		
		catch(DecoderException e) {
		throw new RuntimeException("unable to decode");
		}
		return String.valueOf(decoder);
	}
	
	// public static byte[] xorWithKey(byte[] a, byte[] key) {
    //    byte[] out = new byte[a.length];
   //     for (int i = 0; i < a.length; i++) {
   //         out[i] = (byte) (a[i] ^ key[i%key.length]);
   //     }
  //      return out;
  //  } 
	
	private byte xorWithKey(byte a, byte[] key) {
	byte out=a;
	for (int i = 0; i < key.length; i++) {
    out = (byte) (out ^ key[i]);
	}
	return out;
	}
	
    public static void main(String[] args) 
    { 
        String sampleString = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
        
        String key = decodeHexi(sampleString); 
        

		String s;

	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < s.length(); i++)
    	sb.append((char)(s.charAt(i) ^ key.charAt(i % key.length())));
	String result = sb.toString();
        
     //   String key = "686974207468652062756c6c277320657965";
    //    byte[] converted = xorWithKey(newString.getBytes(), key.getBytes());     
    //    System.out.println(String.valueOf(converted));
 
    } 
} 