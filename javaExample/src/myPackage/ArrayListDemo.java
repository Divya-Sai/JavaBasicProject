package myPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Sai");
		arr.add("Roshita");
		arr.add("Srinivasa");

		// System.out.println(arr);
		for (String str : arr) {
			System.out.println(str);
		}

		arr.add("BabyOfDivya&SaiBhaskar");
		for (String st : arr) {
			System.out.println(st);
		}

		System.out.println(arr);

		arr.add(0, "BornOn14Feb");
		System.out.println(arr);

		arr.remove(4);
		System.out.println(arr);
		System.out.println("===============");

		ArrayList al = new ArrayList();
		al.add(14);
		al.add("Feb");

		// System.out.println(al);


		for(Object a :al) { System.out.println(a); }


	}

}
