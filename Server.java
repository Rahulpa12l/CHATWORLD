import java.io.*;
import java.util.*;
import java.net.*;
class Server{
public static void main(String[] args) throws Exception{
ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();
InputStream in= s.getInputStream();
Scanner sc=new Scanner(in);
OutputStream out=s.getOutputStream();
PrintStream ps=new PrintStream(out);
Scanner sc1=new Scanner(System.in);
String cmsg;
do{
cmsg=sc.nextLine();
System.out.println("Client: "+cmsg);
ps.println(sc1.nextLine());
}while(!cmsg.equals("by"));
s.close();
}
}