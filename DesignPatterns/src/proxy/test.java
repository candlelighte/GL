package proxy;

import proxy.CommandExecutor;
import proxy.CommandExecutorProxy;

public class test {
	
 public static void main(String[] args){
 CommandExecutor executor = new CommandExecutorProxy("Chama","wrong_pwd");
 try {
 executor.runCommand("ls -ltr");
 executor.runCommand(" rm -rf abc.pdf");
 } catch (Exception e) {
 System.out.println("Exception Message::"+e.getMessage());
 }

 }
}
