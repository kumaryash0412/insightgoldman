package org.test.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import org.test.project.domain.StringOp;
import org.test.project.repo.StringOpJPAData;

import java.util.Optional;

@Service
public class StringOpService {
	@Autowired
	StringOpJPAData data;

	@Cacheable("student")
	public StringOp getLongestPalindrome(String input) {

		System.out.println("Not in Cache. Searching in DB  : " + input);
		Optional<StringOp> dbEntity = data.findById(input);
		if(dbEntity.isPresent())
			return dbEntity.get();
		System.out.println("Not in DB.Calculation needed for  : " + input);

		String output=longestPalindromeSubstring(input);
		return data.save (new StringOp(input, output));
		
	}



	static public String longestPalindromeSubstring(String _str_) {

		if (_str_ == null || "".equals(_str_)) {
			return _str_;
		}

		int N = _str_.length();
		char[] arr = _str_.toCharArray();
		String ans = "" + arr[0];
		int max = 0;

		boolean[][] palindromMatrix = new boolean[N][N];

		for (int j = 0; j < N; j++) {

			for (int i = 0; i <= j; i++) {

				if (i == j) {
					palindromMatrix[i][j] = true;
					continue;
				}
				boolean flag = arr[i] == arr[j];

				int len = j - i;
				palindromMatrix[i][j] = len > 2 ? palindromMatrix[i + 1][j - 1] && flag : flag;

				if (palindromMatrix[i][j] && len + 1 > max) {
					max = len + 1;
					ans = _str_.substring(i, j + 1);
				}
			}
		}
		return ans;
	}


}
