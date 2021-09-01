package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {

	static HashMap<Integer, String> map=new HashMap<Integer, String>();
    public static void Menu()
    {
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sua");
        System.out.println("4.Xoa");
        System.out.println("5.Tim");
        System.out.println("6.Thoat");
        System.out.println("Moi lua chon:");
        int chon=new Scanner(System.in).nextInt();
        switch(chon)
        {
            case 1:
                Them();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                Sua();
                break;
            case 4: 
                Xoa();
                break;
            case 5:
                Tim();
                break;
            case 6:
                System.err.print("Cam on!");
                System.exit(0);
                break;
        }
    }
    public static void Them()
    {
        System.out.println("Nhap ma sach");
        int ma=new Scanner(System.in).nextInt();
        System.out.println("Nhap ten sach:");
        String Ten=new Scanner(System.in).nextLine();
        if(map.containsKey(ma)==false)
        {
        	map.put(ma, Ten);
        }
    }
    public static void Xuat()
    {
    	System.out.println("Ma\tTen Sach");
    	for(Map.Entry<Integer, String> item:map.entrySet())
    	{
    		System.out.println(item.getKey()+"\t"+item.getValue());
    	}
    }
    public static void Sua()
    {
    	System.out.println("Moi ban nhap ma muon sua:");
    	int ma=new Scanner(System.in).nextInt();
    	if(map.containsKey(ma)==false)
    	{
    		System.out.println("Ma "+ma+" khong ton tai");
    	}
    	else
    	{
    		System.out.println("Nhap ten sach moi:");
    		String ten =new Scanner(System.in).nextLine();
    		map.put(ma,ten);
    	}
    }
    public static void Xoa()
    {
    	System.out.println("Moi nhap ma muon xoa:");
    	int ma=new Scanner(System.in).nextInt();
    	if(map.containsKey(ma)==false)
    	{
    		System.out.println("Khong tim thay ma");
    	}
    	else
    	{
    		map.remove(ma);
    	}
    }
    public static void Tim()
	{
		System.out.println("Nhap ten sach can tim:");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> item:map.entrySet())
		{
			if(item.getValue().contains(ten))
			{
				System.out.println(item.getKey()+"-"+item.getValue());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Menu();
		}
	}

}
