package com.naver.lang.ex1;

public class Phone
{
	private int price;
	private int size;

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	// equals 메서드 오버라이딩
	// 각 멤버의 값이 같으면 true, 하나라도 틀리면 false 리턴
//	public String toString()
//	{
//		return "Phone에서 Overriding 함";
//	}

	@Override
	public boolean equals(Object obj) // obj = p2
	{
		Phone phone = (Phone) obj;
		// this.getPrice() = phone.getPrice(); // this==p1
		boolean ch = false;
		if (this.getPrice() == phone.getPrice() && this.getSize() == phone.getSize())
		{
			ch = !ch;
		}

		return ch;
	}
}
