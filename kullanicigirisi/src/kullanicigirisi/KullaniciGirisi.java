package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Kullanıcı Adınız: ");
		String userName=input.nextLine();
		
		System.out.println("Şifreniz: ");
		String password=input.nextLine();
	    
		String correctPassword = "java111";
		if(userName.equals("admin")&& password.equals(correctPassword))
		{
			System.out.println("Başarıyla Giriş Yaptınız");
			
		}
		else
		{
			System.out.println("Şifreniz yanlış.Yeni şifre belirlemek için 1'i tuşlayın. ");
			int choice=input.nextInt();
			input.nextLine();
			
			if(choice==1)
			{
				System.out.println("Yeni şifreyi belirleyiniz");
				System.out.println("Yeni şifre eskisi ile aynı olamaz");
				String password2=input.nextLine();
				input.nextLine();
				
				if(correctPassword.equals(password))
				{
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz."); 
				}
				else
				{
					System.out.println("Yeni şifre başarıyla oluşturuldu");
					password=password2;
				}
			}
		}

        input.close();
	}

}
