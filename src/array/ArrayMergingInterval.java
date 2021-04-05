package array;

import java.util.ArrayList;

public class ArrayMergingInterval {

	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(7, 9));
		Interval toInsert=new Interval(4, 6);
		
		ArrayMergingInterval obj = new ArrayMergingInterval();
		System.out.println(obj.insert(intervals, toInsert));
	}
	
	ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval toInsert){
		
		if(intervals == null) {
			intervals = new ArrayList<>();
			intervals.add(toInsert);
			return intervals;
		}else if(intervals.size() ==0) {
			intervals.add(toInsert);
			return intervals;
		}
		
		int i=0;
		Interval currInterval=null; 
		while(i<intervals.size()) {
			currInterval = intervals.get(i);
			
			if(toInsert.start > currInterval.end) {
				i++;
				continue;
			}else if(toInsert.end < currInterval.start) {
				intervals.add(i, toInsert);
				break;
			}else {
				toInsert.start = Math.min(currInterval.start, toInsert.start);
				toInsert.end = Math.max(currInterval.end, toInsert.end);
				intervals.remove(i);
			}
		}
		
		if(i==intervals.size()) {
			intervals.add(toInsert);
		}
		return intervals;
	}
}

class Interval{
	int start;
	int end;
	
	public Interval() {
	}

	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
}
