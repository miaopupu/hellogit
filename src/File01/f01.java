package File01;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class f01 {
	public static void main(String[] args) {
		 try {
	            // ׼���ļ�lol2.txt���е������ǿյ�
	            File f = new File("d:/lol2.txt");
	            // ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
	            byte data[] = { 88, 89 };
	 
	            // ���������ļ��������
	            FileOutputStream fos = new FileOutputStream(f);
	            // ������д�뵽�����
	            fos.write(data);
	            // �ر������
	            fos.close();
	             
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		}
	}

