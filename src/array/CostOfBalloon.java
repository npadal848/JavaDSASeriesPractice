package array;

import java.io.*;
import java.util.*;

public class CostOfBalloon {

	public static void main(String[] args) {
		FirstReader reader = new FirstReader();
		int t = reader.nextInt();

		int noOfPaticipant = 0;
		LinkedHashMap<BalloonCost, LinkedList<Status>> map = new LinkedHashMap<>();
		while (t-- > 0) {

			BalloonCost cost = new BalloonCost(reader.nextInt(), reader.nextInt());
			noOfPaticipant = reader.nextInt();

			if (noOfPaticipant == 0) {
				System.out.println(0);
			}
			LinkedList<Status> list = new LinkedList<>();

			while (noOfPaticipant-- > 0) {
				list.add(new Status(reader.nextInt(), reader.nextInt()));
			}
			map.put(cost, list);
		}

		for (BalloonCost cost : map.keySet()) {
			LinkedList<Status> list = map.get(cost);
			int totalCost1 = 0;
			int totalCost2 = 0;
			for (int i = 0; i < list.size(); i++) {
				Status status = list.get(i);
				if (status.a == 1) {
					totalCost1 = totalCost1+cost.gBallooncost;
				}
				if (status.b == 1) {
					totalCost1 = totalCost1+cost.pBallooncost;
				}
				
				if (status.a == 1) {
					totalCost2 = totalCost2+cost.pBallooncost;
				}
				if (status.b == 1) {
					totalCost2 = totalCost2+cost.gBallooncost;
				}
			}
			if(totalCost1<totalCost2) {
				System.out.println(totalCost1);
			}else {
				System.out.println(totalCost2);
			}
		}

	}

	static class BalloonCost {
		int gBallooncost = 0;
		int pBallooncost = 0;

		public BalloonCost() {
		}

		public BalloonCost(int gBallooncost, int pBallooncost) {
			this.gBallooncost = gBallooncost;
			this.pBallooncost = pBallooncost;
		}
	}

	static class Status {
		int a = 0;
		int b = 0;

		public Status() {
		}

		public Status(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	static class FirstReader {

		BufferedReader br;
		StringTokenizer st;

		public FirstReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
