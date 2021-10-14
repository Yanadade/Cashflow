import java.util.Scanner;
class CashBalance{
    public static void main(String[] args) {

        try{
            int balance = 4000;
            Scanner kb=new Scanner(System.in);
            System.out.print("ป้อนจำนวนเงินที่ต้องการถอน = ");
            int withdraw = kb.nextInt();
             if(withdraw<=0){
                throw new Exception("กรุณาป้อนจำเงินมากกว่า 0");
             }
             if(withdraw>balance){
                throw new Exception("ยอดเงินคงเหลือไม่พอ");              
             }

            balance-=withdraw;
            System.out.println("ถอนเงิน = " +withdraw);
            System.out.println("ยอดคงเหลือ = " +balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}