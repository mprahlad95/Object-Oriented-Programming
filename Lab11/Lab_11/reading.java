import java.io.*;
class reading {
public static void main(String args[])
throws IOException
{
int i;
FileInputStream fin;
try {
fin = new FileInputStream("file1.txt");
} catch(FileNotFoundException e) {
System.out.println("File Not Found");
return;
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Usage: ShowFile File");
return;
}
// read characters until EOF is encountered
do {
i = fin.read();
if(i != -1) System.out.print((char) i);
} while(i != -1);
fin.close();
}
}
