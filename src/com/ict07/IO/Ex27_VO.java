package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ex27_VO implements Externalizable
{
		// 이름, 국어, 영어, 수학 받아서
		// 이름, 총점, 평균, 학점으로 나타내기
		// 배열의 크기를 지정하지 않음
		// 나타낸 정보를 직렬화 09.ser로 저장
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		private double avg;
		private String hak;
		
		public Ex27_VO() 
		{
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		public Ex27_VO(String name, int kor, int eng, int math) 
		{
			super();
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			/*sum = kor+eng+math;
			avg = (int)(sum/3*10)*10.0;
			if (avg>=90) 
			{
				hak = "A";
			} else if(avg>=80)
			{
				hak = "B";
			}else if(avg>=70)
			{
				hak = "C";
			}else
			{
				hak = "F";
			}*/
			
			
		}

		@Override
		public void writeExternal(ObjectOutput out) throws IOException 
		{
			out.writeObject(name);
			out.writeObject(kor);
			out.writeObject(eng);
			out.writeObject(math);
			
			
		}


		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException 
		{
			name = (String)in.readObject();
			kor = (int)in.readObject();
			eng = (int)in.readObject();
			math = (int)in.readObject();
			
		}

		




		public String getName() 
		{
			return name;
		}




		public void setName(String name) 
		{
			this.name = name;
		}




		public int getKor()
		{
			
			return kor;
		}




		public void setKor(int kor) 
		{
			this.kor = kor;
		}




		public int getEng() 
		{
			return eng;
		}




		public void setEng(int eng) 
		{
			this.eng = eng;
		}




		public int getMath() 
		{
			return math;
		}




		public void setMath(int math) 
		{
			this.math = math;
		}




		public int getSum() 
		{
			return sum;
		}




		public void setSum(int sum) 
		{
			this.sum = sum;
		}




		public double getAvg()
		{
			return avg;
		}




		public void setAvg(double avg)
		{
			this.avg = avg;
		}




		public String getHak() 
		{
			return hak;
		}




		public void setHak(String hak) 
		{
			this.hak = hak;
		}
		
}
