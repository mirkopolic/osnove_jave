package v_15_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<String> bookmarks = new ArrayList<>();
		bookmarks.add("Apps");
		bookmarks.add("YouTube");
		bookmarks.add("Google");
		bookmarks.add("Gmail");
		bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
		bookmarks.add("Confluence");
		bookmarks.add("JIRA");
		bookmarks.add("Bitbucket");
		bookmarks.add("Google Calendar");
		bookmarks.add("Timesheet");
		bookmarks.add("Google Drive");
		bookmarks.add("IX CIKLUS");

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite sirinu pretrazivaca: ");
		int sirinaPretrazivaca = s.nextInt();
		int brojTabova = 0;
		int popunjenaSirina = 0;

		if (sirinaPretrazivaca >= bookmarks.get(0).length()) {
			popunjenaSirina = bookmarks.get(0).length();
			brojTabova++;
		}
		while (popunjenaSirina + 5 + bookmarks.get(brojTabova).length() <= sirinaPretrazivaca && brojTabova < bookmarks.size()) {
			popunjenaSirina += 5 + bookmarks.get(brojTabova).length();
			brojTabova++;
		}
		System.out.println();
		for (int i = 0; i < brojTabova; i++) {
			System.out.print(bookmarks.get(i) + "     ");
		}

//-----------------------------------------------------------		
		s.close();
		System.out.println();
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

}
