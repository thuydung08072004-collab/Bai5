package Class;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Nguoi {
    private  String hoTen;
    private  Date ngaySinh;
    private String ngheNghiep;
    public Nguoi(){
        
    }
    public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep){
        this.hoTen= hoTen;
        this.ngaySinh=ngaySinh;
        this.ngheNghiep= ngheNghiep;
    }
    public void nhapThongTin (Scanner sc){
        System.out.print("\\tNhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("\\tNhap Ngay sinh: ");
        String strDate=sc.nextLine();
        ngaySinh=strToDate(strDate);
        System.out.print("\\tNhap Nghe Nghiep: ");
        ngheNghiep=sc.nextLine();
    }
    private Date strToDate(String strDate){
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
                }
        catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date;
}
    public void hienThiThongTin(){
        System.out.print("\tHo ten"+hoTen);
        System.out.print("\tNgay Sinh" + (ngaySinh != null ? dataToString(ngaySinh) : "Khong hop le"));
        System.out.print("\tNghe Nghiep"+ngheNghiep);   
    }
    private String dataToString(Date date){
        if (date == null) {
        return "Khong hop le";
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    return sdf.format(date);
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
}


