package facade;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class HardDrive {

	private String dataOnDrive = "Mä en jaksa enää tätä karanteenia. Haluaan jo kahville ja teatteriin.";
	
	public byte[] read(long lba, int size) {
		return stringToByte(dataOnDrive, (int)(lba), size); 
	}
	
	private static byte[] stringToByte (String data, int start, int amount) {
		char[] buffer = data.toCharArray();
		byte[] b = new byte[buffer.length <<1];
		CharBuffer cBuffer = ByteBuffer.wrap(b).asCharBuffer();
		for (int i = start; i<start+amount; i++) {
			cBuffer.put(buffer[i]);
		}
		return b;
	}
}
