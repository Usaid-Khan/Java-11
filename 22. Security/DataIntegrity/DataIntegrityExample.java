package DataIntegrity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class DataIntegrity {
	public void convertHash(String data) throws NoSuchAlgorithmException
	{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hashData = md.digest(data.getBytes());
		StringBuilder hexData = new StringBuilder();
		for(byte b : hashData)
		{
			hexData.append(String.format("%02x", b));
		}
		System.out.println(hexData);
	}
}

public class DataIntegrityExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String data = "danish";
		DataIntegrity dataIntegObj = new DataIntegrity();
		
		try
		{
			dataIntegObj.convertHash(data);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
