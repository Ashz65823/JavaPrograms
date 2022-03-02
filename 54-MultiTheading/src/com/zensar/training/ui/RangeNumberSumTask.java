package com.zensar.training.ui;

public class RangeNumberSumTask implements Runnable{
	
	int start;
	int end;
	
	public RangeNumberSumTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		int sum=0;
		for(int i=start;i<=end;i++)
		{
		sum=sum+i;
		System.out.println(Thread.currentThread().getName()+":"+sum);
		}
		
	}

}
