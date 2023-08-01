package Test129.Test02;

public class Exer4 {
    public static void main(String[] args) {
        try {
            int m1 = Integer.parseInt(args[0]);
            int m2 = Integer.parseInt(args[1]);
            int i = divide(m1, m2);
            System.out.println(i);
        } catch (BElowzeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    public static int divide(int m, int n) throws BElowzeroException{
        if(m<0 || n<0){
            throw new BElowzeroException("不能为负数");
        }
        return m / n;
    }
}
