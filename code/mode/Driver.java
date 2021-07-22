import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	long start,elapsed;
	int mode;
	Mode m = new Mode(100000);
	start = System.currentTimeMillis();
	mode = m.calcMode();
	//System.out.println(m);
	System.out.println(mode);
	elapsed = System.currentTimeMillis()-start;
	System.out.println(elapsed);
    }
    
}
