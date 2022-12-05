
package LegolasYJY.LegolasYJY;

import java.util.Scanner;

public class Run
{

	public static void main(String[] args)
	{
		Merge mg = new Merge();
		

		mg.MergeFunction();
		
		mg.intro();
		
		mg.compBuy();
		
		int tek = mg.compBuy();
		String mycomp = mg.intro();
		if (tek>10) {mg.soldout(tek);};
		if(tek<=11)
		{
			for(int i = 0; i<=11; i++) 
			{
				if(mycomp == mg.comp[i].getName()) 
				{
					System.out.println(mg.comp[i]);
				}
			}
		};
		
//		while(true) 
//		{
//			mg.compBuy();
//			 buy = mg.compBuy();
//
//			switch(buy) 
//			{ 
//			case "깃허브" : case "피그마" : case "슬랙":  case "ARM" : case "블리자드":
//				System.out.println("실 패");
//				System.out.println("살 수 없습니다.");
//				System.out.println("이미 다른 회사에게 인수되었습니다.");
//				mg.soldout(buy); 
//				break;
////			case  : case  :case  :case  :case  :case  :
//				//				System.out.println("실 패");
//				//				System.out.println("자금이 부족합니다");
//				////				  OOO 사는_ _ _ 원  (당신의 돈)
//				////				  좀더 싼 회사를 찾아보세요 }
//				//				break;
//			default :
//				System.out.println("성 공");
////				System.out.printf("당신은 오늘부터 %s%s의 사장입니다.", buy, myCompany);
//				break;
//			}
//		}
		mg.ending();
	}
}


