import mx.gabrielitium.Encrypt.AESencrp;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo de encriptado para cadenas: ");
		try{
	      String password = "mypassword";
	        String passwordEnc = AESencrp.encrypt(password);
	        String passwordDec = AESencrp.decrypt(passwordEnc);

	        System.out.println("Plain Text : " + password);
	        System.out.println("Encrypted Text : " + passwordEnc);
	        System.out.println("Decrypted Text : " + passwordDec);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
