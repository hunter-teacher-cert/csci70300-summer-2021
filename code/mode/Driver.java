import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	long start,elapsed;
	int mode;
	Mode m = new Mode(150000);
	// System.out.println(m);
	// m.fastMode();
	// start = System.currentTimeMillis();
	// mode = m.calcMode();
	// System.out.println(mode);
	// elapsed = System.currentTimeMillis()-start;
	// System.out.println(elapsed);
	// System.out.println();
	start = System.currentTimeMillis();
	mode = m.fastMode();
	System.out.println(mode);
	elapsed = System.currentTimeMillis()-start;
	System.out.println(elapsed);
    }
    
}
