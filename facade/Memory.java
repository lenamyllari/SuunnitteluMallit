package facade;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Memory {
	
	public void load(long position, byte[] data) { 
		System.out.println("Boot address: " + position);
		System.out.println("Found data:");
		System.out.println(bytesToString(data));
	}
	
	public String bytesToString(byte[] data) {
		CharBuffer cBuffer = ByteBuffer.wrap(data).asCharBuffer();
		return cBuffer.toString();
	}
}
