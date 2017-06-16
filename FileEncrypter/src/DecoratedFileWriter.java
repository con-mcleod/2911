
public class DecoratedFileWriter implements FileWriterInterface {

	private FileWriterInterface basicFileWriter;
	   
	public DecoratedFileWriter (FileWriterInterface fw) {
		this.basicFileWriter = fw;
	}
   
	public void write (int x) {
		basicFileWriter.write(x);
	}
}
