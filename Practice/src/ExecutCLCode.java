import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecutCLCode {

	
	public void executeCMD(String command)throws IOException, InterruptedException
	{
		String os= System.getProperty("os.name");
		String cmd="";
		if(os.contains("Windows"))
		{
			cmd=cmd+"cmd /c" +command;
		}
		else
		{
			cmd=cmd+"bash -c"+command;
		}
		Process p=Runtime.getRuntime().exec(cmd); 
        p.waitFor(); 
        BufferedReader reader=new BufferedReader(
            new InputStreamReader(p.getInputStream())
        ); 
        String line; 
        while((line = reader.readLine()) != null) 
        { 
            System.out.println(line);
        }
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		Process process  = Runtime.getRuntime().exec("cmd /c start cmd.exe /K java -jar selenium-server-standalone-2.44.0.jar -role hub");
		//System.out.println(Runtime.getRuntime().exec("cmd /c start cmd.exe /K dir"));
		// Run Bash
		//Process p = Runtime.getRuntime().exec(new String[]{"bash","-c","ls /home/XXX"});
		ExecutCLCode exc= new ExecutCLCode();
		String command="java -jar D:/Vikas/printsum.jar 1 2 3 4 5 6";//"ls";
		exc.executeCMD(command);
		
	}

}
