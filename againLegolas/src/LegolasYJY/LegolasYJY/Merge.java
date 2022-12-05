package LegolasYJY.LegolasYJY;

import java.util.Scanner;

// 회사이름 난수로 무작위 프린트 
// 회사이름 내선택 외의 값 프린트 


public class Merge
{
	Scanner sc = new Scanner(System.in);
	Company[] comp = new Company[16];
	
	public  void  MergeFunction() 
	{     
		comp[0] = new Company("마이크로소프트", 3000, "인수 가능");
		comp[1] = new Company("어도비", 2000, "인수 가능");
		comp[2] = new Company("세이즈포스", 300, "인수 가능");
		comp[3] = new Company("엔비디아 ", 750, "인수 가능");
		comp[4] = new Company("삼성  ", 405, "인수 가능");
		comp[5] = new Company("네이버", 30, "인수 가능");
		comp[6] = new Company("쿠팡", 25, "인수 가능");
		comp[7] = new Company("카카오 ", 25, "인수 가능");
		comp[8] = new Company("라인", 9, "인수 가능");
		comp[9] = new Company("배달의 민족", 4, "인수 가능");
		comp[10] = new Company("민우요", 1, "인수 가능");
		comp[11] = new Company("깃허브", 8, "마이크로소프트에 인수되었습니다." );
		comp[12] = new Company("피그마", 27, "어도비인수되었습니다"); 
		comp[13] = new Company("슬랙", 30, "세일즈포스 인수되었습니다"); 
		comp[14] = new Company("ARM", 50, "엔비디아에 인수되었습니다."); 
		comp[15] = new Company("블리자드", 81, "마이크로소프트에 인수되었습니다");
	}
	
	public String intro()
	{
		System.out.println("[인수합병게임]");
		
		System.out.print("당신의 이름 : ");
		String myName = sc.nextLine(); 
		String myCompany = sc.nextLine(); 
		
		for(int i =0; i<11; i++) 
		{	
			if(i % 4 == 0) 
			{
				System.out.println();
			}
			System.out.printf("%11s", comp[i].getName());
		}
		System.out.println();
		System.out.println();
		
		System.out.println("당신이 다니는 회사 : ");
		System.out.println("1.사원   2.팀장   3.사장");
		System.out.println("당신의 직급 : ");
		int myRank = sc.nextInt();
		System.out.println();
		if( myRank == 1) 
			{ System.out.printf("' 안녕하세요 신입사원 '%s'님 당신은 '%s'사의 독자입니다. "
				+ "\n 위장취업은 어제로 끝났고. 오늘부로 사장으로 발령받았습니다. "
				+ "\n 축하합니다 사장님 '",  myName, myCompany);}
		else if(myRank == 2) 
			{System.out.printf("안녕하세요 %s팀장님 당신의 상급자 모두가 해외로 도피했습니다."
				+ "\n 당신은 당분간 임시사장직을 맡게 되었습니다. "
				+ "\n 축하합니다 사장님" , myName );}
		else if(myRank == 3) {System.out.printf("안녕하세요 %s사장님" ,myName);}
		return myCompany;
	}
	
	public int compBuy()
	{	
		int i =0;
		
		System.out.println();
		System.out.println("자, 사장님! 어떤 회사를 인수합병할 계획이세요?");
		System.out.println("신중하게 골라주세요");
		for(; i<comp.length; i++) 
		{	
			
			if(i % 5 == 0)
			System.out.println();
			System.out.printf("%d. %s  ",i+1,comp[i].getName());
		}
		i = sc.nextInt();
		return i;
	}
	
	public void soldout(int tek) 
	{
		System.out.print(comp[tek].getBigo()); 
		System.out.printf("\n인수금액 : %d", comp[tek].getCash()); 
	}

	public void ending() 
	{
		System.out.println("사실 이 게임은 당신을 짐작할 수 있게 합니다.");
		System.out.println("당신의 추리력");
		System.out.println("당신이 전직하고자 하는 업계에 대한 관심도");
	}
}	

