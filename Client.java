import java.io.*;
import java.util.*;
import java.net.*;
class Client {
public static void main(String[] args) throws Exception{
Socket s=new Socket("192.168.121.121",8080);
OutputStream out=s.getOutputStream();
PrintStream ps=new PrintStream(out);
Scanner sc1=new Scanner(System.in);
InputStream in= s.getInputStream();
Scanner sc=new Scanner(in);
String cmsg;
do{
ps.println(sc1.nextLine());
cmsg=sc.nextLine();
System.out.println("Server: "+cmsg);
}while(!cmsg.equals("by"));
}
}