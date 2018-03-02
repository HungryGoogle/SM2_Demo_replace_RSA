package deepin.com.sm2_demo_replace_rsa.sm;

public class SM4_Context
{
	public int mode;
	
	public long[] sk;
	
	public boolean isPadding;

	public SM4_Context() 
	{
		this.mode = 1;
		this.isPadding = true;
		this.sk = new long[32];
	}
}
