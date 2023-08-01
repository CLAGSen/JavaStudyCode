package File类与IO流.O177Test;

import org.junit.Test;

import java.io.*;

public class IoTest {
    @Test
    public void test1() {

        FileReader fileReader = null;

        try {
            //读取hello.txt文件的内容
            //1.创建File的对象队友这hello.txt文件
            File file = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\Io\\hello.txt");

            //2.创建输入字符流
            fileReader = new FileReader(file);
            //3.读取数据,read()每次只读一个字符
        /*    int data = fileReader.read();
            while (data!=-1){
                System.out.print((char) data);
                data = fileReader.read();
            }   */

            char cBuffer[] = new char[5]; //读到的字符放到数组中
            int length = fileReader.read(cBuffer);
            while (length != -1){
                for (int i = 0; i < length; i++) {
                    System.out.print(cBuffer[i]);
                }
                length = fileReader.read(cBuffer);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader!=null) //防止没创建成功报空指针
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        //4.流资源关闭
    }

    @Test
    public void test2(){
        //将内存中的数据写到文件中

        FileWriter fw = null;

        try {
            //读取hello.txt文件的内容
            //1.创建File的对象队友这hello.txt文件,若文件不在则创建文件
            File file = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\Io\\hello.txt");

            //2.创建输出字符流
            //文件覆盖
//            fw = new FileWriter(file);
            //追加内容
            fw = new FileWriter(file,true);

            fw.write("hi \n");
            fw.write("are you ok \n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw!=null) //防止没创建成功报空指针
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        //4.流资源关闭
    }
    /**
     * 复制一份hello.txt文件，命名为hello_copy.txt
     */
    @Test
    public void test4(){
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //读取hello.txt文件的内容
            //1.创建File的对象队友这hello.txt文件

            File file = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\Io\\hello.txt");
            File file2 = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\Io\\hello_copy.txt");

            //2.创建输入字符流
            fr = new FileReader(file);
            //3.读取数据,read()每次只读一个字符
             //4.创建输出流
            fw = new FileWriter(file2,false);


            char cBuffer[] = new char[10]; //读到的字符放到数组中
            int length = fr.read(cBuffer);
            while (length != -1){
                fw.write(cBuffer,0,length); //从0开始写，写length个
                /*for (int i = 0; i < length; i++) {
                    fw.write(cBuffer[i]);
                }*/
                length = fr.read(cBuffer);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr!=null) //防止没创建成功报空指针
                    fr.close();
                if (fw!=null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
