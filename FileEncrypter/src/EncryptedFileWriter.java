
public class EncryptedFileWriter extends DecoratedFileWriter {
	private int key;
	   
	public EncryptedFileWriter (FileWriterInterface fw, int key) {
		super(fw);
		this.key = key;
	}

	public void write (int x) {
		int encryptedX = encrypt(x);
		super.write(encryptedX);
	}
	   
	private int encrypt(int x) {
		int encryptedX = x * key; 
	       
		return encryptedX;
	}
}