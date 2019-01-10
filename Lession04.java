import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Viết class tên là MyNumber với các đạc điểm sau
 * - Thuộc tính
 * + int number - chứa số nhập vào từ constructor
 * - Phương thức
 * + MyNumber(int n) - Khởi tạo cho thuộc tính number;
 * + ArrayList Get_Sochan() - Trả ra danh sách tất cả các số chẵn nhỏ hơn number
   + ArrayList get_SoLe() - Trả ra danh sách tất cả các số lẻ nhỏ hơn nyumber
   + ArrayList get_SoTongHop() - Trả ra một danh sách gồm tổng các số chẵn lẻ ở 
   vị trí tương ứng, trong trường hợp khuyết 1 trong 2 số thì giữ nguyên số còn lại
 - Viết Test cho 03 methods này
 */
public class Lession04 {
	
	   class MyNumber{
		
		// thuộc tính
		
		public int[] arrNumber;
		public int min[];
		public int max[];
		//Method khởi tạo
	
	   public MyNumber (int [] number) {
		this. arrNumber = arrNumber;
	
		}
	// Method get so chan
	  
	   public ArrayList Get_Sochan() {
		
		ArrayList lstSochan = new ArrayList();
		
		for(int i=0; i< arrNumber.length; i++){
			if(i%2==0)
			{
				lstSochan.add(i);
			}
		}
		   
		return lstSochan;
	}

	
	public ArrayList Get_Sole() {
		
		ArrayList sole = new ArrayList();
		
		//boolean sochan1 = false;
		
		for (int i = 0; i < arrNumber.length; i++) {
			
			int currsole = arrNumber [i];
			
			boolean issole = false;
			
			for (int k = 2; k < currsole; k++) {
				if (currsole % k == 0) {
					issole = false;
					break;
				}			
			}
			if (issole== true) {
				sole.add(currsole);
			}
		}
		return sole;
	}

	public ArrayList GetSum()
	{
		//Mang luu tong 
		ArrayList lstSumNumber = new ArrayList();
		//Get sochan va sole
		ArrayList lstSoChan = this.Get_Sochan();
		ArrayList lstSoLe = this.Get_Sole();
		
		if(lstSoChan.size() > lstSoLe.size())
		{
			for(int i=0; i<lstSoChan.size(); i++)
			{
				if(i<lstSoLe.size())
				{
					int sochan = (int)lstSoChan.get(i);
					int sole = (int)lstSoLe.get(i);
					lstSumNumber.add(sochan+sole);
				}
				else
				{
					lstSumNumber.add(lstSoChan.get(i));
				}
			}
		}
		else
		{
			for(int i=0; i<lstSoLe.size(); i++)
			{
				if(i<lstSoChan.size())
				{
					int sochan = (int)lstSoChan.get(i);
					int sole = (int)lstSoLe.get(i);
					lstSumNumber.add(sochan+sole);
				}
				else
				{
					lstSumNumber.add(lstSoLe.get(i));
				}
			}
		}
		
		//Cach 2
		//Kiem tra xem mang nao la mang ngan hon thi them cac phan tu 0 vao sau sao cho do dai 2 mang bang nhau
		//Sau do chay tu dau den cuoi mang bat ky roi cong don lai vs nhau
		
		if(lstSoChan.size() <lstSole.size())
		{
			for(int i = lstSoChan.size(); i< lstSole.size(); i++)
				lstSoChan.add(0);
		}
		else
		{
			for(int i = lstSole.size(); i< lstSoChan.size(); i++)
				lstSole.add(0);
		}
		
		for(int i=0; i< lstSole.size(); i++)
		{
			int sochan = (int)lstSoChan.get(i);
			int sole = (int)lstSoLe.get(i);
			lstSumNumber.add(sochan+sole);
		}
		   
	}
}
	
