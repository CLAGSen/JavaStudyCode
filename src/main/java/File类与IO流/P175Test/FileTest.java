package File类与IO流.P175Test;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test1(){
      //public File(String pathname) :
    // 以pathname为路径创建File对象，可以是绝对路径或者相对路径
        File file1 = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\hello.txt");

        //相对路径：单元测试，相对于当前的module来讲   main方法，相对于当前project来讲
    }
    @Test
    public void test2(){
        //public File(String parent,String child) 在parent路径下，创建子文件或子目录
        File file1 = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流","hello2.txt");

        //public File(File parent,String child) file是一个文件目录，创建子文件或子目录
    }
    /**
     *
     * 获取文件和目录基本信息
     * public String getName():获取名称
     * public String getPath():获取路径
     * public String getAbsolutePath():获取绝对路径
     * public File getAbsoluteFile():获取绝对路径表示的文件
     * public String getParent():获取上层文件目录路径。若无。返回null
     * public long length() :获取文件长度(即:字节数）。不能获取目录的长度。
     * public long lastModified() :获取最后一次的修改时间，毫秒值
     *
     **/

    /**
      列出目录的下一级
      public String[] list() :返回一个String数组，表示该File目录中的所有子文件或目录。
      public File[] listFiles()﹔返回一个File数组，表示该File目录中的所有的子文件或目录。
 **/

    /**
     * File重新命名
     * public boolean renameTo(File dest):文件重命名为指定的文件路径
     * file1.renameTo(file2)：file1必须存在且file2不存在且file2所在的文件目录必须存在
     */


    /**
    判断功能的方法
     public boolean exists():此File表示的文件或目录是否实际存在。
     public boolean isDirectory():此File表示的是否为目录。
     public boolean isFile() :此File表示的是否为文件-
     public boolean canRead() :判断是否可读
     public boolean canWrite():判断是否可写
     public boolean isHidden() :判断是否隐藏
 */

    /**
     * 创建、删除功能
     * public boolean createNewFile():创建文件。若文件存在，则不创建，返回false。
     * public boolean mkdir():
     *      创建文件目录。如果此文件目录存在，就不创建了。
     *      如果此文件目录的上层目录不存在，也不创建。
     * public boolean mkdirs():创建文件目录。如果上层文件目录不存在，一并创建。
     * public boolean delete():删除文件或者文件夹
     * 删除注意事项:① Java中的删除不走回收站。
     *            ②要删除一个文件目录，请注意该文件目录内不能包含文件或老文件日录
     *
     *
     */
    //判断指定目录下是否有.jpg文件，如也就输出文件名称
    @Test
    public void test3(){
        File dir = new File("D:\\2345Downloads\\IDEA\\idea workspace\\JavaStudyCode\\src\\main\\java\\File类与IO流\\Io");
        String[] fileList = dir.list();
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].contains(".jpg")){
                System.out.println(fileList[i]);
            }
        }
    }


}
